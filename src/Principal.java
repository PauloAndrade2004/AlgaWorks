public class Principal {

    public static void main(String[] args) {
        // criando a Pessoa titular1.
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Gabrielle");
        titular1.setDocumento("5006361847");

        //Criando a conta do titular1.
        //Usando o construtor sem parâmetros.
        Conta contaTitular1 = new Conta();
        contaTitular1.setTitular(titular1);
        contaTitular1.setAgencia(555);
        contaTitular1.setNumero(123);
        contaTitular1.setSaldo(500); // Titular 1 inicia com um saldo de R$ 500,00.

        System.out.println("O tiular da conta é: " + contaTitular1.getTitular().getNome());
        System.out.println("Documento: " + titular1.getDocumento());
        System.out.println("Agencia: " + contaTitular1.getAgencia());
        System.out.println("Numero: " + contaTitular1.getNumero());
        System.out.println("Saldo atual: R$ " + contaTitular1.getSaldo());
        //Depositando dinheiro na contaTitular1
        contaTitular1.depositarDinhero(500);

        //Usando o construtor com parâmetros.
        Pessoa titular2 = new Pessoa();
        titular2.setNome("Paulo");
        titular2.setDocumento("5006361847");

        Conta contaTitular2 = new Conta(titular2, 555, 124, 1000);



    }
}
