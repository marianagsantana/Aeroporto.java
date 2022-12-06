import java.sql.PreparedStatement;

public class Aviao extends Aeronave{

    private int capacidade;
    private NumeroGeneric<String, Integer> prefixo;
    private Companhia companhia;
    private int idCompanhia;

    public Aviao() {

    }

    public Aviao(int id, String marca, String modelo, String letra, int numero, int capacidade, int idCompanhia) throws Exception {
        super(id, marca, modelo);
        this.prefixo = new NumeroGeneric<String,Integer>(letra, numero);
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia;   
        this.companhia = companhia;   

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO aviao (id, marca, modelo, prefixo, capacidade, companhia_id) VALUES (?, ?, ?, ?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, letra);
        stmt.setInt(5, numero);
        stmt.setInt(6, idCompanhia);
        stmt.execute();
        stmt.close();
    }

    public Aviao(String marca, String modelo, String letra, int numero, int capacidade, Companhia companhia, int idCompanhia) throws Exception {
        super(marca, modelo);
        this.capacidade = capacidade;
        this.prefixo = new NumeroGeneric<String,Integer>(letra, numero);
        this.idCompanhia = idCompanhia;
        this.companhia = companhia;  
    
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO aviao (marca, modelo, prefixo, capacidade, companhia_id) VALUES (?, ?, ?, ?, ?);"
        );
        stmt.setString(1, marca);
        stmt.setString(2, modelo);
        stmt.setString(3, prefixo.toString());
        stmt.setInt(4, capacidade);
        stmt.setInt(5, idCompanhia);
        stmt.execute();
        stmt.close();
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setPrefixo(String letra, int numero) {
        this.prefixo = new NumeroGeneric<String,Integer>(letra, numero);
    }

    public NumeroGeneric<String,Integer> getPrefixo() {
        return prefixo;
    }

    public void setIdCompanhia(int idCompanhia) {
        this.idCompanhia = idCompanhia;
    }

    public int getIdCompanhia() {
        return idCompanhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    @Override
    public String toString() {
        return "Id: " + super.getId() + " | Marca: " + super.getMarca() + " | Modelo: " + super.getModelo() + " | Prefixo: " + getPrefixo() + " | Capacidade: " + getCapacidade() + " | Companhia: " + getCompanhia();
    }

    public static Aviao getById(int id) {
        return new Aviao();
    }
    
}
