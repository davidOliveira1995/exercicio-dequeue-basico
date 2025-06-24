import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AplicacaoGerenciador {
    public static void main(String[] args) {

        GerenciadorTarefasRecentes tarefasRecentes = new GerenciadorTarefasRecentes(5);
        Scanner scan = new Scanner(System.in);

        boolean programaFinalizado = false;
        do {
            pulaLinha();
            System.out.println("--- Menu ---");
            System.out.println("1. Adicionar tarefa.");
            System.out.println("2. Obter tarefa recente.");
            System.out.println("3. Limpar tarefa.");
            System.out.println("4. Quantidade de tarefas.");
            System.out.println("5. Sair.");

            System.out.print("Opção: ");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1:
                    pulaLinha();
                    System.out.println("Opção 1: Adicionar tarefa!");
                    System.out.print("Descrição da tarefa: ");
                    String descricaoTarefaAtual = scan.nextLine();

                    tarefasRecentes.adicionarTarefa(descricaoTarefaAtual);
                    break;
                case 2:
                    pulaLinha();
                    System.out.println("Opção 2: Obter tarefa recente!");
                    System.out.println(tarefasRecentes.obterTarefaRecente());

                    break;
                case 3:
                    pulaLinha();
                    System.out.println("Opção 3: Limpar tarefas!");
                    tarefasRecentes.limparTarefa();
                    break;
                case 4:
                    pulaLinha();
                    System.out.println("Opção 4: Quantidade de tarefas!");
                    System.out.println("Você tem " + tarefasRecentes.getQuantidadeTarefas() + " tarefas!");

                    break;
                case 5:
                    pulaLinha();
                    System.out.println("Opção 5: Sair!");
                    System.out.println("Saindo...");
                    programaFinalizado = true;
                    break;
                default:
                    System.out.println("Digite um número válido entre 1 e 5.");
            }
        } while (!programaFinalizado);
    scan.close();
    }

    public static void pulaLinha() {
        System.out.println();
    }
}