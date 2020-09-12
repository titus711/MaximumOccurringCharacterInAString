package com.titoacademy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = " GOD_BLESS_SPIDERMAN";
        char [] myChar = myString.toCharArray();
        Map<Character,Integer> myMap = new LinkedHashMap<>();

        for (int i = 0; i < myChar.length;i++){
            if (myMap.containsKey(myChar[i]) == false){
                myMap.put(myChar[i],1);
            } else{
                myMap.put(myChar[i],myMap.get(myChar[i]) + 1);
            }
        }

        Set<Map.Entry<Character,Integer>> myEntireEntrySet = myMap.entrySet();
        char maxKey = ' ';
        int maxValue = 0;
        for (Map.Entry<Character,Integer> mySingleEntry : myEntireEntrySet){
            if (mySingleEntry.getValue() > maxValue){
                maxValue = mySingleEntry.getValue();
                maxKey = mySingleEntry.getKey();


            }


        }
        System.out.println(maxKey + " " + maxValue);


    }
}
