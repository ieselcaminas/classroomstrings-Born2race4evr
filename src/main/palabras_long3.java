package main;
public class palabras_long3 {

    public static boolean largoOCorto (String[] palabras){
        int num = 7;
        boolean largo = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String cadena = "me lie ayer con un cable";
        String[] palabras = cadena.split(" ");

        boolean res = largoOCorto(palabras);

        if (res){
            System.out.println("hay una palabra larga ");
        }else{
            System.out.println("todas las palabras son cortas ");
        }

    }
}

