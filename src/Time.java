import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<String> titulares;
    private List<String> reservas;

    public Time(String nome) {
        this.nome = nome;
        this.titulares = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<String> getTitulares() {
        return titulares;
    }

    public List<String> getReservas() {
        return reservas;
    }

    public void adicionarTitular(String atleta) {
        if (titulares.size() < 6) {
            titulares.add(atleta);
        } else {
            System.out.println("Limite de titulares atingido.");
        }
    }

    public void adicionarReserva(String atleta) {
        if (reservas.size() < 6) {
            reservas.add(atleta);
        } else {
            System.out.println("Limite de reservas atingido.");
        }
    }

    public void exibirTimes() {
        System.out.println("Time: " + nome);
        System.out.println("Titulares: " + titulares);
        System.out.println("Reservas: " + reservas);
        System.out.println("-----------------------------");
    }
}
