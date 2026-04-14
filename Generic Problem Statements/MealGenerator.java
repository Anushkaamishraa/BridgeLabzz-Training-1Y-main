interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }
}

public class MealGenerator {

    public static <T extends MealPlan> void generateMeal(T plan) {
        System.out.println(plan);
    }

    public static void main(String[] args) {
        generateMeal(new VegetarianMeal());
        generateMeal(new VeganMeal());
    }
}