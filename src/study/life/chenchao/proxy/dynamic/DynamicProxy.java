package study.life.chenchao.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by chenchao on 2017/5/6.
 */
public class DynamicProxy implements InvocationHandler {

    private static MartRequest sMartRequest;

    public static MartRequest instance() {
        if (sMartRequest == null) {
            sMartRequest = callDynamicProxy();
        }

        return sMartRequest;
    }

    private static MartRequest callDynamicProxy() {
//        System.out.println("------- dynamic -------");
        MartRequest requestSubject = (MartRequest) Proxy.newProxyInstance(MartRequest.class.getClassLoader(),
                new Class[] { MartRequest.class }, new DynamicProxy());
        return requestSubject;
    }

    MartRequest martRequest;

    public DynamicProxy() {
        martRequest = new RealMartRequest();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(martRequest, args);
        return result;
    }
}
