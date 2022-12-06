import java.sql.PreparedStatement;

public class Companhia {
    
    private int id;
    private String nome;
    private String cnpj;

    public Companhia() {

    }

    public Companhia(int id, String nome, String cnpj) throws Exception {
        this.id = id;
        this.nome = nome; 
        this.cnpj = cnpj;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO companhia (id, nome, cnpj) VALUES (" + id + "," + nome + "," + cnpj +");"
        );
        stmt.execute();
        stmt.close();
    }

    public Companhia(String nome, String cnpj) throws Exception {
        this.nome = nome; 
        this.cnpj = cnpj;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO companhia (nome, cnpj) VALUES (" + nome + "," + cnpj +");"
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + " | Nome: " + this.nome + " | CNPJ: " + this.cnpj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Companhia) {
            Companhia companhia = (Companhia) obj;
            return this.id == companhia.id;
        }
        return false;
    }

    public static Companhia getById(int id) throws Exception {
        return new Companhia();
    }

}
