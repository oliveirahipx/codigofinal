public class Futebol extends Eventos {
    public Futebol(String nome, String data, String local) {
        super(nome, data, local);
    }

    @Override
    public void detalhes() {
        System.out.println(this.toString() + " - Tipo: Futebol");
    }
}
