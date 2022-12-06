public abstract class Aeronave {
    
    private int id;
    private String marca;
    private String modelo;

    public Aeronave() {

    }

    public Aeronave(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca; 
        this.modelo = modelo;
    }

    public Aeronave(String marca, String modelo) {
        this.marca = marca; 
        this.modelo = modelo;
    } 

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Id:" + this.id + " | Marca: " + this.marca + " | Modelo: " + this.modelo;
    }

    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aeronave aeronave = (Aeronave) obj;
        if (this.id == aeronave.id && this.marca.equals(aeronave.marca) && this.modelo.equals(aeronave.modelo)) {
            return true;
        }
        return false;
    }

    public static Aeronave getById(int id) {
        return new Aeronave() {

        };
    }
}
