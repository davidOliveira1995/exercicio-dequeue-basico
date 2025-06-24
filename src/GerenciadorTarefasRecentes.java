import java.util.*;

public class GerenciadorTarefasRecentes {

    private Deque<Tarefa> dequeDeTarefas;
    private int capacidadeMaxima;

    public GerenciadorTarefasRecentes(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.dequeDeTarefas = new ArrayDeque<>();
    }

    public void adicionarTarefa(String descricaoTarefa) {
        Long time = System.currentTimeMillis();
        Tarefa novaTarefa = new Tarefa(descricaoTarefa, time);

        dequeDeTarefas.offerFirst(novaTarefa);
        System.out.println("Nova tarefa adicionada com sucesso!");

        if (dequeDeTarefas.size() > capacidadeMaxima) {
            dequeDeTarefas.pollLast();
            System.out.println("Uma tarefa foi removida com sucesso!");
        }

    }

    public Collection<Tarefa> obterTarefaRecente() {
        List<Tarefa> listaDequeDeTarefas = new ArrayList<>();

        for (Tarefa c : dequeDeTarefas) {

            listaDequeDeTarefas.add(c);

        }
        return listaDequeDeTarefas;
    }

    public void limparTarefa() {
        dequeDeTarefas.clear();
        System.out.println("Lista de tarefas limpa com sucesso!");
    }

    public int getQuantidadeTarefas() {
        return dequeDeTarefas.size();
    }
}
