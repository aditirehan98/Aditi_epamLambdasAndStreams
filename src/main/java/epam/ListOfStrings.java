package epam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListOfStrings {
public static void checkPalindrome(Stream<String> st)
{
    st.filter(s->s.startsWith("a")).filter(s->s.length()==3).peek(s->System.out.println(s)).count();
}
    public static void main(String[]args)
    {
        Stream<String> st = Stream.of("abc","ape","battery","bring");
checkPalindrome(st);
    }
}
