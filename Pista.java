
class Pista {
    private String cidade;
    private String estado;
    private String pais;
    private String numPista;

    public Pista(String cidade, String estado, String pais, String numPista) {
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numPista = numPista;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumero() {
        return numPista;
    }

    public void setNumero(String numPista) {
        this.numPista = numPista;
    }

    @Override

    public String toString() {
        return "Pista{" + "cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", numero=" + numPista + '}';
    }
}