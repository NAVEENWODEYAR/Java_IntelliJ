// Java program to print the sum of the digits in an given list
package streamAPI;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SumofDigits
{
    public static void main(String[] args)
    {
        System.out.println("Prints the sum of the digits in the given list");
        List<Object> sum_OddNo = Collections.singletonList(List.of(1, 3, 5, 7, 9).stream().reduce((a, b) -> a + b));
        Optional<Integer> sum_OddNo1 = List.of(1, 3, 5, 7, 9).stream().reduce((a, b) -> a + b);
        System.out.println(sum_OddNo1.get());
        System.out.println(sum_OddNo);
    }
}
