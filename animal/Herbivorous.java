package animal;

public class Herbivorous extends Animal{
	public Herbivorous(int id, String name, int foodAmount, int weight){
		super(id, name, foodAmount, weight);
	}

	public int calcFoodAmount(){
		return ((getFoodAmount() + getWeight()) / 4);
	}
}