package ar.edu.unlp.info.oo1.ejercicio16_filteredSet;

import java.util.LinkedHashSet;

public class EvenNumberSet<E> extends LinkedHashSet<Integer> {

	// la clase EvenNumberSet<E> tiene como superclase a LinkedHashSet<Integer> (solo enteros)
	// hereda comportamiento de su superclase
	// reescribo el método add para que sólo agregue numeros pares y que no hayan sido previamente agregados
	
	
	// solo me aseguro que el numero sea PAR para agregarlo a la colección
	// no es necesario verificar que no se repita el numero ya que LinkedHashSet no admite repetidos
	// (no puede haber elementos repetidos en las colecciones que implementan la interfaz Set)
	public boolean add(Integer numero) {
		return (numero % 2 == 0)? super.add(numero) : false;
	}
	
}

// las colecciones que implementan la interfaz Set son: HashSet, LinkedHashSet y TreeSet

// REQUISITOS A CUMPLIR EN EL EJERCICIO

// SOLO ACEPTA NUMEROS PARES
// esto no está definido en ninguna de las 3 colecciones por lo que habría que realizar modificaciones en cualquiera de las 3 colecciones

// SOLAMENTE NUMEROS PARES
// ninguna de las 3 acepta valores repetidos por lo que esa condición se cumpliría con cualquiera

// MANTENER EL ORDEN DE AGREGADO
// HashSet no mantiene el orden en que agregas los elementos
// TreeSet mantiene los elementos en orden en relación a un comparador, por lo que tampoco sería la solución más eficiente
// Por eso elegí LinkedHashSet ya que mantiene el orden en que agregas los elementos

// Por ende solamente se tuvo que redefinir el método add para aceptar únicamente números pares.