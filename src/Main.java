import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String bienvenida = "Bienvenido al conversor de monedas";
        String menu = """
                ***************************
                Elige una opción valida:
                                
                0. Conversor de monedas.
                1. Historial.
                2. Salir.
                ****************************
                """;


        String listaMonedas = """
                
                1. DOLLAR -> ARS
                2. ARS -> DOLLAR
                3. DOLLAR -> REALES (Br)
                4. REALES(Br) -> DOLLAR
                5. DOLLAR -> COP
                6. COP -> DOLLAR""";

        List<String> listaHistory = new ArrayList<>();
         // EJECUCIÓN APLICACIÓN

        System.out.println(bienvenida);

        Scanner lectura = new Scanner(System.in);
        int option;

        do {
            System.out.println(menu);
            option = lectura.nextInt();

            switch (option) {
                case 0:
                    boolean volverAlMenuPrincipal = false;

                    while (!volverAlMenuPrincipal) {

                        System.out.println(listaMonedas);
                        int operacion = lectura.nextInt();
                        double cantidad;
                        switch (operacion) {
                            case 1:
                                System.out.println("USD -> ARS");
                                System.out.println("Ingresa cuántos USD quieres convertir a ARS: ");
                                cantidad = lectura.nextDouble();
                            {
                                ConversionRequest conversionRequest = new ConversionRequest("USD", "ARS", cantidad);
                                Conversion conversion = new Conversion(conversionRequest);
                                ConversionResponse response = conversion.convertirMonedas(conversionRequest);
                                System.out.println(response);
                                listaHistory.add(response.toString());
                            }
                            break;
                            case 2:
                                System.out.println("ARS -> USD");
                                System.out.println("Ingresa cuántos ARS quieres convertir a USD: ");
                                cantidad = lectura.nextDouble();
                            {
                                ConversionRequest conversionRequest = new ConversionRequest("ARS", "USD", cantidad);
                                Conversion conversion = new Conversion(conversionRequest);
                                ConversionResponse response = conversion.convertirMonedas(conversionRequest);
                                System.out.println(response);
                                listaHistory.add(response.toString());
                            }
                            break;
                            case 3:
                                System.out.println("USD -> BRL");
                                System.out.println("Ingresa cuántos USD quieres convertir a REALES: ");
                                cantidad = lectura.nextDouble();
                            {
                                ConversionRequest conversionRequest = new ConversionRequest("USD", "BRL", cantidad);
                                Conversion conversion = new Conversion(conversionRequest);
                                ConversionResponse response = conversion.convertirMonedas(conversionRequest);
                                System.out.println(response);
                                listaHistory.add(response.toString());
                            }
                            break;
                            case 4:
                                System.out.println("BRL -> USD");
                                System.out.println("Ingresa cuántos REALES quieres convertir a USD: ");
                                cantidad = lectura.nextDouble();
                            {
                                ConversionRequest conversionRequest = new ConversionRequest("BRL", "USD", cantidad);
                                Conversion conversion = new Conversion(conversionRequest);
                                ConversionResponse response = conversion.convertirMonedas(conversionRequest);
                                System.out.println(response);
                                listaHistory.add(response.toString());
                            }
                            break;
                            case 5:
                                System.out.println("USD -> COP");
                                System.out.println("Ingresa cuántos USD quieres convertir a COP: ");
                                cantidad = lectura.nextDouble();
                            {
                                ConversionRequest conversionRequest = new ConversionRequest("USD", "COP", cantidad);
                                Conversion conversion = new Conversion(conversionRequest);
                                ConversionResponse response = conversion.convertirMonedas(conversionRequest);
                                System.out.println(response);
                                listaHistory.add(response.toString());
                            }
                            break;
                            case 6:
                                System.out.println("COP -> USD");
                                System.out.println("Ingresa cuántos COP quieres convertir a USD: ");
                                cantidad = lectura.nextDouble();
                            {
                                ConversionRequest conversionRequest = new ConversionRequest("COP", "USD", cantidad);
                                Conversion conversion = new Conversion(conversionRequest);
                                ConversionResponse response = conversion.convertirMonedas(conversionRequest);
                                System.out.println(response);
                                listaHistory.add(response.toString());
                            }
                            break;
                            default:
                                System.out.println("¡Opción inválida!");
                                break;
                        }

                        System.out.println("¿Deseas realizar otra conversión? (1. Sí / 0. No): ");
                        int continuar = lectura.nextInt();
                        if (continuar == 0) {
                            volverAlMenuPrincipal = true;
                        }
                    }                continue;

                case 1:
                    System.out.println("Mostrar historial" + "\n");
                    for (String response : listaHistory) {
                        System.out.println("[ " + response + "]" +"\n" );
                    }
                    break;

                case 2:
                    System.out.println("Saliendo de la app...");
                    break;

                default:
                    System.out.println("¡Opción inválida!");
                    break;
            }

        } while (option != 2);

        lectura.close();
    }
}
