package designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author happy
 * @since 2021-05-05
 */
public class JDKFuDao implements InvocationHandler {
    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<? extends IPerson> aClass = target.getClass();
        return (IPerson) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("双方同意，开始辅导");
    }

    private void after() {
        System.out.println("这里是C语言中文网辅导班，已经收集到您的需求，开始挑选老师");
    }
}
