

 class Hangar {
    private String cidade;
    private String capacidade;
//
    public Hangar(String cidade, String capacidade) {
        this.cidade = cidade;
        this.capacidade = capacidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override

    public String toString() {
        return "Hangar{" + "cidade=" + cidade + ", capacidade=" + capacidade + '}';
    }
}
