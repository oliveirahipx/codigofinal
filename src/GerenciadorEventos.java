import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorEventos {
    private List<Eventos> eventos;

    public GerenciadorEventos() {
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(Eventos evento) {
        eventos.add(evento);
        System.out.println("Evento adicionado com sucesso!");
    }

    public void exibirEventos() {
        System.out.println("Eventos cadastrados:");
        for (Eventos evento : eventos) {
            evento.detalhes();
            System.out.println("-----------------------------");
        }
    }
    public void cadastrarTime(Eventos evento) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do time:");
    String nomeTime = sc.nextLine();
    Time time = new Time(nomeTime);

    System.out.println("Cadastro de Titulares (máximo de 6):");
    for (int i = 0; i < 6; i++) {
        System.out.println("Digite o nome do titular " + (i + 1) + ":");
        String atleta = sc.nextLine();
        time.adicionarTitular(atleta);
    }

    System.out.println("Cadastro de Reservas (máximo de 6):");
    for (int i = 0; i < 6; i++) {
        System.out.println("Digite o nome do reserva " + (i + 1) + ":");
        String atleta = sc.nextLine();
        time.adicionarReserva(atleta);
    }

    evento.setTime(time);
    System.out.println("Time cadastrado com sucesso!");
}

}
