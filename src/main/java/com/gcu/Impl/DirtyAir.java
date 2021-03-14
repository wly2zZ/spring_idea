package com.gcu.Impl;

import com.gcu.dao.IAir;
import org.springframework.stereotype.Component;

@Component("dirtyAir")
public class DirtyAir implements IAir {
    @Override
    public String toString() {
        return "DirtyAir";
    }
}
