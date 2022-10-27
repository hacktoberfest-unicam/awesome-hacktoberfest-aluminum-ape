import java.util.Scanner;

public class Equation {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double a, b, c,  x, y;
        double delta;
        System.out.println("Inserisce la a dell'equazione: ");
        a = scanner.nextDouble();
        System.out.println("Inserire la b dell'equazione: ");
        b = scanner.nextDouble();
        System.out.println("Inserire la c dell'equazione: ");
        c = scanner.nextDouble();
        delta = ((b*b)-(4*a*c));

        if(delta>0){
            x = (-b-(Math.sqrt(delta)))/(2*a);
            y = (-b+(Math.sqrt(delta)))/(2*a);
            System.out.println("Le due soluzioni sono : "+ x + ","+ y);
        } else if(delta==0){
            x = (-b-(Math.sqrt(delta)))/(2*a);
            System.out.println("Unica soluzione: "+x);
        }else
            System.out.println("Non ha soluzioni");
    }
}
