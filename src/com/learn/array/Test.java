package com.learn.array;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
            strList.add("helloworld");
            strList.add("rumoob");
            strList.add("csdn");

        System.out.println(strList.toString());
        System.out.println(strList.toString().substring(1,strList.toString().length()-1));


        String str = "helloworld,rumoob,csdn";

        System.out.println(str.lastIndexOf(","));

        String[] strArray = str.split(",");
        for (int i=0;i<strArray.length;i++)
                 System.out.println(strArray[i]);

    }
}
