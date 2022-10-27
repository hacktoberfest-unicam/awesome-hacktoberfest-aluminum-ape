import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        GregorianCalendar data1 = new GregorianCalendar(2001, 1, 1, 20, 0 , 0);
        GregorianCalendar data2 = new GregorianCalendar(2001, 1, 1, 22, 0 , 0);
        System.out.println("Prima data: " + data1.toZonedDateTime());
        System.out.println("Seconda data: " + data2.toZonedDateTime());
        long result = Math.abs(data1.getTimeInMillis() - data2.getTimeInMillis());
        System.out.println("Differenza di tempo in millisecondi: " + result);
        long sec = (result/1000)%60;
        long min = ((result/1000)/60)%60;
        long ore = (((result/1000)/60)/60)%24;
        long giorni = (((result/1000)/60)/60)/24;
        System.out.println(giorni + "g " + ore + "o " + min + "m " + sec + "s");
    }
}
