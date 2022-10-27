public class EquazioneSecondoGrado {

    //Costante confronto numeri piccoli:
    private static final double EPSILON = 1.0E-15;

    private double a;

    private double b;

    private double c;

    private boolean solved;

    private SoluzioneEquazioneSecondoGrado lastSolution;

    /**
     * Creazione equzione secondo grado.
     */

    public EquazioneSecondoGrado(double a, double b, double c){
        if (Math.abs(a) < EPSILON) {
            throw new IllegalArgumentException("Il valore non è corretto");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.solved = false;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if ((!(Math.abs(a) < EPSILON)) && (a != getA())) {
            this.solved = false;
            this.a = a;
        } else throw new IllegalArgumentException("Il valore non va bene");
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b != getB()) {
            this.solved = false;
            this.b = b;
        } else throw new IllegalArgumentException("Il valore non va bene");
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c != getC()) {
            this.solved = false;
            this.c = c;
        } else throw new IllegalArgumentException("Il valore non va bene!");
    }

    public boolean isSolved() {
        return solved;
    }

    public void solve() {
        double sUno;
        double sDue;
        double delta;
        delta = (b * b) - 4 * (a * c);
        EquazioneSecondoGrado e = new EquazioneSecondoGrado(a, b, c);
        if (!isSolved()) {
            if (delta > 0) {
                System.out.println("Esistono due soluzioni: ");
                sUno = (((-b) + Math.sqrt(delta)) / (2*a));
                sDue = (((-b) - Math.sqrt(delta)) / (2*a));
                System.out.println("Soluzione Uno: " + sUno);
                System.out.println("Soluzione due: " + sDue);
                lastSolution = new SoluzioneEquazioneSecondoGrado(e, sUno, sDue);

            } else if (delta == 0) {
                System.out.println("Esistono due soluzioni coincidenti");
                sUno = (((-b) + Math.sqrt(delta)) / (2*a));
                lastSolution = new SoluzioneEquazioneSecondoGrado(e, sUno);
            } else if (delta < 0) {
                System.out.println("Non esiste alcuna soluzione");
                lastSolution = new SoluzioneEquazioneSecondoGrado(e);
            }
        }
        this.solved = true;
    }

    public SoluzioneEquazioneSecondoGrado getSolution() {
        if(isSolved()){
            return lastSolution;
        }else throw new IllegalArgumentException("Non è stata risolta");
    }
}
