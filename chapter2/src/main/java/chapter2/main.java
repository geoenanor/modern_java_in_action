package chapter2;

import java.util.ArrayList;
import java.util.List;

import chapter2.entities.Apple;
import chapter2.entities.COLOR;
import chapter2.filters.AppleFilters;
import chapter2.filters.impl.AppleColorRedPredicate;
import chapter2.filters.impl.AppleHeavyWeightPredicate;
import chapter2.filters.impl.ApplePrintAllData;
import chapter2.filters.impl.AppleRedAndHeavyPredicate;
import chapter2.filters.impl.AppleWeightPrettyPrint;
import chapter2.filters.interfaces.ApplePredicate;

/**
 * @author 0
 *
 *	Se parte del siguiente requerimiento. Tienes una lista de manzanas, y tienes que ser capaz�
 *  de filtrarlas por el color (Verde) y por otro lado por el peso < 150 g)
 */
public class main {

	public static void main(String[] args) {
		

			List<Apple> lst = cargaDatos();	
			
			//noPassingBehavior(lst);
			
			//passingBehavior(lst);
			
			//prettyPringApple(lst);  //Quiz 2.1
			
			//Fifth attempt: Anonymous classes
			//filterWithAnonymousClasses(lst);
	
			//Sixth attempt. Lambda expressions
			filterWithLambdaExpr(lst);		
	}
	private static void filterWithLambdaExpr(List<Apple> lst) {
	System.out.println("FilterWithLambdaMethod");
	AppleFilters filter = new AppleFilters();
	
	List<Apple> lstFiltrada = filter.filterApples(lst, (Apple manzana) -> manzana.getColor().equals(COLOR.GREEN));
	imprimeLst(lstFiltrada);
	
	lstFiltrada = filter.filterApples(lst, (Apple manzana) -> manzana.getWeight() >=  150);
	imprimeLst(lstFiltrada);
	
	lstFiltrada = filter.filterApples(lst, (Apple manzana) -> manzana.getWeight() >=  150 && COLOR.RED.equals(manzana.getColor()));
	imprimeLst(lstFiltrada);
		

		
	}

private static void filterWithAnonymousClasses(List<Apple> lst) {
		//No se crean las implementaciones de los ifaces, se instancian y declaran a la vez:
/*
 * new ApplePredicate(){
		public boolean test (Apple manzana) {
			return COLOR.RED.equals(manzana.getColor());
		}
	});
 */
	
	AppleFilters filter = new AppleFilters();
	
	//List<Apple> lstFiltrada = filter.filterApples(lst, new AppleColorRedPredicate ());
	List<Apple> lstFiltrada = filter.filterApples(lst, new ApplePredicate(){
		public boolean test (Apple manzana) {
			return COLOR.RED.equals(manzana.getColor());
		}
	});
	
	imprimeLst(lstFiltrada);
	
	//lstFiltrada = filter.filterApples(lst, new AppleHeavyWeightPredicate());
	lstFiltrada = filter.filterApples(lst, new ApplePredicate(){
		public boolean test (Apple manzana) {
			return manzana.getWeight() >=  150;
		}
	});
	imprimeLst(lstFiltrada);
	
	//lstFiltrada = filter.filterApples(lst, new AppleRedAndHeavyPredicate());
	lstFiltrada = filter.filterApples(lst,new ApplePredicate(){
		public boolean test (Apple manzana) {
			return manzana.getWeight() >=  150 && COLOR.RED.equals(manzana.getColor());
		}
	});
	imprimeLst(lstFiltrada);
		
	}

private static void prettyPringApple(List<Apple> lst) {
		
		AppleFilters filter = new AppleFilters();
	
		filter.prettyPrintApple(lst, new AppleWeightPrettyPrint() );
		
		filter.prettyPrintApple(lst, new ApplePrintAllData() );
		
	}


	private static void passingBehavior(List<Apple> lst) {
		
		AppleFilters filter = new AppleFilters();
		
		List<Apple> lstFiltrada = filter.filterApples(lst, new AppleColorRedPredicate ());
		imprimeLst(lstFiltrada);
		
		lstFiltrada = filter.filterApples(lst, new AppleHeavyWeightPredicate());
		imprimeLst(lstFiltrada);
		
		lstFiltrada = filter.filterApples(lst, new AppleRedAndHeavyPredicate());
		imprimeLst(lstFiltrada);
	}

	private static void noPassingBehavior(List<Apple> lst) {
		
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
		System.out.println("======================================");
		
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
