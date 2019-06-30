package Chapter1;

import java.util.HashSet;

public class IsUnique {
    public static boolean CheckString(String s){
        HashSet<Character> hset = new HashSet<Character>();
        for(Character i:s.toCharArray()){
            if(hset.contains(i))
                return false;
            hset.add(i);
        }
        return true;
    }



    public static void main(String args[]){

        String s1 = "hello";
        String s2 = "world";
        System.out.println(CheckString(s1));
        System.out.println(CheckString(s2));
    }
}
