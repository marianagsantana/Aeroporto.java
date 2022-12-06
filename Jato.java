import java.sql.PreparedStatement;

public class Jato extends Aeronave{
    
    private String cor;
    private int velocidade;
   
    public Jato() {

    }

    public Jato(int id, String marca, String modelo, String cor, int velocidade) throws Exception {
        super(id, marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO jato (id, marca, modelo, cor, velocidade) VALUES (" + id + "," + marca + "," + modelo + "," + cor + "," + velocidade + ");"
        );
        stmt.execute();
        stmt.close();
    }

    public Jato(String marca, String modelo, String cor, int velocidade) throws Exception {
        super(marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO jato (marca, modelo, cor, velocidade) VALUES (" + marca + "," + modelo + "," + cor + "," + velocidade + ");"
        );
        stmt.execute();
        stmt.close();
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " | Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Cor: " + getCor() + " | Velocidade: " + getVelocidade();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Jato) {
            Jato jato = (Jato) obj;
            return jato.getId() == getId() && jato.getMarca().equals(getMarca()) && jato.getModelo().equals(getModelo()) && jato.getCor().equals(getCor()) && jato.getVelocidade() == getVelocidade();
        }
        return false;
    }

    public static Jato getById(int id) {
        return new Jato();
    }
}
