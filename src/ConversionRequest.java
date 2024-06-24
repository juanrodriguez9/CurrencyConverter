
public class ConversionRequest {

    private String monedaBase;
    private String monedaDestino;
    private double cantidadConversion;

    public ConversionRequest(String monedaBase, String monedaDestino, double cantidadConversion) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.cantidadConversion = cantidadConversion;
    }

    public double getCantidadConversion() {
        return cantidadConversion;
    }

    public void setCantidadConversion(double cantidadConversion) {
        this.cantidadConversion = cantidadConversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }



}
