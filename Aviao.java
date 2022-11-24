import.java.util.ArrayList;
import.java.util.List;

private class Aviao{
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int capacidade;
    private int id;
    private int idCompanhia;
    private int idHangar;
    private int idPista;
    private Companhia companhia;
    private Hangar hangar;
    private Pista pista;
    private List<Voo> voos = new ArrayList<>();

    public Aviao(
        String modelo,
        String marca,
        String cor,
        int ano,
        int capacidade,
        Companhia companhia,
        Hangar hangar,
        Pista pista
    ) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.capacidade = capacidade;
        this.companhia = companhia;
        this.hangar = hangar;
        this.pista = pista;
        this.idCompanhia = companhia.id;
        this.idHangar = hangar.id;
        this.idPista = pista.id;
        this.id = Aviao.avioes.size() + 1;

        companhia.avioes.add(this);
        hangar.avioes.add(this);
        pista.avioes.add(this);

        Aviao.avioes.add(this);
    }

    @Override
    public String toString() {
        return "Modelo: " + this.modelo
            + "\nMarca: " + this.marca
            + "\nCor: " + this.cor
            + "\nAno: " + this.ano
            + "\nCapacidade: " + this.capacidade
            + "\nCompanhia: " + this.companhia.nome
            + "\nHangar: " + this.hangar.nome
            + "\nPista: " + this.pista.nome;
    }
}