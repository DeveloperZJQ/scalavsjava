package rpc.rpc04;

import rpc.common.IUserService;
import rpc.entity.User;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * 而且client的调用显得不是很合理（Stub里只有findById的代码），如果有个findByName的新方法，那么就又得重新改进
 * 下面这种写法解决了方法增加的问题
 *
 * @author happy
 * @since 2022/8/28
 */
public class Stub {
    public static IUserService getStub() {
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = new Socket("127.0.0.1", 8888);
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                // 方法名
                String methodName = method.getName();
                // 参数类型
                Class<?>[] parameterTypes = method.getParameterTypes();
                oos.writeUTF(methodName);
                oos.writeObject(parameterTypes);
                oos.writeObject(args);
                oos.flush();

                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                int id = dataInputStream.readInt();
                String name = dataInputStream.readUTF();
                User user = new User(id, name);
                oos.close();
                socket.close();
                return user;
            }
        };
        Object o = Proxy.newProxyInstance(IUserService.class.getClassLoader(), new Class[]{IUserService.class}, h);
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getInterfaces()[0]);
        return (IUserService) o;
    }
}
