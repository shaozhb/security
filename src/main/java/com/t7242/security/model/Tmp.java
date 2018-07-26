package com.t7242.security.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Tmp {

    public static void main(String[] args){
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        String mi=bCryptPasswordEncoder.encode("shaozhb");
        System.out.println(mi) ;

    }
}
