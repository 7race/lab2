package animal;

public abstract class Animal implements Comparable<Animal>{
	private int id;
	private String name;
	private int foodAmount;
	private int weight;

	public Animal(int id, String name, int foodAmount, int weight){
		this.id = id;
		this.name = name;
		this.foodAmount = foodAmount;
		this.weight = weight;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}
	public int getFoodAmount(){
		return foodAmount;
	}
	public int getWeight(){
		return weight;
	}


	public abstract int calcFoodAmount();


	public int compareTo(Animal other) {
       	int order = other.calcFoodAmount() - this.calcFoodAmount();
        if (order == 0) {
            return this.name.compareTo(other.name);
        }
        return order; // сортировка по убыванию количества еды
    }

}