package for_break;

public class ForBreak {

    /*
    * Vamos supor que temos que exibir uma mensagem apenas 5 vezes seguidas, porém alguem mexeu em nosso código,
        e fizeram com que a mensagem fosse exibida mais de 10 vezes.

    * Como poderiamos fazer com que o código se encerrase assim que a 5 mensagem fosse exibida. Podemos resolver isso
        utilizando a palavrinha conhecida como (break).
    */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                //Porque colocamos o número 6 se queriamos que o loop se encerrase na 5 impressão?
                // quando colocamos um numero em um índice, temos que lembrar que ele começa com 0,
                // portanto como quero parar no 5 índice, devo colocar um número a cima. Porque ele não conta o número
                // em que colocamos para ser encerrado.
                break;
            }
            System.out.println("Exibindo essa mensagem de alerta " + i);

        }


    }


}
