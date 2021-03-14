package com.gcu.AOP;

import com.gcu.dao.IService;
import com.gcu.Impl.ServiceImplA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理对象
public class DynaProxyServiceA implements InvocationHandler {
    private Object target;//目标对象
    public Object bind(Object object){
        this.target = object;
        Object obj = Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
        return obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
        Object result = null;
        System.out.println("method:"+method);
        System.out.println("target:"+target);
        System.out.println("log start");
        try{
            result = method.invoke(this.target,args);
        }
        catch (Exception e){
            throw e;
        }
        System.out.println("log end");
        return result;
    }

    public static void main(String[] args) throws Exception{
        IService service = (IService) new DynaProxyServiceA().bind(new ServiceImplA());
        service.service("CYW");
    }
}
