package chapter2.entities;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	private COLOR color;
	private int weight;
	public COLOR getColor() {
		return color;
	}
	public void setColor(COLOR color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Apple(COLOR color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	
	
	public Apple() {
	}
	
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

}
