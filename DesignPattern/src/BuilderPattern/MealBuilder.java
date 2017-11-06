package BuilderPattern;

public class MealBuilder {

	public Meal vegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBuger());
		meal.addItem(new Cola());
		
		return meal;
	}
	
	public Meal meatMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBuger());
		meal.addItem(new Milk());
		return meal;
	}
}
