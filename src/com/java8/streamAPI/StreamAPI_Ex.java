package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Ex
{
    public static void main(String[] args)
    {
System.out.println("Streams demo");
     // Stream API
     ArrayList<String> al = new ArrayList();
        al.add("Annie");
        al.add("Benny");
        al.add("Clara");
        al.add("Dolly");

        // Converting all the elements toUpperCase()
        ArrayList<String> al1 = new ArrayList();
        for (String name: al)
        {
            al1.add(name.toUpperCase());
        }

        // using the streamAPI
       List<String> l =  al.stream().map( (name) -> name.toUpperCase() ).collect(Collectors.toList());

        System.out.println("Original list- " +al);
        System.out.println("Converted list- "+al1);
        System.out.println(l);


    }
}
