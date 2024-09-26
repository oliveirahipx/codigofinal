public class Volei extends Eventos {
    public Volei(String nome, String data, String local) {
        super(nome, data, local);
    }

    @Override
    public void detalhes() {
        System.out.println(this.toString() + " - Tipo: Voleibol");
    }
}
