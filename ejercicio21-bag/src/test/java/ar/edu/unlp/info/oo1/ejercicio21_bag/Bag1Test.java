package ar.edu.unlp.info.oo1.ejercicio21_bag;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Bag1Test {

	// Declaraciones
	Map<String, Integer> map;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		
		// Cree un map un Map<String, Integer>
		map = new HashMap<String, Integer>();
		
		// Agregue las tuplas (“Lionel Messi”, 111), (“Gabriel Batistuta”, 56), (“Kun Agüero”, 42)
		map.put("Lionel Messi", 111);
		map.put("Gabriel Batistuta", 56);
		map.put("Kun Aguero", 42);
		
		// Elimine la entrada con clave “Kun Agüero” 
		map.remove("Kun Aguero");
		
		// Intente repetir la clave “Gabriel Batistuta” y verifique que no es posible.
		map.put("Gabriel Batistuta", 56);
		
	}
	
	@Test
	void test() {
		
		// devuelve cant total de goles 167 = 112 + 56
		assertEquals(167, this.map.values().stream().mapToInt(Integer::intValue).sum());
		
		// devuelve cantidad de goles de messi = 111
		assertEquals(111, this.map.get("Lionel Messi"));
		
		// Messi hizo 112 goles a día de la fecha; actualice la cantidad de goles 
		map.replace("Lionel Messi", 112);
		
		// devuelve cantidad de goles de messi = 111
		assertEquals(112, this.map.get("Lionel Messi"));
		
		// devuelve cant total de goles 168 = 112 + 56
		assertEquals(168, this.map.values().stream().mapToInt(Integer::intValue).sum());
		
	}
}
