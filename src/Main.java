import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefas filaAtual = new GerenciadorDeTarefas();

        Scanner scan = new Scanner(System.in);


            boolean programaFinalizado = false;
            do {

                System.out.println("--- Menu ---");

                System.out.println("1. Adicionar tarefa.");
                System.out.println("2. Processar tarefa.");
                System.out.println("3. Visualizar proxima tarefa.");
                System.out.println("4. Numero de tarefas pendentes.");
                System.out.println("5. Se está vazio.");
                System.out.println("6. Sair.");

                System.out.print("Opção: ");

                int option = scan.nextInt();
                scan.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Opção 1: Adicionar tarefa.");
                        System.out.println("Digite um número indentificador: ");
                        int id = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Digite uma descrição para tarefa: ");
                        String descricao = scan.nextLine();

                        System.out.println("Status atual do iten: ");
                        String status = scan.nextLine();

                        Tarefa novaTarefa = new Tarefa(id, descricao, status);
                        filaAtual.adicionarTarefa(novaTarefa);
                        break;
                    case 2:
                        System.out.println("Opção 2: Processar tarefa.");

                        filaAtual.processarProximaTarefa();
                        break;
                    case 3:
                        System.out.println("Opção 3: Visualizar próxima tarefa.");

                        System.out.println(filaAtual.visualizarProximaTarefa());
                        break;
                    case 4:

                        System.out.println("Opção 4: Número de tarefas pendentes.");
                        int qtdTarefa = filaAtual.getNumeroDeTarefasPendentes();
                        System.out.println("Quantidade de tarefas pendentes: " + qtdTarefa);
                        break;
                    case 5:
                        System.out.println("Opção 5: Está vazio?");
                        if (filaAtual.estaVazio()) {
                            System.out.println("A lista está vazia!");
                        } else {
                            System.out.println("A lista ainda possui tarefas.");
                        }
                        break;
                    case 6:
                        System.out.println("Opção 6: Sair.");
                        System.out.println("Saindo...");
                        programaFinalizado = true;
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número de 1 a 6.");
                        break;
                }
            } while (!programaFinalizado);
    }
}