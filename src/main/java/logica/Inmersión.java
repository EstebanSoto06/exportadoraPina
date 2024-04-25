    package logica;

import java.util.Date;


public class Inmersión {
    private int id;
    private String numeroBin;
    private String fecha;

    public Inmersión(int id, String numeroBin, String fecha) {
        this.id = id;
        this.numeroBin = numeroBin;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroBin() {
        return numeroBin;
    }

    public void setNumeroBin(String numeroBin) {
        this.numeroBin = numeroBin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
