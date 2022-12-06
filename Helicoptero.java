import java.sql.PreparedStatement;

public class Helicoptero extends Aeronave{
    
    private int capacidade;
    private String cor;

    public Helicoptero() {

    }

    public Helicoptero(int id, String marca, String modelo, int capacidade, String cor) throws Exception {
        super(id, marca, modelo);
        this.capacidade = capacidade;
        this.cor = cor;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO helicoptero (id, marca, modelo, cor, capacidade) VALUES (" + id + "," + marca + "," + modelo + "," + cor + "," + capacidade + ");"
        );
        stmt.execute();
        stmt.close();
    }

    public Helicoptero(String marca, String modelo, int capacidade, String cor) throws Exception {
        super(marca, modelo);
        this.capacidade = capacidade;
        this.cor = cor;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO helicoptero (marca, modelo, cor, capacidade) VALUES (" + marca + "," + modelo + "," + cor + "," + capacidade + ");"
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

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

   
    @Override
    public String toString() {
        return "Id: " + getId() + " | Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Cor: " + getCor() + " | Capacidade: " + getCapacidade();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Helicoptero) {
            Helicoptero heli = (Helicoptero) obj;
            return heli.getId() == getId();
        }
        return false;
    }

    public static Helicoptero getById(int id) {
        return new Helicoptero();
    }

}
