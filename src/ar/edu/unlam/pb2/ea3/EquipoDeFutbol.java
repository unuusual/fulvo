package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {
	private String nombre;
	private Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>();
	}

	/*
	 * La capacidad máxima de un equipo es 23. Cualquier intento de agregar más
	 * jugadores generará una excepción (CapacidadMaximaException). Además, no
	 * deberá permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generará una excepción
	 * (JugadoreInexistenteException).
	 */
	

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
		return null;
		
		
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		return null;
		
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		return null;
		
	}
		

	/*private TreeSet<Jugador> ordenarELPlantelParaDevolver(Comparator criterioDeOrdenacion) {
		TreeSet<Jugador> equipoOrdenado = null;
			return equipoOrdenado;

	}*/
	
	public int cantidadDeJugadoresEnEquipo()
	{
		return 0;
		
	}
	
	public Boolean buscarJugador(Jugador jugador)
	{
		return null;
		
	}
}
