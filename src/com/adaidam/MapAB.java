package com.adaidam;

import java.util.HashMap;
import java.util.Map;

/**
 *
 Modify and return the given map as follows:
 if the keys "a" and "b" are both in the map and have equal values, remove them both.


 mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
 mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
 mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */

public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> map){

        //if statement for checking a and b keys are present
        if (map.containsKey("a") && map.containsKey("b")){

            //if statement for checking the values of a and b are the same
            if(map.get("a").equals(map.get("b"))){
                //remove the key (and by default the value
                map.remove("a");
                map.remove("b");
            }
        } return map;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(){
            {
                put("a","aaaa");
                put("b","aaaa");
                put("c", "cake");
            }
        };

        Map<String, String> map2 = new HashMap<>(){
            {
                put("a","aaaa");
                put("b","bbb");
                put("c", "cake");
            }
        };

        Map<String, String> map3 = new HashMap<>(){
            {
                put("a","aaaa");
                put("b","bbbb");
                put("c", "aaaa");
            }
        };

        System.out.println(mapAB(map));
        System.out.println(mapAB(map2));
        System.out.println(mapAB(map3));
        }
}
