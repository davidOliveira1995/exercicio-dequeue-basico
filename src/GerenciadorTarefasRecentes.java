import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Scanner;

public class GerenciadorTarefasRecentes {

    private Deque<Tarefa> dequeDeTarefas;
    private int capacidadeMaxima;

    public GerenciadorTarefasRecentes(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
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
        return null;
    }

    public void limparTarefa() {

    }

    public int getQuantidadeTarefas() {
        return 0;
    }
}
