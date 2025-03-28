Explicações
Além disso, seu objetivo de adicionar um titular (que é um objeto da classe models.com.algaworks.banco.Pessoa) à classe models.com.algaworks.banco.Conta está correto. O que você está fazendo é:

    No construtor da classe models.com.algaworks.banco.Conta, você está recebendo um objeto models.com.algaworks.banco.Pessoa (denominado titular1) e atribuindo-o à variável titular da classe models.com.algaworks.banco.Conta.

    Isso significa que você pode associar os dados da classe models.com.algaworks.banco.Pessoa (como nome e CPF) à sua instância da classe models.com.algaworks.banco.Conta.