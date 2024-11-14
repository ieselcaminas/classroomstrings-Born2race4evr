
public class palabras_long2 {

    public static boolean cuantas_p (String[] palabras) {
        String minimo = "";
        boolean son_iguales = false;
        int cuantas = 3;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == cuantas) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String cadena = "Chico que estas haciendo";
        String[] palabras = cadena.split(" ");

        boolean res = cuantas_p(palabras);
        if (res) {
            System.out.println("hay por lo menos 1 numero que tiene los caracteres indicados ");
        }else {
            System.out.println("no hay ningun numero que coincida con los carácteres especificados");
        }
    }
}
