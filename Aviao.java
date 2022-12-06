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
        
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO aviao (marca, modelo, prefixo, capacidade, companhia_id) VALUES (" + id + "," + marca + "," + modelo + "," + prefixo + "," + capacidade + "," + idCompanhia + ");"
        );
        stmt.execute();
        stmt.close();
    }

    public Aviao(String marca, String modelo, String letra, int numero, int capacidade, int idCompanhia) throws Exception {
        super(marca, modelo);
        this.prefixo = new NumeroGeneric<String,Integer>(letra, numero);
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO aviao (marca, modelo, prefixo, capacidade, companhia_id) VALUES (" + marca + "," + modelo + "," + prefixo + "," + capacidade + "," + idCompanhia + ");"
        );
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
        this.prefixo = prefixo;;
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
        return "Id: " + super.getId() + " Marca: " + super.getMarca() + " Modelo: " + super.getModelo() + " Prefixo: " + prefixo + " Capacidade: " + capacidade + " Companhia: " + idCompanhia;
    }
    
}
