public class Alfabetica {

    public static boolean alfabetica(String cadena) {

        for (int i = 0; i < cadena.length() - 1; i++) {
            if (cadena.charAt(i) > cadena.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String cadena = ("anis");

        boolean res = alfabetica(cadena);

        if (res){
            System.out.println("Alfabetica");
        } else {
            System.out.println("Not Alfabetica");
        }


    }
}
