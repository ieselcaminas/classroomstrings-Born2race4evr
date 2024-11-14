public class Cadena {
    public static void main(String[] args) {
        String cadena = "Hola que tal?";
        char car;
        System.out.println(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
            car = cadena.charAt(i);
            if (Character.isDigit(cadena.charAt(i))) {
                System.out.println(car);
            }

        }
        cadena = cadena.toUpperCase();
        System.out.println(cadena);
        cadena = cadena.toLowerCase();
        System.out.println(cadena);
        cadena = cadena.replace('o', 'e');
        System.out.println(cadena);
        cadena = cadena.trim();
        System.out.println(cadena);
        cadena = cadena.substring(2);
        System.out.println(cadena);
        cadena = cadena.substring(3, 8);
        System.out.println(cadena);


    }
}
