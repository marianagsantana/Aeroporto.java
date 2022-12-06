import java.sql.PreparedStatement;

public class Jato extends Aeronave{
    
    
    private int velocidade;
    private String cor;

    public Jato() {

    }

    public Jato(int id, String marca, String modelo, int velocidade, String cor) throws Exception {
        super(id, marca, modelo);
        this.velocidade = velocidade;
        this.cor = cor;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO jato (id, marca, modelo, cor, velocidade) VALUES (?, ?, ?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, cor);
        stmt.setInt(5, velocidade);
        stmt.execute();
        stmt.close();
    }

    public Jato(String marca, String modelo, int velocidade, String cor) throws Exception {
        super(marca, modelo);
        this.velocidade = velocidade;
        this.cor = cor;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO jato (marca, modelo, cor, velocidade) VALUES (?, ?, ?, ?);"
        );
        stmt.setString(1, marca);
        stmt.setString(2, modelo);
        stmt.setString(3, cor);
        stmt.setInt(4, velocidade);
        stmt.execute();
        stmt.close();
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
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

}
