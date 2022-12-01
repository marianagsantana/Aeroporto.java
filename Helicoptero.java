class Helicoptero{
    private String prefixoHelicptero;
    private String cor;

    public Helicoptero(String prefixoHelicptero, String cor) {
        this.prefixoHelicptero = prefixoHelicptero;
        this.cor = cor;
    }

    public String getPrefixoHelicptero() {
        return prefixoHelicptero;
    }

    public void setPrefixoHelicptero(String prefixoHelicptero) {
        this.prefixoHelicptero = prefixoHelicptero;
    }

    public String getCor() {
        return cor;
    }
//
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override

    public String toString() {
        return "Helicoptero{" + "prefixoHelicptero=" + prefixoHelicptero + ", cor=" + cor + '}';
    }

}

