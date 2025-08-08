package com.Arise._String;

import java.net.Inet4Address;
import java.util.*;

public class progarm1 {

    private static void program1(){

        String s1 = "racecar";
        String s2 = "carrace";
        char[] ar1= s1.toCharArray();
        char[] ar2 =s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        System.out.println(Arrays.equals(ar1,ar2));
    }

    private static void program2(){
        String s = "programming";
        String t = "";
        for(int i=s.length()-1;i>=0;i--){
            t = t+s.charAt(i);
        }

        System.out.println(t);
    }

    private static void program3(){
        String s = "racecar";
        int low =0 ;
        int high  =s.length()-1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                System.out.println(false);
                break;
            }else{
                low++;
                high--;
            }
        }
        System.out.println(true);
    }

    private static void program4(){
        String s = "programming";
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
            }else{
                consonant++;
            }
        }
        System.out.println(vowel+" "+consonant);
    }

    private static void program5(){
        String s = "programming";
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        System.out.println(set);
    }

    private static void program6(){
        String s = "hello from the world";
        String t = s.replaceAll(" ","%20");
        System.out.println(t);
    }

    private static void program7(){
        String s = "java";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(Map.Entry<Character, Integer> x : map.entrySet()){
            if(x.getValue()==1){
                System.out.println(x.getKey());
                break;
            }
        }
    }

    private static void program8(){
        String s = "programming";
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            cnt++;
        }
        System.out.println(cnt);
        //-or-
        //System.out.println(s.length());
    }

    private static void program9(){
        String s = "abcabcab";
        int n = s.length();
        int left =0,right=0,maxLength =0;
        HashSet<Character> set = new LinkedHashSet<>();
        while(right < n){

            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength,right-left+1);
            right++;
        }
        System.out.println(maxLength);
    }

    private static void program10(){
        String s = "programming";
        String t = "";
        for(int i=0;i<s.length();i++){
            t = t+(char)(s.charAt(i)-32);
        }
        System.out.println(t);
    }

    private static void program11(){
        String s = "PROGRRAMING";
        String t= "";
        for(int i=0;i<s.length();i++){
            t = t+(char)(s.charAt(i)+32);
        }
        System.out.println(t);
    }

    private static void program12(){
        String s = "programming";
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                System.out.print(ch+" ");
            }else{
                set.add(ch);
            }
        }
        System.out.println();
    }

    private static void program13(){
        String s = "java";
        String t = "java";
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) != t.charAt(j)){
                System.out.println(false);
            }else{
                i++;
                j++;
            }
        }
        System.out.println(true);
    }

    private static void program14(){
        String s = "java";
        int res = 0;
        for(int i=0;i<s.length();i++){
            System.out.print((int)s.charAt(i)+" ");
        }
        System.out.println();

    }

    private static void program15(){
        String s = "hello world";
        String t = "";
        t = t+(char)(s.charAt(0)-32);
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i)==' '){
                t = t+" "+ (char)(s.charAt(i+1)-32);
                i++;
            }else{
                t = t+s.charAt(i);
            }
        }
        System.out.println(t);
    }

    private static void program16(){
        String s = "james gosling founder of java";
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch==' '){
                cnt++;
            }
        }
        System.out.println(cnt+1);
        // -0r-
        String[] words = s.split(" ");
        System.out.println(words.length);
    }


    public static void main(String[] args) {

        program1(); //check if the two String are anagram
        program2(); // reverse a String.
        program3(); //check if the String is palindrome
        program4(); //count the number of vowels and consonants
        program5(); // remove all duplicates characters from a String.
        program6(); //Replace spaces with ‘%20’ in a string.
        program7(); // Find the first non-repeating character in the String.
        program8(); // count frequency of characters.
        program9(); //Find the longest subString without repeating characters.
        program10(); //convert lowercase to uppercase
        program11(); //convert uppercase to lowercase
        program12(); //find duplicate character in the String
        program13(); // check if the two STring are equals
        program14(); // convert String to integer
        program15(); // capatilize the first character of each word.
        program16(); // count words in the String.
    }
}
