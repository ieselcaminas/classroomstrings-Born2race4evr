import static java.lang.Character.isUpperCase;

public class Siglas {

    public static String siglas (String[] palabras) {
        String recopilador = "";
        for (int i = 0; i < palabras.length; i++) {
            if ((isUpperCase(palabras[i].charAt(0)))) {
                recopilador += palabras[i].charAt(0);
            }
        }
        return recopilador;
    }

    public static void main(String[] args) {
        String cadena = "Escuela Oficial de Idiomas";
        String[] palabras = cadena.split(" ");

        String res = siglas(palabras);
        System.out.print(res);
    }
}
