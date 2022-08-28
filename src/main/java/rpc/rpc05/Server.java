package rpc.rpc05;

import rpc.common.IUserService;
import rpc.entity.User;
import rpc.rpc01.UserServiceImpl;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Server {
    private static boolean running = true;

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (running) {
            Socket accept = serverSocket.accept();
            process(accept);
            accept.close();
        }
        serverSocket.close();
    }

    private static void process(Socket s) throws Exception {
        InputStream in = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();
        ObjectInputStream ois = new ObjectInputStream(in);

        String methodName = ois.readUTF();
        Class[] parameterTypes = (Class[]) ois.readObject();
        Object[] args = (Object[]) ois.readObject();

        IUserService service = new UserServiceImpl();
        Method method = service.getClass().getMethod(methodName, parameterTypes);
        User user = (User) method.invoke(service, args);

        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(user);
        oos.flush();
    }
}