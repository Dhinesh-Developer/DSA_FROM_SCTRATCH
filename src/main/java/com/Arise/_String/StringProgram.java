package com.Arise._String;

import javax.sound.midi.SysexMessage;
import java.net.Inet4Address;
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

    private static void program11(){
        String s = "abcabcbb";
       Set<Character> set = new HashSet<>();
       int maxCount = 0,i=0,j=0;
       int n = s.length();
       while(i <n && j<n){
           if(!set.contains(s.charAt(j))){
               set.add(s.charAt(j));
               j++;
           }else{
               set.remove(s.charAt(i));
               i++;
           }
       }
        System.out.println(maxCount);
    }

    private static void program12(){
        String s = "abbaca";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        for(Character x : st){
            sb.append(x);
        }
        System.out.println(sb);
    }

    private static void program13(){
        String str1 = "ade";
        String str2 = "abcdefgh";
        int i=0,j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            if(str1.length()==i) System.out.println(true);
            j++;
        }
       // System.out.println(false);
    }

    private static void program14(){
        String s = "teee";
        StringBuilder res = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character> li = new ArrayList<>(map.keySet());
        li.sort((a,b) -> {
            int cmp = map.get(b) - map.get(a);
            return (cmp!=0) ? cmp:Character.compare(a,b);
        });

        for(char c : li){
            for(int i=0;i<map.get(c);i++){
                res.append(c);
            }
        }
        System.out.println(res);
    }

    private static void program15(){
        String s = "{()}[]";
        Stack<Character> st = new Stack<>();
        for(int i=0;i< s.length();i++){
            if(s.charAt(i) =='{' || s.charAt(i) =='[' || s.charAt(i) =='('){
                st.push(s.charAt(i));
            }else if(!st.isEmpty() && (s.charAt(i) ==']' && st.peek()=='[')
            || (s.charAt(i) =='}' && st.peek()=='{') ||
                    (s.charAt(i) ==')' && st.peek()=='(')){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(st.isEmpty());
    }

    private static void program16(){
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        String s = "XI";
        int res = 0;
        for(int i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                res = res + map.get(s.charAt(i));
            }else{
                res = res - map.get(s.charAt(i));
            }
        }
        res = res + map.get(s.charAt(s.length()-1));
        System.out.println(res);
    }

    private static void program17(){
        String s = "java";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> x : map.entrySet()){
            if(x.getValue()==1){
                System.out.println(x.getKey());
                break;
            }
        }
    }

    private static void program18(){
        String[] s = {"eat","tea","tan","ate","net","bat"};
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String x : s){
            char[] ar = x.toCharArray();
            Arrays.sort(ar);
            String key = new String(ar);
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

        // string program
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


        program11(); // longest substring without repeating character.
        program12(); // remove all adjacent duplicatess from a String.
        program13(); // check if the str1 is a substring of str2.
        program14(); // sort based on the frequency
        program15(); // valid paranthesis
        program16(); // Roman to integer.
        program17(); // First unique character in the String.
        program18(); // Group anagram together.

    }
}
