package chapter2.filters.impl;

import chapter2.entities.Apple;
import chapter2.entities.COLOR;
import chapter2.filters.interfaces.ApplePredicate;

public class AppleColorRedPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return COLOR.RED.equals(apple.getColor());
	}

}
