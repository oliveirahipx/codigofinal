
public abstract class Eventos {
    protected String nome;
    protected String data;
    protected String local;
    protected Time time;

    public Eventos(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public abstract void detalhes();

    public void exibirTime() {
        if (time != null) {
            time.exibirTimes();
        } else {
            System.out.println("Nenhum time cadastrado para este evento.");
        }
    }
}
