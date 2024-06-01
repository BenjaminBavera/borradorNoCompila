
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
    public void testCodigoEncripcionHola()
    {
        Mensaje mensaje = new Mensaje();
        mensaje.agregarLinea("hola");
        CodificadorMensajes codificador = new CodificadorMensajes(mensaje);
        codificador.codificarMensaje();
        int[] codigo = codificador.obtenerCodigoEncripcion();
        int[] arreglo420 = {4,2,0};
        assertArrayEquals(codigo,arreglo420);
    }
    
    @Test
    public void testCodigoEncripcionIguales()
    {
        Mensaje mensaje = new Mensaje();
        mensaje.agregarLinea("hola mundo");
        CodificadorMensajes codificador = new CodificadorMensajes(mensaje);
        codificador.codificarMensaje();
        int[] codigo = codificador.obtenerCodigoEncripcion();
        Mensaje mensaje2 = new Mensaje();
        mensaje2.agregarLinea("aloh odnum");
        codificador.cambiarMensaje(mensaje2);
        codificador.codificarMensaje();
        int[] codigo2 = codificador.obtenerCodigoEncripcion();
        assertArrayEquals(codigo,codigo2);
    }
    
}
