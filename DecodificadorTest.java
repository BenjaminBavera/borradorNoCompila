
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests de unidad para la clase DecodificadorMensajes.
 *
 * @author  No Compila
 * @version 0.1
 */
public class DecodificadorTest
{
    

    @Test
    public void decodificarHola()
    {
        Mensaje mensaje = new Mensaje();
        mensaje.agregarLinea("hola");
        CodificadorMensajes codificador = new CodificadorMensajes(mensaje);
        codificador.codificarMensaje();
        Mensaje mensajeCodificado = codificador.obtenerMensajeCodificado();
        int[] codigo = codificador.obtenerCodigoEncripcion();
        DecodificadorMensajes decodificador = new DecodificadorMensajes(mensajeCodificado, codigo);
        decodificador.decodificarMensaje();
        Mensaje mensajeDecodificado = decodificador.obtenerMensajeDecodificado();
        assertEquals(true, mensaje.equals(mensajeDecodificado));
    }

    @Test
    public void decodificarHolaMundo()
    {
        Mensaje mensaje = new Mensaje();
        mensaje.agregarLinea("hola");
        mensaje.agregarLinea("mundo");
        CodificadorMensajes codificador = new CodificadorMensajes(mensaje);
        codificador.codificarMensaje();
        Mensaje mensajeCodificado = codificador.obtenerMensajeCodificado();
        int[] codigo = codificador.obtenerCodigoEncripcion();
        DecodificadorMensajes decodificador = new DecodificadorMensajes(mensajeCodificado, codigo);
        decodificador.decodificarMensaje();
        Mensaje mensajeDecodificado = decodificador.obtenerMensajeDecodificado();
        assertEquals(true, mensaje.equals(mensajeDecodificado));
    }

    @Test
    public void decodificarEspacio()
    {
        Mensaje mensaje = new Mensaje();
        mensaje.agregarLinea(" ");
        CodificadorMensajes codificador = new CodificadorMensajes(mensaje);
        codificador.codificarMensaje();
        Mensaje mensajeCodificado = codificador.obtenerMensajeCodificado();
        int[] codigo = codificador.obtenerCodigoEncripcion();
        DecodificadorMensajes decodificador = new DecodificadorMensajes(mensajeCodificado, codigo);
        decodificador.decodificarMensaje();
        Mensaje mensajeDecodificado = decodificador.obtenerMensajeDecodificado();
        assertEquals(true, mensaje.equals(mensajeDecodificado));
    }
}