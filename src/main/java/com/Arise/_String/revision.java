package com.Arise._String;

import java.util.*;

public class revision {

    private static void program1(){
        String s = "dhineshkumar";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
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
        String s = "hello world";
        System.out.println(s.split(" ").length);
    }

    private static void program5(){
        String s = "java";
        Set<Character> set = new TreeSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }

    }

    private static void program6(){
        String s = "hello world";
        String[] ar = s.split(" ");
        String revString = "";
        for(int i=0;i<ar.length;i++){
            String word = ar[i];
            String t = "";
            for(int j=word.length()-1;j>=0;j--){
                t = t+word.charAt(j);
            }
            revString = revString+t+" ";
        }
        System.out.println(revString);

    }

    private static void program7(){
        String s = "java";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> x : map.entrySet()){
            if(x.getValue() == 1){
                System.out.println(x.getKey());
                break;
            }
        }
    }

    private static void program8(){
        String[] ar = {"cat","cable","camera"};
        String lcp = ar[0];
        for(int i=1;i<ar.length;i++){
            String word = ar[i];
            int j=0;
            while(j<word.length() && j<lcp.length() && word.charAt(j) == lcp.charAt(j)){
                j++;
            }
            lcp = word.substring(0,j);
        }
        System.out.println(lcp);
    }

    private static void program9(){
        String s = "abcabcab";
        int maxCount =0,i=0,j=0;
        Set<Character> set = new TreeSet<>();
        int n = s.length();
        while(i < n && j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxCount  =Math.max(maxCount,j-i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println(maxCount);
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

    private static void program11(){
        String s = "abbaca";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        for(Character x : st) sb.append(x);
        System.out.println(sb.toString());

    }

    private static void program12(){
        String s1 = "ade";
        String s2 = "abcdefgh";
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            if(s1.length() == i) System.out.println(true);
            j++;
        }
        System.out.println(false);
    }

    private static void program13(){
        String s = "java";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> x : map.entrySet()){
            if(x.getValue()==1){
                System.out.println(x.getKey());
                break;
            }
        }
    }

    private static void program14(){
        String s = "{[]}()";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else if(!st.isEmpty() && (ch=='}' && st.peek()=='{') || (ch==']' && st.peek()=='[') || (ch==')' && st.peek()=='(')){
                st.pop();
            }
        }
        System.out.println(st.isEmpty());
    }

    private static void program15(){
        String[] ar = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new LinkedHashMap<>();
        for(String x : ar){
            char[] c = x.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(map.containsKey(key)){
                map.get(key).add(x);
            }else{
                List<String> li = new ArrayList<>();
                li.add(x);
                map.put(key,li);
            }
        }
        res.addAll(map.values());
        System.out.println(res);

    }


    public static void main(String[] args) {

        program1();// count occurences of each character in the String.
        program2(); // check whether the String is palindrome or not.
        program3(); // reverse a String
        program4(); // count the no.of words in the String.
        program5(); // find duplicate character in the String.
        program6(); //reverse each word in the String.
        program7(); // first non repeaing character in the String.
        program8();// longest common prefix
        program9(); // longest subString without repeating character.
        program10(); // valid anagram
        program11(); //remove all adjacent duplicate character from a String.
        program12(); // check if the str1 is a subsequence of str2.
        program13(); // find first unique character in the String.
        program14(); // valid paranthesis
        program15(); // Roman to integer

    }
}
