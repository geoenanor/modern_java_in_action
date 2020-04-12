package chapter2.filters.impl;

import chapter2.entities.Apple;
import chapter2.filters.interfaces.AppleFormatter;

public class ApplePrintAllData implements AppleFormatter {

	@Override
	public String accept(Apple apple) {
		return "Color: " + apple.getColor() + " Peso: " + apple.getWeight() + (apple.getWeight()>=150?" PESADA" :  " LIGERA");
	}

}
