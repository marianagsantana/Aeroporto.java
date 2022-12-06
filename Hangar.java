import java.sql.PreparedStatement;

public class Hangar {
    
    private int id;
    private String local;
    private Aviao aviao;
    private int idAviao;

    public Hangar() {

    }

    public Hangar(int id, String local, int idAviao, Aviao aviao) throws Exception {
        this.id = id;
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = aviao;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
        "INSERT INTO hangar (id, local, aviao_id) VALUES (?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, local);
        stmt.setInt(3, idAviao);
        stmt.execute();
        stmt.close();
    }

    public Hangar(String local, int idAviao, Aviao aviao) throws Exception {
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = aviao;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO hangar (local, aviao_id) VALUES (?, ?);"
        );
        stmt.setString(1, local);
        stmt.setInt(2, idAviao);
        stmt.execute();
        stmt.close();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public int getIdAviao() {
        return idAviao;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Local: " + local + " | Aviao: " + idAviao;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hangar hangar = (Hangar) obj;
        if (this.id == hangar.id && this.local.equals(hangar.local) && this.idAviao == hangar.idAviao) {
            return true;
        }
        return false;
    }
}
