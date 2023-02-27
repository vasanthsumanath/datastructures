package anagram;

import java.util.HashMap;
import java.util.Map;

/*
    T -> O(n)
    S -> O(n)
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character,Integer> chkExistence= new HashMap<>();

        for(int i=0;i<s.length();i++){

            Integer existance = chkExistence.getOrDefault(s.charAt(i),0);

            existance = existance + 1;

            if (existance==0){
                chkExistence.remove(s.charAt(i));
            } else {
                chkExistence.put(s.charAt(i),existance);
            }

            existance = chkExistence.getOrDefault(t.charAt(i),0);

            existance = existance - 1;

            if (existance==0){
                chkExistence.remove(t.charAt(i));
            } else {
                chkExistence.put(t.charAt(i),existance);
            }

        }

        return chkExistence.isEmpty();

    }
}
