package com.Arise.Array;

import javax.sound.midi.SysexMessage;
import java.awt.*;
import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class program1 {

    private static void program1(){
        int[] ar = {1,2,3,1,2,34,3,2,1};
        int largest = ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i] > largest){
                largest = ar[i];
            }
        }

        int smallest = ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i] < smallest){
                smallest = ar[i];
            }
        }

        System.out.println(largest +" "+ smallest);
    }

    private static void program2(){
        int[] ar = {1,2,3,4,2,1,43,21,12};
        int largest = ar[0];
        int sLargest = -1;
        for(int i=0;i<ar.length;i++){
            if(ar[i] > largest){
                sLargest = largest;
                largest = ar[i];
            }else if(ar[i] > sLargest && ar[i] != largest){
                sLargest = ar[i];
            }
        }

        System.out.println(sLargest);
    }

    private static void program3(){
        int[] ar = {1,2,1,2,3,1,2};
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<ar.length;i++){
            set.add(ar[i]);
        }

        for(int x : set){
            System.out.print(x+" ");
        }
    }

    private static void program4(){
        int[] ar = {1,2,3,4,5};
        for(int i=1;i<ar.length;i++){
            if(ar[i] > ar[i-1]){

            }else{
                System.out.println(false);
            }
        }
        System.out.println(true);
    }

    private static void program5(){
        int[] ar = {1,2,3,4,5};
        int low = 0;
        int high = ar.length-1;
        while(low < high){
            int temp = ar[low];
            ar[low] = ar[high];
            ar[high] = temp;
            low++;
            high--;
        }

        for(int x : ar){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void program6(){
        int[] ar = {23,12,43,12,134,12};
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i] > ar[j]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        for(int x : ar){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void program7(){
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {2,3,4,5,6,7};

        List<Integer> li = new ArrayList<>();
        for(int x : ar1) li.add(x);
        for(int x : ar2) li.add(x);
        Collections.sort(li);

        for(int x : li){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    private static void program8(){
        int[] ar = {1,2,3,4,5};
        int k = 3;
        int n = ar.length;
        k = k%n;
        reverse(ar,0,k-1);
        reverse(ar,k,n-1);
        reverse(ar,0,n-1);

        for(int x : ar){
            System.out.println();
        }
    }

    private static void reverse(int[] ar,int start,int end){
        while(start < end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }

    private static void program9(){
        int[] ar = {0,1,2,0,123,032,0,12,0,2,0};
        int j = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] !=0){
                ar[j] = ar[i];
            }
        }

        while(j < ar.length){
            ar[j] = 0;
        }

        for(int x : ar){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void program10(){
        int[] ar = {1,2,4,5};
        int n = ar.length+1;
        int sum = n*(n+1)/2;
        int cnt = 0;
        for(int i=0;i<ar.length;i++){
            cnt+=ar[i];
        }

        System.out.println(sum-cnt);
    }
    public static void main(String[] args) {

        program1(); // Find largest and smallest element
        program2(); // second largest element in the array.
        program3(); // Remove duplicates from the array.
        program4(); // check if the array is sorted
        program5(); // reverse the array
        program6(); // sort the array.
        program7(); // merge two sorted Array.
        //program8(); // rotate array by k places
        //program9(); // move all zeros to end of the array
        program10(); // Find the missing number in the array
    }
}
