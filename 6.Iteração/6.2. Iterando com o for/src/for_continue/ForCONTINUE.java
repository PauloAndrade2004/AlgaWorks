public static void main(String[] args) {

    int[] produtos = new int[]{3333, 2022, 330};
    for (int i = 0; i < produtos.length; i++) {
        if (produtos[i] == 100) {
            System.out.println("Produto de número " + produtos[i] + " foi encontrado");
            continue;
        }
        if (produtos[i] == 2022) {
            System.out.println("Produto de número " + produtos[i] + " foi encontrado");
            continue;
        }
        if (produtos[i] == 330) {
            System.out.println("Produto de número " + produtos[i] + " foi encontrado");
            // Removido o break aqui, para que o laço continue até o fim.
            // Removendo o break, porque o laço não continuara caso o número 100 seja encontrado.
        }
    }
}
