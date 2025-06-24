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
  - `timestamp`: O mom
