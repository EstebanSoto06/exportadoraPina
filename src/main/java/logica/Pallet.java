package logica;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Pallet {
    private int id;
    private String idPallet;
    private String fechaEmpaque;

    public Pallet(int id, String idPallet) {
        this.id = id;
        this.idPallet = idPallet;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        this.fechaEmpaque = formatter.format(new Date());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdPallet() {
        return idPallet;
    }

    public void setIdPallet(String idPallet) {
        this.idPallet = idPallet;
    }

    public String getFechaEmpaque() {
        return fechaEmpaque;
    }

    public void setFechaEmpaque(String fechaEmpaque) {
        this.fechaEmpaque = fechaEmpaque;
    }
}
