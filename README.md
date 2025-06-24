# 📝 Gerenciador de Tarefas Recentes

Este projeto simples em **Java** demonstra o uso da interface **Deque** para criar um sistema de gerenciamento de tarefas que mantém um **histórico das atividades mais recentes**.

É ideal para iniciantes que desejam entender como manipular coleções de dados de **ambas as extremidades** (adicionar no início e remover no final).

---

## 🚀 Objetivo

O principal objetivo é **simular um histórico de tarefas**.  
Imagine que você tem um limite de, digamos, **5 tarefas** que podem ser armazenadas.  
Quando uma nova tarefa é adicionada e o limite é excedido, **a tarefa mais antiga é automaticamente removida** para dar lugar à nova.

---

## 🛠️ Estrutura do Projeto

O projeto é composto por **três classes principais**:

### 1. `Tarefa`
- **Função:** Representa uma única tarefa.
- **Atributos:**
  - `descricao`: Uma breve descrição da tarefa (ex: "Enviar e-mail").
  - `timestamp`: O momento exato em que a tarefa foi criada, útil para determinar qual tarefa é a mais antiga.

---

### 2. `GerenciadorTarefasRecentes`
- **Função:** É o coração do projeto, responsável por gerenciar a coleção de tarefas recentes usando uma **Deque**.
- **Principais Funcionalidades:**
  - `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao histórico.  
    Se a capacidade máxima for atingida, a tarefa mais antiga é automaticamente removida.
  - `obterTarefasRecentes()`: Retorna todas as tarefas atualmente armazenadas no histórico.
  - `limparTarefas()`: Remove todas as tarefas do histórico.
  - `obterQuantidadeTarefas()`: Informa quantas tarefas estão atualmente no histórico.

---

### 3. `AplicacaoGerenciador`
- **Função:** Contém o método `main` e serve como **interface de usuário do projeto**.
- **Funcionalidade:**  
  Apresenta um **menu interativo no console**, permitindo ao usuário:
  - Adicionar tarefas
  - Visualizar o histórico
  - Limpar as tarefas
  - Verificar a quantidade de tarefas

---

## 💡 Como Funciona a Deque Aqui?

A **Deque (Double-Ended Queue)** é crucial para este projeto porque permite:

- **Adicionar novas tarefas no início** do histórico:  
  → `offerFirst(tarefa)`
- **Remover as tarefas mais antigas** (quando o limite é excedido) **do final**:  
  → `pollLast()`

Isso garante que o histórico esteja sempre atualizado com as tarefas mais recentes, mantendo a **capacidade definida**.

---

## ▶️ Como Executar

1. Compile os arquivos `.java` com o `javac`:
   ```bash
   javac Tarefa.java GerenciadorTarefasRecentes.java AplicacaoGerenciador.java
