import java.util.LinkedList;
import java.util.Queue;

public class GerenciadorDeTarefas {

    private Queue<Tarefa> filaDeTarefas;

    public GerenciadorDeTarefas() {
        this.filaDeTarefas = new LinkedList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        filaDeTarefas.offer(tarefa);
    }

    public Tarefa processarProximaTarefa() {

        Tarefa tarefaProcessada = null;

        if (filaDeTarefas.isEmpty()) {
            System.out.println("Você não possui tarefas listadas!");
        } else {
            System.out.println("Próximo iten a ser atendido: " + filaDeTarefas.peek());
            System.out.println("Processando tarefa: ");
            tarefaProcessada = filaDeTarefas.poll();

            System.out.println("A tarefa foi removida com sucesso!");
        }
        return tarefaProcessada;
    }

    public Tarefa visualizarProximaTarefa() {

        Tarefa proximaTarefa = null;

        if (filaDeTarefas.isEmpty()) {
            System.out.println("Você não possui tarefas listada!");
        } else {
            System.out.println("Próxima tarefa da lista: ");
            proximaTarefa = filaDeTarefas.peek();
        }
        return proximaTarefa;
    }

    public int getNumeroDeTarefasPendentes() {

        int tamanhoDaFila = filaDeTarefas.size();
        System.out.println("Tamanho da fila: ");
        return tamanhoDaFila;
    }

    public boolean estaVazio() {

        if (filaDeTarefas.isEmpty()) {

            return true;
        } else {

            return false;
        }
    }
}
