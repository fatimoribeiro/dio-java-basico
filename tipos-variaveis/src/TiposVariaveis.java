public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        salarioMinimo = 2500.30;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; // error
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_PI = 3.14;
        // VALOR_PI = 3.15; //error
    }
}
