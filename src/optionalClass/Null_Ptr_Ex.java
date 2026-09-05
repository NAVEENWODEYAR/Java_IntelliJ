package optionalClass;

import java.util.Optional;
public class Null_Ptr_Ex
{
    public static void main(String[] args)
    {
     // Optional class is used to solve the nullPointer Exception
        int[] roll_No = {1,2,3,4,5,6,7,8,9};
        String[] roll_No1 = new String[20];
                roll_No1[0] = "One";
//
//        System.out.println(roll_No);
//        System.out.println(roll_No.length);
//        System.out.println(roll_No.getClass());

            Optional opt = Optional.ofNullable(roll_No1[20]);
                if(opt.isPresent())
                {
                    System.out.println(opt.get());
                }
                else
                {
                    System.out.println("You begger");
System.out.println("Optional class demo");
                }
    }
}
