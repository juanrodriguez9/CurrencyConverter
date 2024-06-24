public class ConversionResponse  {
    String base_code;
    String target_code;
    float conversion_rate;
    float conversion_result;

    public ConversionResponse(String base_code, String target_code, float conversion_rate, float conversion_result ) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return "Tu conversion es: \n" +
                "Moneda Base = " + this.base_code + "\n" +
                "Moneda Destino = " + this.target_code + "\n" +
                "Un " +this.base_code + " equivale a = " + this.conversion_rate + " " + this.target_code + "\n" +
                "Tu cantidad a conversion es = " + this.conversion_result + " " + this.target_code;
    }
}
