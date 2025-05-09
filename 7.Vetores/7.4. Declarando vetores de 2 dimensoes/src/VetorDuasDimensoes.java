public class VetorDuasDimensoes {

    public static void main(String[] args) {

        Double[] vetorDia = new Double[]{100.0, 200.0, 300.0, 400.0, 500.0, 600.0};

        Double[] vetorJaneiro = new Double[]{1000.0, 2000.0, 3000.0, 4500.0, 6000.0};

        Double[] vetorFevereiro = new Double[]{1550.0, 3400.0, 2300.0, 4900.0, 6700.0};

        //Criando um vetor de 2 dimensões
        // O valor de um vetor de duas dimensões precisa ser um vetor de (uma) dimensão.
        Double[][] faturamentoAnual = new Double[][] {vetorJaneiro, vetorFevereiro};
//  Ínice                                                   0               1

        // Como eu acessaria esses valores, como eu chegaria no valor de (1000.0), como fariamos para imprimir esse valor.
        //No primeiro colchetes [0] adicionamos o índice do vetorJaneiro. É no segundo colchetes [0] acessamos o índice do,
//         da posição em que nosso valor se encontra.
        System.out.println("Faturamento do mês de Janeiro: " + faturamentoAnual[0][0]);
        System.out.println("Faturamento do Mês de janeiro: " + faturamentoAnual[0][1]);

        System.out.println("\nFaturamento do Mês de Fevereiro: " + faturamentoAnual[1][0]);
        System.out.println("Faturamento do Mês de Fevereiro: " + faturamentoAnual[1][1]);

//      Podemos fazer a navegação utilizando o laço (for)
        for (int i=0; i < faturamentoAnual.length; i++){
            System.out.println("Mês " + (i + 1)); // Colocamos em parenteses, porque se não ele ira concatenar ao inves de somar.

            Double[] dia = faturamentoAnual[i];

            for (int y=0; y < dia.length; y++){
                System.out.println("Faturamento " + (y + 1) + ": " + dia[y]);
            }

        }





    }
}
