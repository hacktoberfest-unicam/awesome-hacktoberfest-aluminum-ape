import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateCalculator {

    public static void main(String[] args) {
        // example
        var t1 = new GregorianCalendar();
        t1.set(2001, Calendar.JANUARY,1);
        t1.set(Calendar.HOUR_OF_DAY,20);
        var t2 = new GregorianCalendar();
        t2.set(2001, Calendar.JANUARY,2);
        t2.set(Calendar.HOUR_OF_DAY,20);
        System.out.println(getDifference(t1,t2));
    }

    public static String getDifference(GregorianCalendar t1, GregorianCalendar t2){
        var millisecond = Math.abs(t1.getTimeInMillis()-t2.getTimeInMillis());
        var seconds = TimeUnit.MILLISECONDS.toSeconds(millisecond);
        var d = ((seconds/60)/60)/24;
        var h = ((seconds/60)/60)%24;
        var m = (seconds/60)%60;
        var s = seconds%60;
        return d+"d "+h+"h "+m+"m "+s+" s";
    }
}
