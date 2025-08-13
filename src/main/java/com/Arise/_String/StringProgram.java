package com.Arise._String;

import java.util.*;

public class StringProgram {

    private static void program1(){
        String s = "programming";
        int cnt = 0;
        Map<Character,Integer> map = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println(map);

    }


    private static void program2(){
        String s = "markram";
        String t = "";
        for(int i=s.length()-1;i>=0;i--){
            t = t+s.charAt(i);
        }

        System.out.println(s.equals(t));
    }

    private static void program3(){
        String s = "java";
        String t = "";
        for(int i=s.length()-1;i>=0;i--){
            t = t+s.charAt(i);
        }
        System.out.println(t);
    }

    private static void program4(){
        String s = "Hello world";
        String[] ar = s.split(" ");
        System.out.println(ar.length);
    }

    private static void program5(){
        String s = "java";
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }

    }


    private static void program6(){
        String s = "java programming";;
        String[] words = s.split(" ");
        String res = "";
        for(int i=0;i<words.length;i++){
            String t = words[i];
            String a = "";
            for(int j=t.length()-1;j>=0;j--){
                a = a+t.charAt(j);
            }
            res = res+" "+a;
        }
        System.out.println(res);
    }

    private static void program7(){
        String s = "java";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }

        String t = "";
        for(int i=0;i<st.size();i++){
            t =t + st.pop();
        }
        System.out.println(t);
    }

    private static void program8(){
        String s = "programming";
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
                break;
            }else{
                set.add(s.charAt(i));
            }
        }
    }

    private static void program9(){
        String[] ar = {"cat","cable","camera"};
        String lcp = ar[0];
        for(int i=1;i<ar.length;i++)
        {
            String word = ar[i];
            int j=0;
            while(j<word.length() && j<lcp.length() && word.charAt(j) == lcp.charAt(j)){
                j++;
            }
            lcp = word.substring(0,j);
        }
        System.out.println(lcp);

    }

    private static void program10(){
        String s1 = "car";
        String s2 = "rac";
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        System.out.println(Arrays.equals(ar1,ar2));
    }

    public static void main(String[] args) {

        program1(); // count occurences of each character in the String.
        program2(); // palindrome of not
        program3(); // reverse a String.
        program4(); // count no.of words in the String.
        program5(); // duplicate character in the String.
        program6(); // reverse a each word in the String
        program7(); // reverse a STring using Stack.
        program8(); // find first non repeating character in the String.
        program9(); // longest common prefix amongest on Array of String.
        program10(); // valid anagram
    }
}
