package ar.edu.unlp.info.oo1.ejercicio21_bag;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Bag2Test {

	// Declaraciones
	Map<Jugador, Integer> map;
	Jugador j1;
	Jugador j2;
	Jugador j3;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		
		// Cree un map un Map<String, Integer>
		map = new HashMap<Jugador, Integer>();
		
		// Agregue las tuplas (“Lionel Messi”, 111), (“Gabriel Batistuta”, 56), (“Kun Agüero”, 42)
		
		j1 = new Jugador("Lionel", "Messi");
		j2 = new Jugador("Gabriel", "Batistuta");
		j3 = new Jugador("Kun", "Aguero");
		
		map.put(j1, 111);
		map.put(j2, 56);
		map.put(j3, 42);
		
		// Elimine la entrada con clave “Kun Agüero” 
		map.remove(j3);
		
		// Intente repetir la clave “Gabriel Batistuta” y verifique que no es posible.
		map.put(j2, 56);
		
	}
	
	@Test
	void test() {
		
		// devuelve cant total de goles 167 = 112 + 56
		assertEquals(167, this.map.values().stream().mapToInt(Integer::intValue).sum());
		
		// devuelve cantidad de goles de messi = 111
		assertEquals(111, this.map.get(j1));
		
		// Messi hizo 112 goles a día de la fecha; actualice la cantidad de goles 
		map.replace(j1, 112);
		
		// devuelve cantidad de goles de messi = 111
		assertEquals(112, this.map.get(j1));
		
		// devuelve cant total de goles 168 = 112 + 56
		assertEquals(168, this.map.values().stream().mapToInt(Integer::intValue).sum());
		
	}
}
