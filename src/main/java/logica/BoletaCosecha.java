package logica;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoletaCosecha {
    private int id;
    private int id_proveedor;
    private int id_finca;
    private String lote;
    private String bloque;
    private String numeroBinA;
    private int cantidadFrutaBinA;
    private String numeroBinB;
    private int cantidadFrutaBinB;
    private String placaCamion;
    private String fecha;
    private String consecutivo;
    private int id_tipoFruto;

    public BoletaCosecha(int id, int id_proveedor, int id_finca, String lote, String bloque, String numeroBinA, int cantidadFrutaBinA, String numeroBinB, int cantidadFrutaBinB, String placaCamion, int id_tipoFruto) {
        this.id = id;
        this.id_proveedor = id_proveedor;
        this.id_finca = id_finca;
        this.lote = lote;
        this.bloque = bloque;
        this.numeroBinA = numeroBinA;
        this.cantidadFrutaBinA = cantidadFrutaBinA;
        this.numeroBinB = numeroBinB;
        this.cantidadFrutaBinB = cantidadFrutaBinB;
        this.placaCamion = placaCamion;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        this.fecha = formatter.format(new Date());
        this.consecutivo = "BC "+ (id + 100);
        this.id_tipoFruto = id_tipoFruto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_finca() {
        return id_finca;
    }

    public void setId_finca(int id_finca) {
        this.id_finca = id_finca;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getNumeroBinA() {
        return numeroBinA;
    }

    public void setNumeroBinA(String numeroBinA) {
        this.numeroBinA = numeroBinA;
    }

    public int getCantidadFrutaBinA() {
        return cantidadFrutaBinA;
    }

    public void setCantidadFrutaBinA(int cantidadFrutaBinA) {
        this.cantidadFrutaBinA = cantidadFrutaBinA;
    }

    public String getNumeroBinB() {
        return numeroBinB;
    }

    public void setNumeroBinB(String numeroBinB) {
        this.numeroBinB = numeroBinB;
    }

    public int getCantidadFrutaBinB() {
        return cantidadFrutaBinB;
    }

    public void setCantidadFrutaBinB(int cantidadFrutaBinB) {
        this.cantidadFrutaBinB = cantidadFrutaBinB;
    }

    public String getPlacaCamion() {
        return placaCamion;
    }

    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public int getId_tipoFruto() {
        return id_tipoFruto;
    }

    public void setId_tipoFruto(int id_tipoFruto) {
        this.id_tipoFruto = id_tipoFruto;
    }
}
