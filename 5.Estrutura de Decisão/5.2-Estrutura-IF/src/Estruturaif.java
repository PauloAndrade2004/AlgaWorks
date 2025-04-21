public class EstruturaIf {

    public static void main(String[] args) {
        // O software irá validar se a pessoa pode pedir um empréstimo.

        boolean movimentaDinheiroMetadeValor = true;
        boolean tempoSuficienteAbertura = true;
        boolean nomeLimpo = true;

        // Toda expressão que retorna um valor booleano pode ser usada dentro dos parênteses do if.
        // OBS: O operador (&&) retorna true caso todas as expressões sejam verdadeiras.
        boolean liberarEmprestimo = movimentaDinheiroMetadeValor
                && tempoSuficienteAbertura
                && nomeLimpo;

        if (liberarEmprestimo) {
            System.out.println("Sim. Pode liberar o empréstimo.");
        } else {
            System.out.println("Não pode liberar o empréstimo.");
        }
    }
}
