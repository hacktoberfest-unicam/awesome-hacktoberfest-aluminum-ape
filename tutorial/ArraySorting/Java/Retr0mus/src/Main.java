public class Main {
    public static void main(String[] args) {
        // Inizializzazione del vettore
        int[] v = {10, 43, 234, 45, 234, 546, 654, 2, 65, 34, 6, 70};

        // Ordinamento del vettore
        quickSort(v, 0, v.length-1);

        // Stampa del vettore valore per valore
        for(int i = 0; i<v.length; i++)
            System.out.println(v[i]);
    }

    private static void quickSort(int[] array, int l, int h){
        // Inizializzazione variabili
        int pivot = l;
        int low = l;
        int high = h;

        // Controllo della validità del pivot
        if(pivot < 0 || pivot >= array.length)
            return;

        // Controllo del range
        if (l >= h)
            return;

        // Odinamento in base al pivot
        while(l <= h)
        {
            // Quando il pivot è nel lato destro del vettore
            if(pivot > (l+h)/2)
            {
                if(array[pivot] < array[l])
                {
                    // Scambio di valori
                    int tmp = array[pivot];
                    array[pivot] = array[l];
                    array[l] = tmp;

                    // Reset del pivot
                    pivot = l;
                }

                // Incremento l
                l++;
            }
            // Quando il pivot è nel lato destro del vettore
            else
            {
                if(array[pivot] > array[h])
                {
                    // Scambio di valori
                    int tmp = array[pivot];
                    array[pivot] = array[h];
                    array[h] = tmp;

                    // Reset del pivot
                    pivot = h;
                }

                // Decremento h
                h--;
            }
        }

        // Chiamate ricorsive al metodo
        quickSort(array, low, pivot-1);
        quickSort(array, pivot+1, high);
    }
}