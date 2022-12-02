package com.demo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dragon")
public class SlyDragonQuest implements  Quest{
    public String goQuest(){
        return "Knight killed the dragon.";
    }

}
