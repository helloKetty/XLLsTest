package test.proxyTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        // 目标对象
        IUserDao target = (IUserDao) Class.forName("test.proxyTest.UserDao").newInstance();
        // 【原始的类型 class UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstanceLambda();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
        //proxy.lala();
      Character [] s={'a','b'};

    }
}
