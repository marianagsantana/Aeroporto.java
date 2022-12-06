import java.sql.PreparedStatement;
import java.sql.Types;

public class Voo {
    
    private int id;
    private String data;
    private String hora;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private String origem;
    private NumeroGeneric<String, Integer> numeroVoo;
    private Jato jato; 
    private int idJato;
    private Aviao aviao;
    private int idAviao;
    private int idAeronave;
    private int idHelicoptero;
    private Helicoptero helicoptero;
    private Aeronave aeronave;
    private Pista pista;
    private int idPista;
    

    public Voo() {

    }

    public Voo(int id, String letra, int numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int tipo, Aeronave aeronave, int idAeronave) throws Exception {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
        this.copiloto = copiloto;
        this.piloto = piloto;
        this.numeroVoo = new NumeroGeneric<String,Integer>(letra, numero);
        this.observacao = observacao;
        this.idPista = idPista;
        this.pista = pista;
        this.aeronave = aeronave;
        this.idAeronave = idAeronave;
        
        if (tipo == 1) {
            System.out.println(idAeronave);
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numeroVoo.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setInt(10, idAeronave);
            stmt.setNull(11, Types.NULL);
            stmt.setNull(12, Types.NULL);
            stmt.execute();
            stmt.close();
        } else if (tipo == 2) {
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numeroVoo.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setNull(10, Types.NULL);
            stmt.setInt(11, idAeronave);
            stmt.setNull(12, Types.NULL);
            stmt.execute();
            stmt.close();
        } else if (tipo == 3) {
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numeroVoo.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setNull(10, Types.NULL);
            stmt.setNull(11, Types.NULL);
            stmt.setInt(12, idAeronave);
            stmt.execute();
            stmt.close();
        }

    }

    public Voo(String letra, int numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int tipo, Aeronave aeronave, int idAeronave) throws Exception {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
        this.copiloto = copiloto;
        this.piloto = piloto;
        this.numeroVoo = new NumeroGeneric<String,Integer>(letra, numero);
        this.observacao = observacao;
        this.idPista = idPista;
        this.pista = pista;
        this.aeronave = aeronave;
        this.idAeronave = idAeronave;
        
        if (tipo == 1) {
            System.out.println(idAeronave);
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numeroVoo.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setInt(10, idAeronave);
            stmt.setNull(11, Types.NULL);
            stmt.setNull(12, Types.NULL);
            stmt.execute();
            stmt.close();
        } else if (tipo == 2) {
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numeroVoo.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setNull(10, Types.NULL);
            stmt.setInt(11, idAeronave);
            stmt.setNull(12, Types.NULL);
            stmt.execute();
            stmt.close();
        } else if (tipo == 3) {
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numeroVoo.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setNull(10, Types.NULL);
            stmt.setNull(11, Types.NULL);
            stmt.setInt(12, idAeronave);
            stmt.execute();
            stmt.close();
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(String letra, int numero) {
        this.numeroVoo = new NumeroGeneric<String,Integer>(letra, numero);
    }

    public NumeroGeneric<String, Integer> getNumero() {
        return numeroVoo;
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

    public void setAeronave (Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setidAeronave(int idAeronave) {
        this.idAeronave = idAeronave;
    }

    public int getidAeronave() {
        return idAeronave;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Numero: " + numeroVoo + " | Data: " + data + " | Hora: " + hora + " | Origem: " + origem + " | Destino: " + destino + " | Piloto: " + piloto +
        " | Copiloto: " + copiloto + " | Observacao: " + observacao + " | IdPista: " + idPista + " | Pista: " + pista + " | IdHelicoptero: " + idHelicoptero +
        " | Helicoptero: " + helicoptero + " | IdJato: " + idJato + " | Jato: " + jato + " | IdAviao: " + idAviao + " | Aviao: " + aviao;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Voo) {
            Voo voo = (Voo) obj;
            return voo.getId() == id;
        }
        return false;
    }
}
