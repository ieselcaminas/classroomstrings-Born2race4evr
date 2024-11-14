
public class Invertida {

    public static String invertir(String[] palabras){
        String invertido = "";

        for (int i = 0; i < palabras.length; i++) {
            invertido = palabras[i] + " " + invertido;
        }
        return invertido;
    }

    public static void main(String[] args) {
        String cadena = "Chico que estas haciendo";
        String[] palabras = cadena.split(" ");

        String res = invertir(palabras);
        System.out.println(res);
    }
}
