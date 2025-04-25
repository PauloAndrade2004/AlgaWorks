# Como é sua sintaxe :

Mostrando como utilizar o laço (for) de uma maneira simples para repetir uma mensagem 10 vezes.
```Java 
    for (int i = 0; i < 5;) {
                System.out.println("Testando o laço for! ");
    }
``` 
* 1 - primeira pocisão: Dentro do for nos utilizamos tipos primtivos/Variável e por fim, atribuimos um valor a nossa variável (i).
* 2 - Segunda pocisão: Devemos utilizar expressões booleanas, e precisa retornar (true) ou (false).
* 3 - Terceira pocisão: Devemos colocar um expressão após cada vlta do nosso laço (incrementação).
      cada volta que dermos no nosso laço, ele ira (incremetar) ou seja, (i++).

# Exemplo 2:
### Criando dois arrays (vetores) 
Criamos dois array (vetor) simples que (armazenam o preço) e o (nome do produto).
Um do do tipo Double:
```Java
    double[] carrinhDeCompras = new double[]{50.0, 56.6, 100.0};
    String[] nomeProduto = new String[]{"Feijão", "Arroz", "Picanha"};
```

### Criando uma variável: 
Criamos um tipo e uma variável aonde é usada para armazenar a soma dos produtos no total.
```Java 
    double total = 0.0;
```

### Criamos um loop for:
```Java 
for (int i = 0; i < carrinhDeCompras.length; i++) {
            total += carrinhDeCompras[i];
            System.out.println("Os produtos selecionados forão: " + Arrays.toString(nomeProdutos) + " R$ " + carrinhDeCompras[i]);
            System.out.println("Total de compras: " + total);
        }
```
1 - Criamos uma variável de tipo (inteiro) -> nome de uma (variável) e atribuimos a essa variável (i) um valor de (0).
2 - Criamos uma expressão booleana, aonde (i) for menor que (carrinhoDeCompras.length).

3 - A cada execusão que nosso código der, ele será (incrementado) e adicionamos (i++) que seria a incrementação.
4 - Adicionamos a variável (total += carrinhoDeCompras[i])
      Os três valores totais são somados ao final do programa.