package Aeroporto.java;

private class Voo {

    private String origem;
    private String destino;
    private String data;
    private String hora;
    private int id;
    private int idAviao;
    private int idHelicoptero;
    private Aviao aviao;
    private Helicoptero helicoptero;

    public Voo(String origem, String destino, String data, String hora, Aviao aviao) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
        this.aviao = aviao;
        this.idAviao = aviao.id;
        this.id = Voo.voos.size() + 1;
        aviao.voos.add(this);
        Voo.voos.add(this);
    }

    public Voo(String origem, String destino, String data, String hora, Helicoptero helicoptero) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
        this.helicoptero = helicoptero;
        this.idHelicoptero = helicoptero.id;
        this.id = Voo.voos.size() + 1;
        helicoptero.voos.add(this);
        Voo.voos.add(this);
    }

    @Override
    public String toString() {
        return "Origem: " + this.origem
            + "\nDestino: " + this.destino
            + "\nData: " + this.data
            + "\nHora: " + this.hora;
    }

}



