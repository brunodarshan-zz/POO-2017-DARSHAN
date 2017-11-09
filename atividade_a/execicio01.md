# Exercício 01
1. Qual a diferença entre objetos e classes? Exemplifique.
  Objetos são instâncias de classes, ou seja são definidos e baseados em classes. Classes são a abstração de algo em estruturas com dados modeláveis.
  Por exemplo:
    - Classe: Veiculos.
    - Objetos: Carros, Motocicletas, Avião

2. De forma breve, conceitue atributos e métodos. Pesquise e exemplifique um
    exemplo de objeto que possua atributos e métodos (notação livre).
    Atributos são as "caracteristicas" de um objeto, as variáveis pertencentes a ele. Métodos são as funções, os modos com as aquais podemos interagir e manipular esses atributos.
    ```
      Carro:
        atributos: velocidade, estado, combustivel
        métodos: ligar, acelerar, frear, pintar, abastecer, combustão
    ```

3. A abstração visa focar no que é importante para um sistema. Você concorda que
    um atributo de uma pessoa pode ser importante ou não dependendo do contexto
    do sistema. Enumere na tabela abaixo contextos/sistemas distintos em que os
    atributos abaixo seriam ou não relevantes:

| Atributo | Sistema em que é importante | Sistema em que não é importante |
| -------- | --------------------------- | ------------------------------- |
| Peso   |  Clínico, Esportivo  | Vendas de Carro
| Tipo de CNH  | Transporte | Clínico, Esportivo
| Tipo Sanguíneo   | Clínico |  Transporte
| Habilidade destra  | Esportivo | Financeiro
| Percentual de gordura  | Clínico, Esportivo | Financeiro, Transporte
| Saldo em conta   | Finaceiro, Vendas | Esportivo,  Clínico
| Etinia   | Clínico, IBGE | Finaceiro, Vendas

4. Considerando os objetos Pessoa e Conta:

    a) Seria interessante em um sistema bancário um objeto "conta" possuir uma
       "pessoa" como um atributo interno representando o titular da conta?

       Não. Pois abstraindo a visão do sistema, uma conta não possui pessoa, mas sim o inverso.

    b) Olhando no sentido inverso, seria interessante uma pessoa possuir mais de
       uma conta como atributo? Que elemento da programação estruturada melhor
       representaria o conjunto de contas de uma pessoa?

       Uma lista/vetor de contas.

5. Identifique pelo menos 5 objetos de um sistema de controle acadêmico. Ex: aluno.
 ```
  Sistema Acadêmico
    * Professor
    * Coordenador
    * Diretor
    * Turma
    * Disciplina
    * Turno
    * Aula
 ```
6. Imagine um jogo qualquer. Identifique o máximo de objetos possíveis e eventuais
    características (atributos) e comportamentos (métodos) que os mesmos poderiam
    ter.
    ```
    # Volei
      * Objetos:
        - Pessoa
          - nome
          - idade
          - peso
          - altura
          - velocidade
          - parado
          - anda(velocidade)
          - salta()

        - Jogador < Pessoa
          - forca
          - nivel_do_chao
          - bloqueia()
          - rebate()
          - saca()


        - Juiz < Pessoa
          - observa()
          - dar_cartao()

        - Sets
          - tempo
          - numero_do_set
          - inicia()
          - termina()
          - pausa
          - pontos

        - Time
          - Pessoas jogadores[]
          - Treinador
          - nivel


    ```

7. Considerando o exemplo da classe Retangulo dos slides, implemente um método
    adicional chamado que calcule o perímetro do retângulo e altere a classe
    TestaRetangulo para exibir o cálculo do perímetro.

    ```Java
      class Retangulo {
        private perimetro;
        public double perimetro(double lado1, lado2){
          if (lado1 != 0 && lado2 != 0) {
            return 2 * lado1 + 2 * lado2;
          }
        }
      }

    ```

8. Crie uma classe Circulo que possua um atributo raio. Crie dois métodos que
    calculam a área e o perímetro e crie uma outra classe chamada TestaCirculo que
    instancia, atribui um valor ao raio e exibe a área e o perímetro chamando os dois
    métodos definidos na questão anterior.
    
9. Crie uma classe chamada SituacaoFinanceira com os atributos valorCreditos e
    valorDebitos. Crie um método chamado saldo() que retorna/calcula a diferença
    entre crédito e débito. Crie também uma classe chamada TestaSituacaoFinanceira
    que instancia uma classe SituacaoFinanceira, inicializa os dois atributos e exibe o
    resultado do método saldo().
