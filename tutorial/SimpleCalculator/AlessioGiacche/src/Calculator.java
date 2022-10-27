public class Calculator {

    public double moltiplicazione(double a , double b){
        if(a == 0 || b == 0)
            return 0;
        return a*b;
    }

    public double divisione(double a, double b){
        if(b == 0)
            return 0;
        return a/b;
    }

    public double somma(double a, double b){
        return a+b;
    }

    public double differenza(double a, double b){
        if(a < b)
            return 0;
        return a-b;
    }
}
