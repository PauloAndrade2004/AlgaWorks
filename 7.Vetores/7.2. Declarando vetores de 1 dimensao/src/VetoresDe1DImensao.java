import java.util.Scanner;

public class VetoresDe1DImensao {
    public static void main(String[] args) {
        // Em vetores conseguimos guardar varios valores de um mesmo tipo.
        //Iremos montar um cardapio de cardapio, como exemplo.
        //o usuário escolhe os sabores de cardapio.

        //primeiro vetor
        String[] cardapio = new String[]{"Calabresa", "Atum", "Presunto", "Quatro Queijos"};

        //Propiedade = length --> Ela informa dinamicamente quantos itens possue.
        for (int i = 0; i < cardapio.length; i++) {
            System.out.println("cardapio: " + cardapio[i]);
            //posição de um array (vetor) começa no índice 0
            //pegamos dinamicamente utilizando a variavel aonde guardamos.
        }

        Scanner escolhePizza = new Scanner(System.in);

        System.out.println("DIgite o número referente ao sabor que voce deseja: ");
        int saborEscolhido = escolhePizza.nextInt();
        escolhePizza.nextLine(); // Quebra de linha.

        System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);
        // Aqui acessamos o nosso vetor cardapio, e adicionamos a resposta escolhida pelo usuário, assim o sabor que o
        //usuário escolheu atravez do número, sera exibido.
    }
}
