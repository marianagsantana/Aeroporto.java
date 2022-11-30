package Aeroporto.java;

private class Pista {
    private String nome;
    private String cidade;
    private int id;
    private List<Aviao> avioes = new ArrayList<>();
    private List<Helicoptero> helicopteros = new ArrayList<>();

    public Pista(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.id = Pista.pistas.size() + 1;
        Pista.pistas.add(this);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome
            + "\nCidade: " + this.cidade;
    }
    
}

Compare this snippet from Aeroporto.java\Voo.java:

