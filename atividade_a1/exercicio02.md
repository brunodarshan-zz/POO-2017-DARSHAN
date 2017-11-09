# Exercício 02
[Anterior](exercicio01.md)

1. Corrija as seguintes afirmações: Considere uma classe chamada Avaliacao. Para compilarmos e executamos a
classe devemos executar os seguintes comandos:
```BASH
$ javac Avaliacao
$ javac Avaliacao.java

```

Errado. Para compilarmos e executarmos os comandos são:

```BASH
$ javac Avaliacao.java // gera as classes compiladas
$ java Avalicao // Executa
```
2. Qual o resultado da compilação do código abaixo e justifique sua resposta:

```Java
public class Aplicacao {
  public static void main() {
    int contador;
    System.out.println(contador++);
  }
}
```
O código em questão não irá executar. Pois *falta os paramêtros padrão do método estático main*. Além da variável contador *não possuir valor atribuido*.

3. Explique detalhadamente o resultado após a execução abaixo do código:

```Java
public class Exemplo {
  public static void main(String[] args) {
    int a = 9;
    int b = 0;
    if ((a > 11) && (++b <= 100)){
      System.out.println(a*b);
    } else {
      System.out.println(a-b);
    }
  }
}
```
```
  O resultado da execução será 8.
  Após a condicional(que possui uma adição de +1 a variavel b) retornar false o código mostrará o resultado de 9 - 1
```

4. Explique detalhadamente qual a saída da execução do trecho de código abaixo e
    justifique:
```Java
int op = 1;
switch (op) {
  case 1: System.out.println(op);
  case 2: System.out.println(op);
  default: System.out.println(op);
}
```
```
O resultado será 1, independente da escolha. Isso por que o comando System.out.println(op) é comum a todos.
```
5. Corrija a classe abaixo para que a mesma exiba corretamente a soma de a e b.

```Java
public class Exemplo {
  public static void main(String args[]) {
    int a = 10;
    int b = 1;
    System.out.println("Soma: " + a + b);
  }
}
```
_corrigida_
```Java
public class Exemplo {
  public static void main(String args[]) {
    int a = 10;
    int b = 1;
    System.out.println("Soma: " + (a + b));
  }
}
```

6. Crie uma classe em que o método main() exiba uma mensagem de saudação
    usando um “println”.
    ```Java
    public class Main {
      public static void main(String args[]) {
        System.out.println("Olá, devs!");
      }
    }
    ```

7. Crie uma classe chamada Saudacao que contenha um atributo chamado texto e
    outro chamado destinatario , ambos String. Crie um método obterSaudacao() que
    retorne a concatenação dos dois atributos. Ex. de saída: "Bom dia, João".

    ```Java
    public class Saldacao {
        private String texto;
        private String destinatario;

        public String obterSaudacao() {
          return getTexto() + " " + getDestinatario() + "!"
        }

        public void setTexto(String txt) {
          texto = txt;
        }

        public void setDestinatario(String nome) {
          destinatario = nome;
        }

        public String getTexto(){
            return texto;
        }

        public String getDestinatario(){
          return destinatario;
        }

    }
    ```

8. Crie uma classe TestaSaudacao para testar a classe Saudacao. Nela crie um
    método main() que instancie um objeto do tipo Saudacao e inicialize os dois
    atributos. Após isso, exiba (println) o resultado do método obterSaudacao().
    ```Java
    public class TestaSaudacao {
      public static void main(String args[]) {
        Saudacao saudacao = new Saudacao();
        saudacao.setTexto("Bom dia");
        saudacao.setDestinatario("João");
        System.out.println(saudacao.bterSaudacao());
      }
    }
    ```
9. Compare as implementações da questão 6 e com a implementação das questões
    7 e 8.
    a) Qual é a abordagem mais "estruturada" e qual a versão mais Orientada a
    Objetos?
     *Primeira e segunda, respectivamente*
    b) Qual a mais modularizada e reutilizável?
    *Segunda*
    c) Entretanto, qual a mais burocrática devido ao problema a ser resolvido?
    *Segunda*

<hr>

A partir da questão seguinte, crie além da classe pedida uma classe para testes e execução da classe em questão. Nessa classe, inicialize os atributos e teste todos os métodos de cada classe. Ex: Para a classe “X.java”, crie uma classe chamada “TesteX.java”

<hr>

10. Crie uma classe Soma que tenha dois atributos numéricos e que tenha um método calculaSoma(), que retorna a soma dos dois atributos.
11. Crie uma classe chamada DecimalNumber que tenha um atributo double. Esta classe deve ter dois métodos: um que exiba a parte inteira do atributo e outro que retorne parte decimal. Use cast.
12. Crie uma classe chamada Desconto que tenha como atributos dois valores referentes a um valor original de uma conta e um desconto em porcentagem. Crie um método calcula() que retorne um valor calculando o desconto da seguinte forma: valorCalculado = valorOriginal * (1-desconto/100). Ex: valor: 120 desconto: 10. Valor calculado: 108
13. Crie uma classe chamada NumberUtils que tenha um atributo numérico n os seguintes métodos:
       a. isPair(): retorna verdadeiro se o número for par. Aproveitando a implementação desse método, crie outro método "isOdd()" que retorne false se o número for ímpar;
       b. isPrime() que retorna true ou false se o número é primo ou não.;
       c. printCount() que retorne a contagem crescente em forma de String de zero até o valor do atributo. Ex: "0, 1, 2, 3, 4";
       d. printReverseCount() que retorna uma String com contagem decrescente;
14. Crie uma classe Equipamento com:
    a) um atributo ligado (tipo boolean)
    b) dois métodos liga() e desliga(). O método liga torna o atributo ligado true e o método desliga torna o atributo ligado false.
    c) Crie um método chamado inverte(), que muda o status atual (se ligado, desliga...se desligado, liga)
    d) Crie um método que estaLigado() que retorna o valor do atributo ligado
    e) Altere o comportamendo dos métodos liga para caso o equipamento já
      esteja ligado, não ligue novamente. Faça o mesmo com o método desligar.

15. Crie uma classe chamada TestaEquipamentos e em seu método main:
    a. Instancie 2 objetos da classe Equipamento;
    b. Ligue o primeiro e desligue o segundo;
    c. Chame o método inverte() em cada um dos equipamentos;
    d. Faça um if para cada um dos equipamentos testando se o mesmo está ligado. Imprima: “ligado” ou “desligado” dependendo da situação de ambos;


[Exercício 3](exercicio03.md)
