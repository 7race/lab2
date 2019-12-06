package animal;

public class Omnivorous extends Animal{
	public Omnivorous(int id, String name, int foodAmount, int weight){
		super(id, name, foodAmount, weight);
	}

	public int calcFoodAmount(){
		return ((getFoodAmount() + getWeight()));
	}
}