
 class Voo {

    private String origem;
    private String destino;
    private String data;
    private String hora;
    private String numVoo;

    public Voo(String origem, String destino, String data, String hora, String numVoo) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
        this.numVoo = numVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNumero() {
        return numVoo;
    }
    //
    public void setNumero(String numVoo) {
        this.numVoo = numVoo;
    }

    @Override

    public String toString() {
        return "Voo{" + "origem=" + origem + ", destino=" + destino + ", data=" + data + ", hora=" + hora + ", numVoo=" + numVoo + '}';
    }

}