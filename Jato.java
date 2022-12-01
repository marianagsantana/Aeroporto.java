 class Jato{
    private String prefixoJato;
    private String cor;

    public Jato(String prefixoJato, String cor) {
        this.prefixoJato = prefixoJato;
        this.cor = cor;
    }

    public String getPrefixoJato() {
        return prefixoJato;
    }   

    public void setPrefixoJato(String prefixoJato) {
        this.prefixoJato = prefixoJato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override

    public String toString() {
        return "Jato{" + "prefixoJato=" + prefixoJato + ", cor=" + cor + '}';
    }

}