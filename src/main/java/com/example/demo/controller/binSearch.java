package com.example.demo.controller;

public class binSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8,9,10};
        System.out.println(binarySearch(3,array));
        System.out.println(binarySearch2(3,array,0,array.length-1));


    }
    public static int binarySearch(int key, int[] array){
        int low = 0;
        int hight = array.length - 1;
        int middle = 0;
        while(low <= hight){
            middle = (low + hight)/2;
            if(middle < key){
                low = middle + 1;
            }else if(middle > key){
                hight = middle - 1;
            }else{
                return array[middle];
            }
        }
        return -1;

    }
    public static int binarySearch2(int key,int[] array,int low,int high){
        int middle = (low +high)/2;
        if(array[middle]>key){
            return binarySearch2(key,array,low,middle -1);
        }else if(array[middle]<key){
            return binarySearch2(key,array,middle +1,high);
        }else{
            return -1;
        }
    }
}
