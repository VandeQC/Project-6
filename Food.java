public class Food {

    private String foodName;
    private int calories;
    private int protein;
    private int carbs;
    private int fats;

    public Food(){
        this.foodName = "";
        this.calories = 0;
        this.protein = 0;
        this.carbs = 0;
        this.fats = 0;
    }

    public Food(String foodName, int calories, int protein, int carbs, int fats){
        this.foodName = foodName;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }

}
