import java.util.Objects;

public class Conta {

        private Pessoa titular;// estamos usando a composição
        private int agencia;
        private int numero;
        private double saldo;

    public Conta() {
        //Construtor Vazio
    }

    public Conta(Pessoa titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Getters e Setters
    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        //como implementar um metodo na classe?
    public void depositarDinhero(double valor /*Variavel local (valor) */) {
        double saldoInicial = saldo;
        saldo += valor;
        //Quando eu utilizar o metodo depositarDinheiro, as mensagens que escrevi irão ser exibidas.
        System.out.println("Deposito realizado com sucesso, no valor de: " + valor);
        System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println("Saldo final: R$ " + saldo);

    }




}

