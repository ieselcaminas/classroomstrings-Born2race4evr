public class palindromo {

    public static boolean esPalindromo(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            char letraFinal = cadena.charAt(cadena.length() - 1 - i);
            if (letra != letraFinal) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String cadena = "abba";

        boolean res = esPalindromo(cadena);

        if (res){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
