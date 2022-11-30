import.java.util.ArrayList;
import.java.util.List;

private class Hangar {
    private String nome;
    private String cidade;
    private int id;
    private List<Aviao> avioes = new ArrayList<>();

    public Hangar(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.id = Hangar.hangares.size() + 1;
        Hangar.hangares.add(this);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome
            + "\nCidade: " + this.cidade;
    }
} 