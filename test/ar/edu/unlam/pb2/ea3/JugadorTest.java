package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JugadorTest {
	@Test
	public void queUnJugadorSeaIgualAOtroPorSuNombre() {
		Jugador j1 = new Jugador(1, "Madrear", 182);
		Jugador j2 = new Jugador(2, "Madrear", 260);
		
		assertTrue(j1.getNombre().compareTo(j2.getNombre()) == 0);
		assertEquals(j1.getNombre(), j2.getNombre());
		
	}
}
