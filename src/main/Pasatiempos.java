public class Pasatiempos {

    public static String descifrado (String[]palabras, String cadena) {

        for (int i = 0; i < palabras.length; i++) {
            cadena = cadena.replace('a', '.');
            cadena = cadena.replace('e', '.');
            cadena = cadena.replace('i', '.');
            cadena = cadena.replace('o', '.');
            cadena = cadena.replace('u', '.');

        }
        return cadena;
    }


    public static void main(String[] args) {
        String cadena = "Chico que estas haciendo";
        String[] palabras = cadena.split(" ");

        String res = descifrado(palabras, cadena);
        System.out.println(res);

    }
}
