package com.gcu.bean;

import com.gcu.dao.IAir;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("person")
public class Person {

    public Person(){

    }
    //    @Autowired
//    @Qualifier("cleanAir")
    @Resource(name = "cleanAir")
    IAir air;
    public  void Breath(){
        System.out.println(this.air.toString());
    }

}