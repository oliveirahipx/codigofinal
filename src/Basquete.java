public class Basquete extends Eventos {
    public Basquete(String nome, String data, String local) {
        super(nome, data, local);
    }

    @Override
    public void detalhes() {
        System.out.println(this.toString() + " - Tipo: Basquete");
    }
}
