package chapter2;

import java.util.ArrayList;
import java.util.List;

import chapter2.entities.Apple;
import chapter2.entities.COLOR;
import chapter2.filters.AppleFilters;

/**
 * @author 0
 *
 *	Se parte del siguiente requerimiento. Tienes una lista de manzanas, y tienes que ser capazç
 *  de filtrarlas por el color (Verde) y por otro lado por el peso < 150 g)
 */
public class main {

	public static void main(String[] args) {
		

			List<Apple> lst = cargaDatos();	
			
			AppleFilters filter = new AppleFilters();
			
			List<Apple> lstFiltrada = filter.filterGreenApples(lst);
			
			imprimeLst(lstFiltrada);
			
			//Filtrando con parametros
			lstFiltrada = filter.filterColorApples(lst, COLOR.GREEN);
			
			imprimeLst(lstFiltrada);
			
	}

	private static void imprimeLst(List<Apple> lstFiltrada) {
		for(Apple item : lstFiltrada) {
			System.out.println(item.toString());
		}
		
	}

	private static List<Apple> cargaDatos() {
		List<Apple> lst = new ArrayList();
		
		lst.add( new Apple(COLOR.GREEN, 100));
		lst.add( new Apple(COLOR.GREEN, 200));
		lst.add( new Apple(COLOR.RED, 100));
		lst.add( new Apple(COLOR.RED, 200));
		
		
		return lst;
	}

}
