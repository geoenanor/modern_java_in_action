package chapter2.filters.interfaces;

import chapter2.entities.Apple;

/**
 * @author 0
 *	Predicate : Patron de diseño strategy. Es la familia de algoritmos, las distintas estrategias son las clases que 
 * implementan el algoritmo
 */
public interface ApplePredicate {
	boolean test (Apple apple);
}
