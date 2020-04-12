package chapter2.filters.impl;

import chapter2.entities.Apple;
import chapter2.filters.interfaces.AppleFormatter;

public class AppleWeightPrettyPrint implements AppleFormatter {

	@Override
	public String accept(Apple apple) {
		return "Peso: " + apple.getWeight();
	}

}
