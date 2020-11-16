package com.adaidam;

import java.util.HashMap;
import java.util.Map;

/**Given an array of strings, return a Map<String, Integer>
 containing a key for every different string in the array,
 and the value is that string's length.
 */

public class StringArraytoHashMap {

    public static Map<String,Integer> wordLen(String[] strings){

        //create a new HashMap to hold the keys(strings) and values(string length)
        HashMap<String, Integer> map = new HashMap();

        //iterate through the string array
        for (String str: strings) {
            //put the key,value pairs into the hashmap you initialized
            map.put(str,str.length());
        }
        //return the completed map
        return map;
    }
    public static void main(String[] args) {
        String[] strings = {"this","that","and", "the", "third"};
        String[] names = {"Awushie", "Jade", "Kofi", "Crystal", "Pierre"};
        System.out.println(wordLen(strings));
        System.out.println(wordLen(names));
    }
}
