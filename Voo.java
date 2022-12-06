import java.sql.PreparedStatement;

public class Voo {
    
    private int id;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private NumeroGeneric<String, Integer> numero;
    private char tipo;
    private int idPista;
    private Pista pista;
    private int idHelicoptero;
    private Helicoptero helicoptero;
    private int idJato;
    private Jato jato; 
    private int idAviao;
    private Aviao aviao;

    public Voo() {

    }

    public Voo(
        int id, 
        String letra, 
        int num, 
        String data, 
        String hora, 
        String origem, 
        String destino, 
        String piloto, 
        String copiloto, 
        String observacao, 
        char tipo,
        int idPista, 
        Pista pista, 
        int idHelicoptero, 
        Helicoptero helicoptero, 
        int idJato, 
        Jato jato, 
        int idAviao, 
        Aviao aviao) throws Exception 
        {
            this.id = id;
            this.numero = new NumeroGeneric<String,Integer>(letra, num);
            this.data = data;
            this.hora = hora;
            this.origem = origem;
            this.destino = destino;
            this.piloto = piloto;
            this.copiloto = copiloto;
            this.observacao = observacao;
            this.idPista = idPista;
            this.pista = pista;
            this.idHelicoptero = idHelicoptero;
            this.helicoptero = helicoptero;
            this.idJato = idJato;
            this.jato = jato;
            this.idAviao = idAviao;
            this.aviao = aviao;
            this.tipo = tipo;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO voo (id, numero, data, hora, origem, destino, piloto, copiloto, observacao, tipo, idPista, idHelicoptero, idJato, idAviao) VALUES (" + id + "," 
            + numero + "," + data + "," + hora + "," + origem + "," + destino + "," + piloto + "," + copiloto + "," + observacao + "," + tipo + "," + idPista + "," 
            + idHelicoptero + "," + idJato + "," + idAviao + ");"
        );
        stmt.execute();
        stmt.close();
    }

    public Voo(
        String letra, 
        int num, 
        String data, 
        String hora, 
        String origem, 
        String destino, 
        String piloto, 
        String copiloto, 
        String observacao, 
        int idPista, 
        Pista pista, 
        char tipo, 
        Aeronave aeromodelo, 
        int idAeromodelo) throws Exception 
        {
            this.numero = new NumeroGeneric<String,Integer>(letra, num);
            this.data = data;
            this.hora = hora;
            this.origem = origem;
            this.destino = destino;
            this.piloto = piloto;
            this.copiloto = copiloto;
            this.observacao = observacao;
            this.idPista = idPista;
            this.pista = pista;
            this.tipo = tipo;
            
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, tipo, idPista, idAeromodelo) VALUES (" 
                + numero + "," + data + "," + hora + "," + origem + "," + destino + "," + piloto + "," + copiloto + "," + observacao + "," + tipo + "," + idPista + "," 
                + idAeromodelo + ");"
            );
            stmt.execute();
            stmt.close();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(String letra, int num) {
        this.numero = new NumeroGeneric<String,Integer>(letra, num);
    }

    public NumeroGeneric<String, Integer> getNumero() {
        return numero;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Pista getPista() {
        return pista;
    }

    public void setIdHelicoptero(int idHelicoptero) {
        this.idHelicoptero = idHelicoptero;
    }

    public int getIdHelicoptero() {
        return idHelicoptero;
    }

    public void setHelicoptero(Helicoptero helicoptero) {
        this.helicoptero = helicoptero;
    }

    public Helicoptero getHelicoptero() {
        return helicoptero;
    }

    public void setIdJato(int idJato) {
        this.idJato = idJato;
    }

    public int getIdJato() {
        return idJato;
    }

    public void setJato(Jato jato) {
        this.jato = jato;
    }

    public Jato getJato() {
        return jato;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Numero: " + numero + " | Data: " + data + " | Hora: " + hora + " | Origem: " + origem + " | Destino: " + destino + " | Piloto: " + piloto +
        " | Copiloto: " + copiloto + " | Observacao: " + observacao + " | Tipo: " + tipo + " | IdPista: " + idPista + " | Pista: " + pista + " | IdHelicoptero: " + idHelicoptero +
        " | Helicoptero: " + helicoptero + " | IdJato: " + idJato + " | Jato: " + jato + " | IdAviao: " + idAviao + " | Aviao: " + aviao;
    }

   
}
