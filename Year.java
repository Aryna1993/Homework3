package Day.Month;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.time.MonthDay;

public class Year {
    public static void main(String[] args) {

        int day = 30;
        int month = 6;
        int year  = 2018;



            if ( day <=30 && (month == 1 || month == 3 || month == 5|| month == 7|| month == 8 || month == 10 || month == 12))
            {
                day = day+1;
                System.out.println("!День -"+day+ " Месяц -" +month+ " Год-"+year);
            }
            else if ( day == 31 && (month == 1 || month == 3 || month == 5|| month == 7|| month == 8 || month == 10 || month == 12))
            {
                day = 1;
                month = month+1;
                System.out.println("!День -"+day+ " Месяц -" +month+ " Год-"+year);
            }
            else if (day <=29 && (month == 4 || month == 6 || month == 9 || month == 11))
            {

                day = day+1;
                System.out.println("!!День -"+day+ " Месяц -" +month+ " Год-"+year);
            }
            else if (day ==30 && (month == 4 || month == 6 || month == 9 || month == 11))
            {

                day = 1;
                month = month + 1;
                System.out.println("!!День -"+day+ " Месяц -" +month+ " Год-"+year);
            }

            else if(month == 12 && day == 31)
            {
                day = 1;
                month = 1;
                year = year+1;
                System.out.println("!!!День -"+day+ " Месяц -" +month+ " Год-"+year);
            }

            else if(month == 2 && day == 28)
            {
                day = 1;
                month = 3;

                System.out.println("!!!День -"+day+ " Месяц -" +month+ " Год-"+year);
            }
            else
            {
                System.out.println("Нет подходящих условий");

            }


        public static void oddMonth(int date)
        {if ( day <=30 && (month == 1 || month == 3 || month == 5|| month == 7|| month == 8 || month == 10 || month == 12))
        {
            day = day+1;
            System.out.println("!День -"+day+ " Месяц -" +month+ " Год-"+year);
        }
        else if ( day == 31 && (month == 1 || month == 3 || month == 5|| month == 7|| month == 8 || month == 10 || month == 12))
        {
            day = 1;
            month = month+1;
            System.out.println("!День -"+day+ " Месяц -" +month+ " Год-"+year);

        }}


    }
    }











        /**
        if ((day <=30) &&(month == 1 || month == 3 || month == 5|| month == 5 || month == 7|| month == 8 || month == 10 || month == 12 || month !=2)){
            System.out.println(day + 1);
        } else  if (month == 1 || month == 3 || month == 5|| month == 5 || month == 7|| month == 8 || month == 10 || | month == 12 || month !=2){
            System.out.println();
        }
        //*/





