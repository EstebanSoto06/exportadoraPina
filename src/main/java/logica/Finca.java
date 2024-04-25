package logica;

public class Finca {
    private int id;
    private String nombre;
    private String ubicacion;
    private int id_proveedor;

    public Finca(int id, String nombre, String ubicacion, int id_proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.id_proveedor = id_proveedor;
    }

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
}
