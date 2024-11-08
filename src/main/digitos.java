package main;

public class digitos {

    public static int cuantas_p (String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador ++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String cadena = "1 2 3 4";

        int res = cuantas_p(cadena);
        System.out.print("Hay " + res + " digitos");
    }
}
