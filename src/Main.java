import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args)
    {
       int year = 5;
       double salary = 62000;

        for(int i = 0; i<year; i++){
            salary*= 1.1;
       }
       NumberFormat formatter = new DecimalFormat("#0.00");
       System.out.println("Robert 5th year of salary $" +formatter.format(salary));

    }

}
