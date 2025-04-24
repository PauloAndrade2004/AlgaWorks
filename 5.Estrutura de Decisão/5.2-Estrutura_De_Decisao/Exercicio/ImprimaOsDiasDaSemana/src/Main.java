import java.util.Scanner;

public class Main {

    /*
        Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
        Dependendo do número informado você deve imprimir o nome desse dia.
        Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        int diaSemana = sc.nextInt();
        sc.nextLine(); // Quebra de linha.

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Erro");
                break;
        }

    }
}