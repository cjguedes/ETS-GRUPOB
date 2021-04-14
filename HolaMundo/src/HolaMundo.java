import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HolaMundo {
	
	public static void main(String[] args) throws IOException {
        // Variables para capturar las pulsaciones de teclado del usuario
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String valorEntrada;
        //Esto es una prueba
        
        System.out.println("---------------------------------------------");
        System.out.println(" HOLA MUNDO");
        System.out.println("---------------------------------------------");
        
        float ladoMenor=0;
        do{
        	// Solicitamos al usuario la longitud del lado menor del rect�ngulo
        	System.out.println(" Indique la longitud del lado menor: ");
        	valorEntrada = teclado.readLine();
        	ladoMenor = Float.parseFloat(valorEntrada);
        }while (ladoMenor<=0);
        
        float ladoMayor;
        do {
        // Solicitamos al usuario la longitud del lado mayor del rect�ngulo
        System.out.println(" Indique la longitud del lado mayor: ");
        valorEntrada = teclado.readLine();
        ladoMayor = Float.parseFloat(valorEntrada);
        }while (ladoMayor<=0);
         
        
        // Calculamos y mostramos el �rea del rect�ngulo
        float area = ladoMenor * ladoMayor;
        System.out.println(" El �rea del rect�ngulo es: " + area);
        
	}
}
