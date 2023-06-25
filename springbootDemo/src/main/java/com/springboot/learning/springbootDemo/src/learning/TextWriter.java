package com.springboot.learning.springbootDemo.src.learning;

import org.springframework.stereotype.Component;

@Component
public interface TextWriter {

    public String writeText(String s);
}
