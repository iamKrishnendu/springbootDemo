package com.springboot.learning.springbootDemo.src.learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fancy")
public class Facywriter implements TextWriter{

    public String writeText(String s){
        return s + " fancy Text";
    }
}
