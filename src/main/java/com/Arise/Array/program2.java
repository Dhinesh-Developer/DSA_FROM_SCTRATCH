package com.Arise.Array;

import java.awt.desktop.SystemEventListener;
import java.net.Inet4Address;
import java.util.*;

public class program2 {

    private static void program1(){

        int[] ar = {1,2,1,2,3123,1,12,32,1,1,2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i],map.get(ar[i])+1);
            }else{
                map.put(ar[i],1);
            }
        }

        System.out.println(map);
    }

    private static void program2(){
        int[] ar = {1,2,1,2,3,4,4,5,5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i],map.get(ar[i])+1);
            }else{
                map.put(ar[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> x  :map.entrySet()){
            if(x.getValue()==1){
                System.out.println(x.getKey());
                break;
            }
        }
    }

    private static void program3(){
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {1,2,3,4,5};

        System.out.println(Arrays.equals(ar1,ar2));
    }

    private static void program4(){
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {1,3,5,6,7};
        Set<Integer> set = new HashSet<>();
        for(int x : ar1) set.add(x);
        for(int x : ar2){
            if(set.contains(x)){
                System.out.print(x+" ");
            }else{
                set.add(x);
            }
        }
        System.out.println();
    }

    private static void program5(){
        int[] ar = {1,2,3,4,5};
        int target = 7;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i] + ar[j] == target){
                    System.out.println(ar[i]+ar[j]+" "+true);
                    break;
                }
            }
        }
    }

    private static void program6(){
        int[] ar = {1,23,3,4,5,2,3};
        int odd = 0;
        int even = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] %2==0 ) even++;
            else odd++;
        }
        System.out.println(odd+" "+even);
    }

    private static void program7(){
        int[] ar = {-1,3,4,-2,3,-2,3,-4};
        int[] res = new int[ar.length];
        int negIndex = 1;
        int posIndex = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] < 0){
                res[negIndex] = ar[i];
                negIndex +=2;
            }else{
                res[posIndex] = ar[i];
                posIndex +=2;
            }
        }

        for(int x : res){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void program8(){
        int[] ar = {1,2,34,5,6,5,4,3,2,3,4,5,6,7};
        int maxSum = 0;
        int cnt = 0;
        for(int i=0;i<ar.length;i++){
            cnt+=ar[i];
            if(cnt > maxSum){
                maxSum = cnt;
            }
            if(cnt < 0){
                cnt = 0;
            }
        }
        System.out.println(maxSum);
    }

    private static void program9(){
        int[] ar = {1,2,3,4,5};
        int mini = ar[0];
        int maxi = ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i] < mini) mini = ar[i];
            if(ar[i] > maxi) maxi = ar[i];
        }
        System.out.println(mini+" "+maxi);
    }

    private static void progarm10(){
        int[] ar = {1,2,3,4,5,4,3,2};
        for(int i=1;i<ar.length-1;i++){
            if((ar[i] > ar[i+1]) && (ar[i] > ar[i-1])){
                System.out.println(ar[i]);
            }
        }
    }

    private static void program11(){
        int[] ar = {1,2,3,4,5,1,2,3,4,5};
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<ar.length;i++){
            if(set.contains(ar[i])){
                System.out.println(ar[i]);
                break;
            }else{
                set.add(ar[i]);
            }
        }
    }

    private static void program12(){
        int[] ar = {1,2,3,2,1};
        int i=0;
        int j=ar.length-1;
        while(i < j){
            if(ar[i] != ar[j]){
                System.out.println(false);
            }
            i++;
            j--;
        }
        System.out.println(true);
    }

    private static void program13(){
        int[] ar = {1,2,3,4,23,1,12,1};
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

    private static void program14(){
        int[] ar = {0,1,0,1,1,0,0,0,0,1,1,0};
        int ones = 0;
        int zeros = 0;
        for(int x : ar){
            if(x==0) zeros++;
            else ones++;
        }

        for(int i=0;i<ar.length;i++){
            if(zeros > 0){
                ar[i] =0;
                zeros--;
            }
            else if(ones > 0){
                ar[i] =1;
                ones--;
            }
        }

        for(int x : ar){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    private static void program15(){
        int[] ar = {1,2,3,4,5,4,3,2};
        List<Integer> li = new ArrayList<>();
        int maxi = ar[ar.length-1];
        li.add(maxi);
        for(int i=ar.length-2;i>=0;i--){
            if(ar[i] > maxi){
                li.add(ar[i]);
                maxi = ar[i];
            }
        }
        System.out.print(li);
    }

    public static void main(String[] args) {

        program1(); // Find frequency of each character
        program2(); //Find the element that appears only once.
        program3(); //check if the two array are equal
        program4(); //Find the common element in two array
        program5(); //Two sum
        program6(); //count number of even and odd numbers
        program7(); //rearrange element in postitive and negative elements
        program8(); // Find the subarray with maximum sum
        program9(); // Find minimum and Maximum in single pass
        progarm10(); //Find the peak element in the array.
        program11(); // find the first repeating element.
        program12(); // check if the array is palindrome.
        program13(); //Find the duplicate number.
        program14(); //segrate 0'2 and 1's
        program15(); //find the leaders in the array
    }
}
