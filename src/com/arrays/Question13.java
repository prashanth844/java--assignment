package com.arrays;

import java.util.*;

public class Question13 {
    public static int findElement(int []arr){
        Set<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        return list.get(list.size() - 2);
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,6,9};
        System.out.println(findElement(arr));
    }
}
