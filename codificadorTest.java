
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests de unidad para la clase CodificadorMensajes.
 *
 * @author  No Compila
 * @version 0.1
 */
public class codificadorTest
{
    
    
    @Test
    public void testCodigoEncripcion()
    {
        Mensaje mensaje = new Mensaje();
        mensaje.agregarLinea("hola");
        CodificadorMensajes codificador = new CodificadorMensajes(mensaje);
        codificador.codificarMensaje();
        int[] codigo = codificador.obtenerCodigoEncripcion();
        Mensaje mensaje2 = new Mensaje();
        mensaje2.agregarLinea("aloh");
        codificador.cambiarMensaje(mensaje2);
        codificador.codificarMensaje();
        int[] codigo2 = codificador.obtenerCodigoEncripcion();
        assertEquals(true, iguales(codigo,codigo2));
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    private boolean iguales(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            return false;
        } else{
            boolean iguales = true;
            for (int i = 0; i < arr1.length && iguales; i++){
                if (arr1[i] != arr2[i]){
                    iguales = false;
                }
            } 
            return iguales;
        }
    }
}
