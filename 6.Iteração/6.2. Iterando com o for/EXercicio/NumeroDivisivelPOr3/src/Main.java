public class Main {
    public static void main(String[] args) {
        System.out.println("Números divisiveis por 3");
        int[] numeroDivisivelPOr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for(int i = 0; i < numeroDivisivelPOr3.length; i++) {
            if (numeroDivisivelPOr3[i] % 3 == 0 ){
                System.out.println("Os números " + numeroDivisivelPOr3[i] + " são divisiveis por 3");
            }
        }

        System.out.println("\nNúmeros divisiveis por 2");
        int[] numerosDivisiveispor2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < numerosDivisiveispor2.length; i++) {
            if (numerosDivisiveispor2[i] % 2 == 0) {
                System.out.println("Os números " + numerosDivisiveispor2[i] + " são divisiveis por 2");
            }

        }
    }
}