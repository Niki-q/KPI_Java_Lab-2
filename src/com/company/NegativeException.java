package com.company;

import java.util.Objects;

public class NegativeException extends Throwable {
    public NegativeException(String s) {
        if (Objects.equals(s, "")){
            System.out.println("negatives not allowed");
        }
        System.out.println("negatives not allowed, values is :"+s);
    }
}
