// Java program to filter elements in the lists on the required condition
package streamAPI;


import java.util.List;
import java.util.stream.Collectors;

public class DigitStartsWith_Ex
{
    public static void main(String[] args)
    {
System.out.println("filter function"):
        List <Integer> numList = List.of(2,3,21,4,22,5,23,6,24,7,25,8,9,4);
            numList.stream().map((num)-> String.valueOf(num))
                    .filter(num->num.startsWith("2")).collect(Collectors.toList())
                    .forEach(System.out::println);

        System.out.println("***********");
            List.of(2,5,48,9,46,3,42,49).stream()
                    .map((n)-> String.valueOf(n))
                    .filter((n)->n.startsWith("4"))
                    .forEach(System.out::println);
    }
}
