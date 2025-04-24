import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int numero = 10;
//        for (int i = 0; i < numero; i++){
//            System.out.println("Testando o laço for! ");
//        }

        double[] carrinhDeCompras = new double[]{50.0, 56.6, 100.0};
        String[] nomeProdutos = new String[]{"Feijão", "Arroz", "Picanha"};
        double total = 0.0;
        for (int i = 0; i < carrinhDeCompras.length; i++) {
            total += carrinhDeCompras[i];
            System.out.println("Os produtos selecionados forão: " + Arrays.toString(nomeProdutos) + " R$ " + carrinhDeCompras[i]);
            System.out.println("Total de compras: " + total);
        }


    }


}

