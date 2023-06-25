package com.springboot.learning.springbootDemo.src.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;


public class WriterController {

    @Autowired
    @Qualifier("regular")
    TextWriter text;
//    public WriterController(TextWriter text){
//       this.text = text;
//    }

    @RequestMapping("/text")
    public String index(){
        return text.writeText("hi folks!");
    }
}
