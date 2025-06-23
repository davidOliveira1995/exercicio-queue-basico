# 📋 Gerenciador de Tarefas Simples

Este projeto é uma aplicação de **console em Java** que simula um gerenciador de tarefas básico, utilizando o conceito de **fila (Queue)** para organizar e processar tarefas no padrão **FIFO (First-In, First-Out)**.

---

## 🔧 Funcionalidades

O sistema oferece as seguintes operações através de um **menu interativo**:

- ✅ **Adicionar Tarefa**: Permite criar uma nova tarefa (com ID e descrição) e adicioná-la ao final da fila.
- 🔄 **Processar Próxima Tarefa**: Remove e processa a tarefa que está no início da fila.
- 👀 **Visualizar Próxima Tarefa**: Exibe os detalhes da tarefa que está no início da fila sem removê-la.
- 📊 **Número de Tarefas Pendentes**: Informa quantas tarefas estão aguardando na fila.
- ❓ **Verificar se a Fila Está Vazia**: Indica se há ou não tarefas na fila.
- ❌ **Sair**: Encerra a aplicação.

---

## ▶️ Como Usar

Para rodar este projeto no terminal:

### 1. Compile o código

```bash
javac Main.java GerenciadorDeTarefas.java Tarefa.java
```
### 2. Execute a aplicação
``` bash
java Main
```
---
### 3. Interaja com o menu
Siga as instruções no console para adicionar, visualizar e processar tarefas.

## 🗂️ Estrutura do Projeto
O projeto é dividido em três classes principais:

Main.java: Contém o método main, que é o ponto de entrada da aplicação. Ele gerencia a interface do usuário e o menu de opções.

GerenciadorDeTarefas.java: Responsável por encapsular e gerenciar a fila de tarefas (usando java.util.Queue). Implementa as operações de adicionar, remover, visualizar, etc.

Tarefa.java: Uma classe simples que representa uma única tarefa, com atributos como ID, descrição e status.
---
## 🎓 Conceitos Chave Abordados
Este projeto é uma ótima forma de praticar e entender:

A interface Queue do Java Collections Framework.

O princípio FIFO (First-In, First-Out) na prática.

Encapsulamento e a organização de código em múltiplas classes.

Entrada e Saída de Dados via console (Scanner, System.out.println).

Estruturas de controle como do-while e switch-case.
---

## 💡 Sugestões Futuras
Persistência em arquivos ou banco de dados.

Interface gráfica com Swing ou JavaFX.

Sistema de prioridade para as tarefas.

## 🚀 Autor
Projeto desenvolvido como prática de estrutura de dados em Java.
Sinta-se à vontade para contribuir ou sugerir melhorias!
