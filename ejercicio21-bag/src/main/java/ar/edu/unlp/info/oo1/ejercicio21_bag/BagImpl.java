package ar.edu.unlp.info.oo1.ejercicio21_bag;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<String> extends AbstractCollection<String> implements Bag<String> {

    Map<String, Integer> elements;

    public BagImpl() {
        // TODO Completar con la instanciación adecuada
        this.elements = new HashMap<String, Integer>();
    }

    @Override
    public boolean add(String element) {
        // TODO Completar con la implementación correspondiente
    	
    	// si la clave no existe
        if (this.elements.put(element, 1) == null) {
        	return true;
        }
        // si la clave existe (sumo 1)
        this.elements.put(element, elements.get(element) + 1);
        return true;

    }

    @Override
    public int occurrencesOf(String element) {
        // TODO Completar con la implementación correspondiente
       Integer aux = this.elements.get(element);
       return (aux == null)? 0: aux;
    }

    @Override
    public void removeOccurrence(String element) {
        // TODO Completar con la implementación correspondiente
        Integer aux = this.elements.get(element);
        // caso de que element no exista o este una sola vez en la bolsa
        if (aux == null || aux == 1) {
        	this.elements.remove(element);
        }
        else
        	this.elements.put(element, aux-1);
    }

    @Override
    public void removeAll(String element) {
        // TODO Completar con la implementación correspondiente
    	this.elements.remove(element);
    }

    @Override
    public int size() {
        // TODO Completar con la implementación correspondiente
       return this.elements.entrySet().stream().mapToInt(e -> occurrencesOf(e.getKey())).sum();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private Iterator<Map.Entry<String, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<String, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public String next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
