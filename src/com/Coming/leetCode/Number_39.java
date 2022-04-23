package com.Coming.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Coming
 * @date 2022/3/1 8:37
 */
public class Number_39 {
    public static void main(String[] args) {
        System.out.println(manyTimes(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }

    public static  Integer manyTimes(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i :nums){
            if (!hashMap.containsKey(i)){
                hashMap.put(i,1);
            }else {
                Integer value = hashMap.get(i);
                hashMap.remove(i);
                hashMap.put(i,value+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }

}
