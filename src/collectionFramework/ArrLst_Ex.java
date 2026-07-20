package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrLst_Ex
{
    public static void main(String[] args)
    {
System.out.println("ArrayList demo program");
     // ArrayList can be created in different ways
     // using the new
        System.out.println("Using the new");
        List l1 = new ArrayList();
            l1.add(1);
            l1.add("One");
            l1.add(2);
            l1.add("Two");
            l1.stream().forEach(System.out::println);
        System.out.println("*************");

     //   using List.of
        System.out.println("Using the List.of()");
     List<Integer> l2 = List.of(2,4,6,8);
//     l2.stream().map(l->l*l).collect(Collectors.toList()).forEach(System.out::println);
     l2.stream().map(l->l*l).forEach(System.out::println);
        System.out.println("/n***************/n");

    // using Arrays.asList()
        System.out.println("Using Arrays.asList");
        Arrays.asList("One","two","three","four","five")
                .stream().filter(s->s.length()>=4).forEach(System.out::println);
    }
}
