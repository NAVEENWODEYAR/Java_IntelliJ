// age calculation using the period
package dateTimeAPI;


import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Age_Calculator
{
    public static void main(String[] args)
    {
System.out.println("Age calculator program");
        LocalDate date = LocalDate.now();
        LocalDate dob = LocalDate.of(1996,05,06);
//        System.out.println(Period.between(dob,date));
        Period p = Period.between(dob,date);
        System.out.println("You are--"+p.getYears()+"Years "+p.getMonths() +"Months "+p.getDays()+"Days old ");
    }
}
