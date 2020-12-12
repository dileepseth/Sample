package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {

    public static void countS(String s){
        Map<Character,Integer> m = new HashMap<>();
        /*for(int i =0;i<s.length();i++){
            String word= s.charAt(i)+"";
            m.put(word,m.get(word)==null?1:m.get(word)+1);
        }*/
       // m = s.chars().collect(Collectors.toMap(k-> 1,v -> 1, Integer::sum));
       // System.out.println(m);

        //
        Supplier<String>  supplier=()->"dileep";
        System.out.println(supplier.get());

    }

    public static void main(String[] args) {
     String s= "010110101";
     countS(s);

    }
}
