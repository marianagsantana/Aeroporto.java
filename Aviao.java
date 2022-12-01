class Aviao{

    private String prefixoAviao;
    private String cor;
    
    public Aviao(String prefixoAviao, String cor) {
        this.prefixoAviao = prefixoAviao;
        this.cor = cor;
    }

    public String getPrefixoAviao() {
        return prefixoAviao;
    }

    public void setPrefixoAviao(String prefixoAviao) {
        this.prefixoAviao = prefixoAviao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override

    public String toString() {
        return "Aviao{" + "prefixoAviao=" + prefixoAviao + ", cor=" + cor + '}';
    }   
}