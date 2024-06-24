# Conversor de Divisas

Bienvenido al Conversor de Divisas, una aplicación construida en Java core que permite convertir entre varias monedas y mantener un historial de transacciones.

## Funcionalidades

+ Conversión entre diferentes pares de monedas:
  - Dólar a Peso Argentino
  - Peso Argentino a Dólar
  - Dólar a Real Brasileño
  - Real Brasileño a Dólar
  - Dólar a Peso Colombiano
  - Peso Colombiano a Dólar
+ Visualización del historial de conversiones

## Resumen de Funcionamiento

El Conversor de divisas es una aplicación de consola que interactúa con una API REST, para realizar conversiones entre diferentes divisas. Los usuarios pueden seleccionar el tipo de conversión que desean realizar, ingresar la cantidad a convertir y obtener el resultado de la conversión.

## Requisitos

- Java 17 o superior
- Maven

## Instalación

1. Clona el repositorio en tu máquina local. Abre PowerShell y ejecuta:
    git clone [https://github.com/tu_usuario/superconversor-de-monedas.git](https://github.com/juanrodriguez9/CurrencyConverter)
   
2. Navega al directorio del proyecto:
    cd Currency Converter 
   
4. Compila el proyecto con Maven. Si Maven no está instalado, puedes descargarlo desde aquí, https://maven.apache.org/download.cgi y seguir las instrucciones de instalación para            Windows. Luego, ejecuta:
    mvn clean install
   
## Uso

1. Ejecuta la aplicación:
    mvn exec:java -Dexec.mainClass="Principal"
2. Sigue las instrucciones en pantalla para realizar conversiones y ver el historial.

- `Funcionalidad 1`: INICIO APP  1
  
   ![image](https://github.com/juanrodriguez9/CurrencyConverter/assets/135027379/1469682f-5728-4906-ae0a-d178ba1ad507)
  
- - `Funcionalidad 2`: CONVERSOR DE MONEDAS (TIPOS DE CAMBIOS DISPONIBLES)
 
    ![image](https://github.com/juanrodriguez9/CurrencyConverter/assets/135027379/4f317527-ca27-4af4-b231-04186a005d98)

    
  - - `Funcionalidad 2a`: descripción de la funcionalidade 2a EJEMPLO OPCION # 6
       ![image](https://github.com/juanrodriguez9/CurrencyConverter/assets/135027379/7f47e89f-4020-4875-aa65-74a7d232d802)

      ![image](https://github.com/juanrodriguez9/CurrencyConverter/assets/135027379/86b80931-db30-4acc-8430-2aae86270dfe)


 - - `Funcionalidad 3`: HISTORIAL

   ![image](https://github.com/juanrodriguez9/CurrencyConverter/assets/135027379/c79b0ff4-4382-4073-89f4-43ce2779ada9)



   
## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor haz un fork del repositorio y crea un pull request con tus cambios.
