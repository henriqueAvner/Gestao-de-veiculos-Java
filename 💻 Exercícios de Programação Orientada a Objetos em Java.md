# 💻 Exercícios de Programação Orientada a Objetos em Java

Este repositório contém 10 exercícios práticos focados nos pilares da Programação Orientada a Objetos (POO) em Java: **Abstração**, **Encapsulamento**, **Herança** e **Polimorfismo**.

O objetivo é consolidar o aprendizado dos conceitos abordados nos primeiros dias da eletiva de Java, combinando os quatro pilares em cenários práticos de desenvolvimento.

## 🎯 Tema Central: Sistema de Gestão de Veículos e Transportes

Os exercícios seguirão um tema unificado para simular um sistema real, facilitando a compreensão da interconexão dos conceitos de POO.

---

## 📝 Lista de Exercícios

A seguir, estão os 10 exercícios propostos, com foco na aplicação combinada dos conceitos de POO.

### Exercício 1: Modelagem de Veículo Base (Abstração e Encapsulamento)

**Objetivo:** Criar a estrutura base para todos os veículos do sistema, aplicando os princípios de Abstração e Encapsulamento.

1.  Crie uma **classe abstrata** chamada `Veiculo`.
2.  Defina os seguintes atributos como **privados** (Encapsulamento): `marca` (String), `modelo` (String), `ano` (int).
3.  Crie um construtor para inicializar esses atributos.
4.  Implemente os métodos *getters* para todos os atributos.
5.  Crie os métodos **abstratos** `acelerar()` (void) e `frear()` (void).

### Exercício 2: Especialização de Veículos (Herança e Encapsulamento)

**Objetivo:** Utilizar a Herança para criar tipos específicos de veículos e aplicar o Encapsulamento em seus atributos únicos.

1.  Crie duas classes concretas: `Carro` e `Moto`.
2.  Ambas as classes devem **herdar** de `Veiculo`.
3.  Na classe `Carro`, adicione um atributo privado `numeroPortas` (int).
4.  Na classe `Moto`, adicione um atributo privado `cilindrada` (int).
5.  Implemente os construtores de `Carro` e `Moto`, chamando o construtor da superclasse (`Veiculo`) e inicializando seus atributos específicos.

### Exercício 3: Implementação Polimórfica (Polimorfismo e Herança)

**Objetivo:** Demonstrar o Polimorfismo implementando os métodos abstratos de forma específica em cada subclasse.

1.  Na classe `Carro`, implemente os métodos `acelerar()` e `frear()`. A aceleração deve imprimir "Carro acelerando suavemente."
2.  Na classe `Moto`, implemente os métodos `acelerar()` e `frear()`. A aceleração deve imprimir "Moto acelerando rapidamente com rugido."

### Exercício 4: Interface de Manutenção (Abstração - Interface e Polimorfismo)

**Objetivo:** Introduzir o conceito de Abstração via Interface para definir um comportamento comum que pode ser implementado por classes não relacionadas.

1.  Crie uma **interface** chamada `Manutencao`.
2.  Defina um método `realizarManutencao()` (String) que retorna uma mensagem sobre o tipo de manutenção realizada.
3.  Faça com que as classes `Carro` e `Moto` **implementem** a interface `Manutencao`.
4.  Implemente o método `realizarManutencao()` em cada classe com uma mensagem específica (ex: "Manutenção de 4 pneus e óleo" para `Carro`).

### Exercício 5: Encapsulamento Avançado (Encapsulamento e Abstração)

**Objetivo:** Reforçar o Encapsulamento adicionando lógica de validação nos métodos *setters*.

1.  Na classe abstrata `Veiculo`, crie os métodos *setters* para `marca`, `modelo` e `ano`.
2.  No *setter* de `ano`, adicione uma regra de validação: o ano não pode ser um valor futuro. Se for, lance uma exceção ou defina o ano como o ano atual (utilize `java.time.Year.now().getValue()` para o ano atual).

### Exercício 6: Classe de Gestão (Polimorfismo e Herança)

**Objetivo:** Criar uma classe que utiliza o Polimorfismo para gerenciar diferentes tipos de objetos de uma mesma hierarquia.

1.  Crie uma classe chamada `Garagem`.
2.  `Garagem` deve ter um atributo privado que é uma lista (`List`) de objetos do tipo `Veiculo`.
3.  Crie um método `adicionarVeiculo(Veiculo veiculo)` para adicionar um veículo à lista.
4.  Crie um método `iniciarTodos()` que itera sobre a lista de veículos e chama o método `acelerar()` para cada um, demonstrando o Polimorfismo.

### Exercício 7: Método Abstrato com Retorno (Abstração e Herança)

**Objetivo:** Praticar a Abstração com métodos que exigem um retorno e a Herança na implementação da lógica.

1.  Adicione um método **abstrato** `calcularCustoViagem(double distanciaKm)` (double) na classe `Veiculo`.
2.  Implemente este método em `Carro` com uma lógica de custo (ex: `distanciaKm * 0.50`).
3.  Implemente este método em `Moto` com uma lógica de custo diferente (ex: `distanciaKm * 0.25`).

### Exercício 8: Herança de Interfaces (Abstração - Interface)

**Objetivo:** Demonstrar como interfaces podem herdar de outras interfaces para compor contratos de comportamento.

1.  Crie uma nova **interface** chamada `TransportePassageiros`.
2.  A interface `TransportePassageiros` deve **estender** a interface `Manutencao`.
3.  Adicione um novo método `embarcarPassageiro(int quantidade)` (boolean) que retorna `true` se o embarque for bem-sucedido.

### Exercício 9: Nova Subclasse e Interface (Herança e Abstração)

**Objetivo:** Criar uma nova classe que herda de uma classe abstrata e implementa uma interface que herda de outra.

1.  Crie uma nova subclasse `Onibus` que **herda** de `Veiculo`.
2.  A classe `Onibus` deve **implementar** a interface `TransportePassageiros`.
3.  Implemente todos os métodos abstratos e de interface necessários (`acelerar()`, `frear()`, `calcularCustoViagem()`, `realizarManutencao()`, `embarcarPassageiro()`).

### Exercício 10: Teste de Polimorfismo em Coleção (Polimorfismo e Encapsulamento)

**Objetivo:** Criar uma classe de teste final que utiliza o Polimorfismo de Interfaces para realizar operações em uma coleção mista de objetos.

1.  Crie uma classe `Oficina`.
2.  `Oficina` deve ter um método estático `servicoGeral(List<Manutencao> itensParaManutencao)`.
3.  Dentro do método, itere sobre a lista e chame o método `realizarManutencao()` para cada item. Imprima o resultado.
4.  No método `main` de uma classe de teste, crie instâncias de `Carro`, `Moto` e `Onibus`.
5.  Adicione essas instâncias a uma lista do tipo `Manutencao` e chame o método `servicoGeral()`, provando que o Polimorfismo de Interfaces funciona.

---

## 🚀 Como Começar

Para começar a praticar, você pode seguir a estrutura de pacotes e classes sugerida abaixo:

```
src/
├── com/
│   └── trybe/
│       └── veiculos/
│           ├── Veiculo.java (Classe Abstrata)
│           ├── Carro.java
│           ├── Moto.java
│           ├── Onibus.java
│           ├── Manutencao.java (Interface)
│           ├── TransportePassageiros.java (Interface)
│           ├── Garagem.java
│           ├── Oficina.java
│           └── Main.java (Classe de Teste)
```

**Dica:** Crie um projeto Java simples no seu IDE (IntelliJ, VS Code, Eclipse) e comece a codificar as classes na ordem proposta!

---

## 🤝 Contribuições

Sinta-se à vontade para criar *pull requests* com suas soluções para cada exercício!

**Autor:** Manus AI (a seu serviço)
**Data:** Dezembro de 2025
