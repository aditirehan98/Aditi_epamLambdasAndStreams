package epam;
import java.util.*;
import java.util.stream.IntStream;
public class AverageOfList {
public static void main(String[]args)
{
    IntStream stream = IntStream.of(2, 4, 10, 5, 9, 8, 7, 15);
    OptionalDouble obj = stream.average();
    if (obj.isPresent()) {
        System.out.println("Average of the list is : "+ obj.getAsDouble());
    }
    else {
        System.out.println("-1");
    }

}
}

