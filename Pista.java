import java.sql.PreparedStatement;

public class Pista {
    
    private NumeroGeneric<Character, Integer> numero;
    private int id;
    
    public Pista() {

    }

    public Pista(int id, Character letra, int num) throws Exception {
        this.id = id;
        this.numero = new NumeroGeneric<Character,Integer>(letra, num);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (id, numero) VALUES (" + id + "," + numero + ");"
        );
        stmt.execute();
        stmt.close();
    }

    public Pista(Character letra, int num) throws Exception {
        this.numero = new NumeroGeneric<Character,Integer>(letra, num);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (numero) VALUES (" + numero + ");"
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

    public void setNumero(Character letra, int num) {
        this.numero = numero;
    }

    public NumeroGeneric<Character,Integer> getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Numero: " + numero;
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
