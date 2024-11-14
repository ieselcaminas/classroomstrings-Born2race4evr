public class digitos2 {

    public static int esNumeros(String cadena, String[] palabras) {
        int contador = 0;
        boolean esNumero = true;
        for (int i = 0; i < palabras.length; i++) {
            esNumero = true;
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                if (!Character.isDigit(palabra.charAt(j))){
                    esNumero = false;
                    break;
                }
            }
            if (esNumero) contador++;
        }
        return contador;
    }


    public static void main(String[] args) {
        String cadena = "1 20 hola 234 45a";
        String[] palabras = cadena.split(" ");

        int res = esNumeros(cadena, palabras);
        System.out.println(res);

    }
}
