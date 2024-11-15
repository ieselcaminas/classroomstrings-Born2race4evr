public class suma_binario {

    public static String sumaBinario(String num1, String num2){

        String res = "";
        char b1;
        char b2;
        int bit1;
        int bit2;
        int acarreo = 0;
        int suma;
        for (int i = num1.length() - 1; i >= 0; i--) {

            b1 = num1.charAt(i);
            b2 = num2.charAt(i);
            bit1 = Integer.parseInt("" + b1);
            bit2 = Integer.parseInt("" + b2);
            suma = bit1 + bit2 + acarreo;

            if (suma % 2 == 0){
                res = "0" + res;
            }else {
                res = "1" + res;
            }

            if (suma <= 1) {
                acarreo = 0;
            } else {
                acarreo = 1;
            }
        }
        if (acarreo == 1) {
            res = "1" + res;
        }

        return res;
    }

    public static void main(String[] args) {
        String num1 = "100";
        String num2 = "111";
        String res = sumaBinario(num1, num2);
        System.out.println(res);

    }
}
