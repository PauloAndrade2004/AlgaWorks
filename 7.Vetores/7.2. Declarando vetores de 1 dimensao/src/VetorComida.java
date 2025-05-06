import java.util.Scanner;

public class VetorComida {

    public static void main(String[] args) {

            String nomeCliente;

            Scanner sc = new Scanner(System.in);
            String[] alimento = new String[]{"Lasanha", "Parmegiana", "Picanha"};

            System.out.println("Digite o nome do cliente: ");
            nomeCliente = sc.nextLine();

            System.out.println("Digite o nome do alimento que voce deseja: ");
            String nomeComida = sc.nextLine();

            boolean encontrado = false;
            for (String teste : alimento) {
                if (teste.equalsIgnoreCase(nomeComida)) {
                    System.out.println("O cliente " + nomeCliente + ", escolheu o alimento: " +  teste);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("O alimento " + nomeComida + ", não foi encontardo! Por favor digite novamente.");

            }
            sc.close();

    }
}
