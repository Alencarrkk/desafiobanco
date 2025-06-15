# ContaTerminal

O projeto `ContaTerminal` é um programa Java simples que simula a criação de uma conta bancária em um terminal. Ele coleta informações do usuário, como nome, número da agência, número da conta e o valor do depósito inicial. Em seguida, exibe uma mensagem de confirmação com os detalhes da conta.

## Como Funciona

O programa solicita as seguintes informações ao usuário:

1. **Nome do cliente**
2. **Número da agência**
3. **Número da conta**
4. **Valor do depósito inicial**

Após coletar os dados, o programa formata o saldo em formato monetário (BRL) e exibe uma mensagem de confirmação com todos os detalhes da conta.

## Estrutura do Código

### Importações

O código utiliza as seguintes bibliotecas:

- **`java.text.NumberFormat`**: Para formatar números, como valores monetários.
- **`java.util.Locale`**: Para definir o formato de números, datas, etc., de acordo com as convenções locais.
- **`java.util.Scanner`**: Para ler a entrada do usuário a partir do console.

### Método Principal

O método `main` é o ponto de entrada do programa. Ele realiza as seguintes etapas:

1. Cria uma instância de `Scanner` para ler a entrada do usuário.
2. Solicita e armazena o nome do cliente, número da agência, número da conta e valor do depósito inicial.
3. Formata o saldo em formato monetário (BRL).
4. Exibe uma mensagem de confirmação com os detalhes da conta.

### Exemplo de Execução

#### Entrada do Usuário
 #### Digite seu nome:
João

 #### Digite o numero da agencia:
1234

 #### Digite o numero da conta:
5678

#### Valor de deposito inicial:
1000.50


#### Saída do Programa
Olá João, Obrigado por criar uma conta em nosso banco, sua agência é: 1234, conta: 5678 e seu saldo: R$ 1.000,50 já está disponivel para saque.

