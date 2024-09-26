import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorEventos gerenciador = new GerenciadorEventos();
         int escolha = 0;

        while (escolha != 5) {
            System.out.println("*******************");
            System.out.println("*****Interface*****");
            System.out.println("*******************");
            System.out.println("1 - Adicionar evento de Futebol");
            System.out.println("2 - Adicionar evento de Basquete");
            System.out.println("3 - Adicionar evento de Voleibol");
            System.out.println("4 - Ver eventos");
            System.out.println("5 - Sair ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    adicionarEventoFutebol(sc, gerenciador);
                    break;
                case 2:
                    adicionarEventoBasquete(sc, gerenciador);
                    break;
                case 3:
                    adicionarEventoVoleibol(sc, gerenciador);
                    break;
                case 4:
                    gerenciador.exibirEventos();
                    System.out.println("Pressione Enter para retornar.");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }

    // Método para limpar o console
    public static void clear() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void adicionarEventoFutebol(Scanner sc, GerenciadorEventos gerenciador) {
        clear();
        System.out.println("Digite o nome do evento de Futebol:");
        String nome = sc.nextLine();
        System.out.println("Digite a data (dd/MM/yyyy):");
        String data = sc.nextLine();
        System.out.println("Digite o local:");
        String local = sc.nextLine();
        Futebol evento = new Futebol(nome, data, local);
        gerenciador.adicionarEvento(evento);
        gerenciador.cadastrarTime(evento); // Adiciona time após o evento
        System.out.println("Evento de Futebol adicionado com sucesso!");
        System.out.println("Pressione Enter para retornar.");
        sc.nextLine();
        clear();
    }

    public static void adicionarEventoBasquete(Scanner sc, GerenciadorEventos gerenciador) {
        clear();
        System.out.println("Digite o nome do evento de Basquete:");
        String nome = sc.nextLine();
        System.out.println("Digite a data (dd/MM/yyyy):");
        String data = sc.nextLine();
        System.out.println("Digite o local:");
        String local = sc.nextLine();
        Basquete evento = new Basquete(nome, data, local);
        gerenciador.adicionarEvento(evento);
        gerenciador.cadastrarTime(evento); // Adiciona time após o evento
        System.out.println("Evento de Basquete adicionado com sucesso!");
        System.out.println("Pressione Enter para retornar.");
        sc.nextLine();
        clear();
    }

    public static void adicionarEventoVoleibol(Scanner sc, GerenciadorEventos gerenciador) {
        clear();
        System.out.println("Digite o nome do evento de Voleibol:");
        String nome = sc.nextLine();
        System.out.println("Digite a data (dd/MM/yyyy):");
        String data = sc.nextLine();
        System.out.println("Digite o local:");
        String local = sc.nextLine();
        Volei evento = new Volei(nome, data, local);
        gerenciador.adicionarEvento(evento);
        gerenciador.cadastrarTime(evento); // Adiciona time após o evento
        System.out.println("Evento de Voleibol adicionado com sucesso!");
        System.out.println("Pressione Enter para retornar.");
        sc.nextLine();
        clear();
    }
}
