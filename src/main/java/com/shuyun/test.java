package com.shuyun;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class test {

@GetMapping("/hello")
    public String tes(){
        System.out.println("hell0");
        return "hello";

    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("h");
    }

}
