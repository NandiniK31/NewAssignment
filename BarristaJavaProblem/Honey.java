package BarristaJavaProblem;

public class Honey extends BeverageDecorator {

	int honeyCost;

	Honey(Beverage beverage, int honeyCost) {
		this.beverage = beverage;
		this.honeyCost = honeyCost;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " topped with Honey";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + honeyCost;
	}
}
