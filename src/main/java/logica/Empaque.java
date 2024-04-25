package logica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Empaque {
    private int id;
    private int cantidadCajasT4;
    private int cantidadCajasT5;
    private int cantidadCajasT6;
    private int cantidadCajasT7;
    private int cantidadCajasT8;
    private int cantidadCajasT9;
    private int cantidadCajasT10;
    private int totalCajas;
    private String fechaEmpaque;

    public Empaque(int id, int cantidadCajasT4, int cantidadCajasT5, int cantidadCajasT6, int cantidadCajasT7, int cantidadCajasT8, int cantidadCajasT9, int cantidadCajasT10, int totalCajas) {
        this.id = id;
        this.cantidadCajasT4 = cantidadCajasT4;
        this.cantidadCajasT5 = cantidadCajasT5;
        this.cantidadCajasT6 = cantidadCajasT6;
        this.cantidadCajasT7 = cantidadCajasT7;
        this.cantidadCajasT8 = cantidadCajasT8;
        this.cantidadCajasT9 = cantidadCajasT9;
        this.cantidadCajasT10 = cantidadCajasT10;
        this.totalCajas = totalCajas;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        this.fechaEmpaque = formatter.format(new Date());
    }

    
}
