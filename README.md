##Gerenciador de Tarefas Recentes
Este projeto simples em Java demonstra o uso da interface Deque para criar um sistema de gerenciamento de tarefas que mantém um histórico das atividades mais recentes. É ideal para iniciantes que desejam entender como manipular coleções de dados de ambas as extremidades (adicionar no início e remover no final).

#🚀 Objetivo
O principal objetivo é simular um histórico de tarefas. Imagine que você tem um limite de, digamos, 5 tarefas que podem ser armazenadas. Quando uma nova tarefa é adicionada e o limite é excedido, a tarefa mais antiga é automaticamente removida para dar lugar à nova.

##🛠️ Classes do Projeto
O projeto é composto por três classes principais:
---
### 1. Tarefa
Função: Representa uma única tarefa.
Atributos:
descricao: Uma breve descrição da tarefa (ex: "Enviar e-mail").
timestamp: O momento exato em que a tarefa foi criada, útil para determinar qual tarefa é a mais antiga.
### 2. GerenciadorTarefasRecentes
Função: É o coração do projeto, responsável por gerenciar a coleção de tarefas recentes. Utiliza uma Deque internamente para isso.
Principais Funcionalidades:
Adicionar Tarefa: Adiciona uma nova tarefa ao histórico. Se a capacidade máxima for atingida, a tarefa mais antiga é automaticamente removida.
Obter Tarefas Recentes: Retorna todas as tarefas atualmente armazenadas no histórico.
Limpar Tarefas: Remove todas as tarefas do histórico.
Obter Quantidade de Tarefas: Informa quantas tarefas estão atualmente no histórico.
### 3. AplicacaoGerenciador
Função: Contém o método main e serve como a interface de usuário do projeto.
Funcionalidade: Apresenta um menu interativo no console, permitindo ao usuário adicionar tarefas, visualizar o histórico, limpar as tarefas e verificar a quantidade de itens. É por aqui que você interage com o GerenciadorTarefasRecentes.
---
##💡 Como Funciona a Deque Aqui?
A Deque (Double-Ended Queue) é crucial para este projeto porque permite:

Adicionar novas tarefas no início do histórico (offerFirst()).
Remover as tarefas mais antigas (quando o limite é excedido) do final do histórico (pollLast()).
Isso garante que o histórico esteja sempre atualizado com as tarefas mais recentes, mantendo a capacidade definida.

Como Executar
Para executar este projeto, compile as classes Java e execute a classe AplicacaoGerenciador. Siga as opções do menu no console para interagir com o sistema.
