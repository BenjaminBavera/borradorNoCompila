

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DecodificadorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
        assertTrue(mensaje.equals(mensajeDecodificado));
    }
}

