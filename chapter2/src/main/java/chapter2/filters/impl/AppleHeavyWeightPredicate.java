package chapter2.filters.impl;

import chapter2.entities.Apple;
import chapter2.filters.interfaces.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight()>=150;
	}

}
