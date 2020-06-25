package epam;
import java.util.*;
import java.util.stream.IntStream;

public class Palindrome {
    public static void checkPalindrome(List<String> l)
    {
        List<String> l1  = new ArrayList<String>();
        for(String i:l)
        {
            String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l1.add(i);
        }
        System.out.println("Palindrome Strings are: "+l1);
    }
    public static void main(String[]args)
    {
        List<String> list = new ArrayList<String>();
        list.add("ally");
        list.add("battery");
        list.add("alla");
        list.add("ababa");
        checkPalindrome(list);
    }
}
