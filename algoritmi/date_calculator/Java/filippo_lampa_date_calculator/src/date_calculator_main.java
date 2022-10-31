import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Filippo Lampa
 */
public class date_calculator_main {

    public static void main(String[] args) {
        String startingDate = "11-12-2018 02:11:20";
        String endingDate  = "12-12-2018 02:12:20";
        calculateDifference(startingDate, endingDate);
    }


    static void calculateDifference(String join_date, String leave_date)
    {
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        try {
            Date d1 = obj.parse(join_date);
            Date d2 = obj.parse(leave_date);

            long difference_In_Time
                    = d2.getTime() - d1.getTime();

            long difference_In_Seconds
                    = (difference_In_Time
                    / 1000)
                    % 60;

            long difference_In_Minutes
                    = (difference_In_Time
                    / (1000 * 60))
                    % 60;

            long difference_In_Hours
                    = (difference_In_Time
                    / (1000 * 60 * 60))
                    % 24;

            long difference_In_Days
                    = (difference_In_Time
                    / (1000 * 60 * 60 * 24))
                    % 365;

            System.out.print("Result: ");

            System.out.println(
                difference_In_Days + "d " + difference_In_Hours + "h " + difference_In_Minutes + "m " + difference_In_Seconds + "s "
            );
        }
        catch (ParseException excep) {
            excep.printStackTrace();
        }
    }


}
