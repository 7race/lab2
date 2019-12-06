package animal;

public class Predator extends Animal{
	public Predator(int id, String name, int foodAmount, int weight){
		super(id, name, foodAmount, weight);
	}

	public int calcFoodAmount(){
		return ((getFoodAmount() + getWeight()) / 2);
	}
}