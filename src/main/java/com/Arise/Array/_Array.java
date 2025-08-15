package com.Arise.Array;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class _Array {

    private static void program1(){
        int[] ar = {1,2,2,3,4,5};
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<ar.length;i++){
            if(set.contains(ar[i])){
                System.out.print(ar[i]+" ");
            }else{
                set.add(ar[i]);
            }
        }
        System.out.println();
    }

    private static void program2(){
        int[] ar = {1,2,3,4,5,6,7};
        int target = 9;

        int left = 0;
        int right = ar.length-1;
        while(left <= right){
            if(ar[left] + ar[right] == target){
                System.out.println(left+" "+right);
                break;
            }else if(ar[left] + ar[right] > target){
                right--;
            }else{
                left++;
            }
        }
    }

    private static void program3(){
        int[] ar1 = {1,5,10,20,40,80};
        int[] ar2 = {6,7,20,80,100};
        int x=0,y=0;
        while(x< ar1.length && y<ar2.length){
            if(ar1[x] == ar2[y]){
                System.out.print(ar1[x]+" ");
                x++;
                y++;
            }else if(ar1[x] > ar2[y]){
                y++;
            }else{
                x++;
            }
        }
        System.out.println();
    }

    private static void program4(){
        int[] ar = {0,1,0,1,0,0,1};

        int j=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] == 0){
                ar[j++] = ar[i];
            }
        }
        while(j<ar.length) ar[j++] = 1;

        for(int x : ar) System.out.print(x+" ");
        System.out.println();
    }

    private static void program5(){
        int[] ar = {1,1,1,2,3,4,123,1,2,1,2,3412,12,3,12,123,12};
        Set<Integer> set = new TreeSet<>();
        for(int x : ar) set.add(x);

        set.forEach(x -> System.out.print(x+" "));
        System.out.println();
    }

    private static void program6(){
        int[] ar = {12,32,123,123,12,34,54,234,654};
        int temp,j;
        for(int i=1;i<ar.length;i++){
            temp = ar[i];
            j = i-1;
            while(j>=0 && temp<ar[j]){
                ar[j+1] = ar[j];
                j = j-1;
            }
            ar[j+1] = temp;
        }

        for(int x : ar) System.out.print(x+" ");
        System.out.println();
    }

    private static void program7(){
        int[] ar = {1,2,3,43,4,5,5,5,53,12,3,3,1};
        int smallest = ar[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i] < smallest){
                secondSmallest = smallest;
                smallest =ar[i];
            }else if(ar[i] < secondSmallest && ar[i]!=smallest){
                secondSmallest = ar[i];
            }
        }
        System.out.println(secondSmallest);
    }

    private static void program8(){
        int[] ar = {7,9,5,6,13,12};
        int max = 0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i] < ar[j]){
                    max = Math.max(max,ar[j]-ar[i]);
                }
            }
        }
        System.out.println(max);
    }

    private static void program9(){
        int[] ar = {1,2,3,4,4,3,2,2,1,3,3};
        int smallest = ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i] < smallest){
                smallest = ar[i];
            }
        }
        System.out.println(smallest);
    }

    private static void program10(){
        int[] ar = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] < min){
                min = ar[i];
            }
            if(ar[i]-min > max){
                max = ar[i]-min;
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {

        program1();// find duplicate in the Array.
        program2(); // two sum.
        program3(); // find common element in the sorted array.
        program4(); // segerate 0'2 and 1's
        program5(); // remove duplicate from the array.
        program6(); // insertion sort
        program7(); // second smallest element in the array.
        program8(); // Find max difference between two array element.
        program9(); // find the smallest element in the sorted array.
        program10(); // best time to sell and buy.

    }
}
