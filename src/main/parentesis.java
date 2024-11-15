public class parentesis {

    public static int hayParentesis(String cadena) {

            int contador = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == '(') {
                    contador++;
                }
                else if (cadena.charAt(i) == ')') {
                    contador--;
                }

            }

            return contador;

    }

    public static void main(String[] args) {
        String cadena = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";

        int res = hayParentesis(cadena);
        if (res == 0) {
            System.out.println("Esta bien parentizada");
        } else {
            System.out.println("Esta mal parentizada");
        }


    }
}
