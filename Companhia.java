import.java.util.ArrayList;
import.java.util.List;

private class Companhia {
    private String nome;
    private String pais;
    private int id;
    private List<Aviao> avioes = new ArrayList<>();

    public Companhia(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.id = Companhia.companhias.size() + 1;
        Companhia.companhias.add(this);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome
            + "\nPais: " + this.pais;
    }
}
