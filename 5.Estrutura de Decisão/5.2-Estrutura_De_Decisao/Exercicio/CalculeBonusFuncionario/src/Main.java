import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebe a meta de faturamento anual
        System.out.println("Digite a meta do faturamento anual: ");
        double metaAnual = sc.nextDouble();

        // Recebe o sfaturamento real da empresa no último ano
        System.out.println("Digite o faturamento real dos últimos 12 meses: ");
        double faturamentoReal = sc.nextDouble();

        // Recebe a média salarial do funcionário
        System.out.println("Digite a média salarial do funcionário: ");
        double mediaSalarial = sc.nextDouble();

        // Calcula 80% da meta
        double oitentaPorcento = metaAnual * 0.8;

        // Variável para armazenar o bônus
        double bonus = 0;

        // Verifica se atingiu ou superou a meta
        if (faturamentoReal >= metaAnual) {
            // Se o faturamento real for maior ou igual à meta, o bônus será igual à média salarial
            bonus = mediaSalarial;
        } else if (faturamentoReal >= oitentaPorcento) {
            // Se o faturamento real for maior ou igual a 80% da meta, o bônus será 80% da média salarial
            bonus = mediaSalarial * 0.8;
        }

        // Exibe o valor do bônus
        System.out.println("O bônus do funcionário será: R$ " + bonus);

        // Fecha o scanner
        sc.close();
    }
}
