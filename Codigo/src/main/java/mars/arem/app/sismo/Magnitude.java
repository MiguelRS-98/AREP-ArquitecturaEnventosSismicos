package mars.arem.app.sismo;

import java.util.Scanner;

/**
 * Esta clase realiza la entrada y salida de datos referentes a eventos sísmicos.
 * @author Miguel Angel Rodriguez Siachoque
 */
public class Magnitude 
{
    /**
     * Metodo principal que escanea los datos porporcionados por sensores o usuarios
     * @param args Por defecto.
     */
    public static void main (String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Latitude:");
        String latitude = myObj.nextLine();
        System.out.println("Enter Longitude:");
        String longitude = myObj.nextLine();
        
        System.out.println("Enter Amplitude:");
        double amplitude = Double.parseDouble(myObj.nextLine());
        System.out.println("Enter Time Variation:");
        double dTime = Double.parseDouble(myObj.nextLine());
        
        equationMw(latitude, longitude, amplitude, dTime);
    }
    
    /**
     * Metodo que genera la ecuación con la cual se puede determinar la escala del evento sísmico
     * @param lat Latitud de la zona afectada.
     * @param lon Longitud de la zona afectada.
     * @param amp Amplitud de las ondas del evento sísmico.
     * @param dT Duración del tiempo de las ondas del evento sísmico.
     */
    public static void equationMw (String lat, String lon, double amp, double dT) 
    {
        double magnitude = Math.log10((amp*(Math.pow(dT, 3)))/1.62);
        
        System.out.println("Latitude: " + lat);
        System.out.println("Longitude: " + lon);
        System.out.println("Magnitude: " + magnitude);
    }
}