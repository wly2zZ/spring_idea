package com.gcu.Impl;

import com.gcu.dao.IService;

public class ServiceImplA implements IService {


    public void service(String name) throws Exception {
        System.out.println("ServiceImplA name"+name);
    }
}
