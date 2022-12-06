import java.sql.PreparedStatement;

public class Pista {
    
    private NumeroGeneric<String, Integer> numeroPista;
    private int id;

    public Pista() {

    }

    public Pista(int id, String letra, int numero) throws Exception {
        this.id = id;
        this.numeroPista = new NumeroGeneric<String,Integer>(letra, numero);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (id, numero) VALUES (?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, numeroPista.toString());
        stmt.execute();
        stmt.close();
    }

    public Pista(String letra, int numero) throws Exception {
        this.numeroPista = new NumeroGeneric<String,Integer>(letra, numero);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (numero) VALUES (?);"
        );
        stmt.setString(1, numeroPista.toString());
        stmt.execute();
        stmt.close();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(String letra, int numero) {
        this.numeroPista = new NumeroGeneric<String,Integer>(letra, numero);
    }

    public NumeroGeneric<String,Integer> getNumero() {
        return numeroPista;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Numero: " + numeroPista;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pista) {
            Pista p = (Pista) obj;
            return this.id == p.id;
        }
        return false;
    }

    public static Pista getById(int id) {
        return new Pista();
    }
}
