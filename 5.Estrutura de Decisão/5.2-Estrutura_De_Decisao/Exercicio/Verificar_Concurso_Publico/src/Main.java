import java.util.Scanner;


public class Main {

    public static String verificarAprovacao(double notaPortugues, double notaMatematica) {
        if (notaPortugues < 0 || notaMatematica < 0) {
            return "Não aprovado, Teste zerado";
        }

        // Calcular o total de ponto
        double calcularNotas = (notaPortugues + notaMatematica) / 2;

        if (calcularNotas == 10) {
            return "Parabens! Você passou no concurso publico";
        } else if (calcularNotas >= 7) {
            return "Parabens! Você passou no concurso publico. Sua media foi de: " + calcularNotas;
        } else if (calcularNotas < 7) {
            return "VOcê foi reprovado no exame! Sua nota foi de: " + calcularNotas + " Você podera refazer o exame em um outro momento";
        }else {
            return "Nota Invalida";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Digite a nota de português: ");
        double notaPortugues = sc.nextDouble();

        System.out.println("Digite a nota de matemática: ");
        double notaMatematica = sc.nextDouble();

        String resultado = verificarAprovacao(notaPortugues, notaMatematica);

        System.out.println(resultado);
        sc.close();
    }



}