public class Cliente {
    int id;
    String nombre;
    String papellido;
    String sapellido;
    //constructor

    public Cliente() {

    }

    public Cliente(int id, String nombre, String papellido, String sapellido) {
        this.id = id;
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
    }
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }
}
