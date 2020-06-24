package com.myth.utils;

import java.util.UUID;

/**
 * @author myth
 * @Date 2020-06-17 12:29
 */
public class IDUtil {
    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
