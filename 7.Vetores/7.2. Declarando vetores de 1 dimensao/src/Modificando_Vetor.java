public class Modificando_Vetor {
    public static void main(String[] args) {
        //aletrando o vetor
        String[] cardapio = new String[]{"Calabresa", "Atum", "Presunto", "Quatro Queijos"};

        //Primeira alteração do (vetor).
        //Para alterar precisamos usar o (índice) aonde o nosso elemento está.
        cardapio[1] = "Frango com Catupiry";

        //Exibindo aalteração do nosso (cardapío)
        for (int i = 0; i < cardapio.length; i++) {
            System.out.println(cardapio[i]);
        }
    }
}
