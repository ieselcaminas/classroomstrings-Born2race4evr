
public class palabras_long {

    public static int cuantas_p (String[] palabras) {
        int contador = 0;
        int cuantas = 3;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == cuantas) {
                contador ++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String cadena = "Chico que estas haciendo";
        int cuantas = 3;
        String[] palabras = cadena.split(" ");

        int res = cuantas_p(palabras);
        System.out.print("Hay " + res + " palabras que tienen " + cuantas + " letras");
    }
}
