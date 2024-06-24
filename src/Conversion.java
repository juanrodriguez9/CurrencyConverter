import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {

    ConversionRequest conversionRequest;

    public Conversion(ConversionRequest conversionRequest) {
    }

    ;

    public ConversionResponse convertirMonedas(ConversionRequest conversionRequest) {

        String baseCode = conversionRequest.getMonedaBase();
        String targetCode = conversionRequest.getMonedaDestino();
        double quantity = conversionRequest.getCantidadConversion();


        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d184fad23509e46f46b715a9/pair/" + baseCode + "/" + targetCode + "/" + quantity);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), ConversionResponse.class);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
