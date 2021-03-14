package com.gcu.Impl;

import com.gcu.dao.IAir;
import org.springframework.stereotype.Component;

@Component("cleanAir")
public class CleanAir implements IAir {
    @Override
    public String toString() {
        return "CleanAir";
    }
}
