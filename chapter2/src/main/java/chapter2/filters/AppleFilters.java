package chapter2.filters;

import java.util.ArrayList;
import java.util.List;

import chapter2.entities.Apple;
import chapter2.entities.COLOR;
import chapter2.filters.interfaces.ApplePredicate;
import chapter2.filters.interfaces.AppleFormatter;

public class AppleFilters {
	//Primer intento
	public List<Apple> filterGreenApples(List<Apple> manzanas){
		List<Apple> lst = new ArrayList<>();
		
		for(Apple manzana : manzanas) {
			if(COLOR.GREEN.equals(manzana.getColor())) {
				lst.add(manzana);
			}
		}
		
		return lst;
	}
	
	//Segundo intento... parametrizamos el color para que sirviera para cualquier COLOR
	public List<Apple> filterColorApples(List<Apple> manzanas, COLOR color){
		List<Apple> lst = new ArrayList<>();
		
		for(Apple manzana : manzanas) {
			if(color.equals(manzana.getColor())) {
				lst.add(manzana);
			}
		}
		
		return lst;
	}
	
	//Peso parametrizado
	public List<Apple> filterWeightApples(List<Apple> manzanas, int peso){
		List<Apple> lst = new ArrayList<>();
		
		for(Apple manzana : manzanas) {
			if(peso >= manzana.getWeight()) {
				lst.add(manzana);
			}
		}
		
		return lst;
	}

	//Behavior Parameterization . El comportamiento viene parametrizado en ApplePredicate
	public List<Apple> filterApples(List<Apple> manzanas, ApplePredicate predicado) {
		List<Apple> lst = new ArrayList<>();
		
		for(Apple manzana : manzanas) {
			if ( predicado.test(manzana)) {
				lst.add(manzana);
			}
		}
		
		return lst;
	}

	public void prettyPrintApple(List<Apple> manzanas, AppleFormatter printStrategy) {

		System.out.println("====================================");
		for(Apple manzana : manzanas) {
			
			String txt = printStrategy.accept(manzana);
			System.out.println(txt);
		}

	}
}
