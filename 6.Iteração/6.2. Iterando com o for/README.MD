# Como é sua sintaxe :

Mostrando como utilizar o laço (for) de uma maneira simples para repetir uma mensagem 10 vezes.
```Java 
    for (int i = 0; i < 5;) {
                System.out.println("Testando o laço for! ");
    }
``` 
* 1 - primeira pocisão: Dentro do for nos utilizamos tipos primtivos/Variável e por fim, atribuimos um valor a nossa variável (i)
* 2 - Segunda pocisão: Devemos utilizar expressões booleanas, e precisa retornar (true) ou (false)
* 3 - Terceira pocisão: Devemos colocar um expressão após cada vlta do nosso laço (incrementação)
      cada volta que dermos no nosso laço, ele ira (incremetar) ou seja, (i++)

# Exemplo 2:

* Criamos dois array (vetor) simples que (armazenam o preço) e o (nome do produto) 
      Um do do tipo Double:
```Java
    double[] carrinhDeCompras = new double[]{50.0, 56.6, 100.0};
    String[] nomeProduto = new String[]{"Feijão", "Arroz", "Picanha"};
```

* Criamos um tipo e uma variável aonde é usada para armazenar a soma dos produtos no total.
```Java 
    double total = 0.0;
```

* 