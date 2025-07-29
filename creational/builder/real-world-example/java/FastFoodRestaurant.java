class Meal{
    private final String burger;
    private final String drink;
    private final String fries;
    private final String dessert;

    public Meal(FastFoodRestaurant builder) {
        this.burger = builder.getBurger();
        this.drink = builder.getDrink();
        this.fries = builder.getFries();
        this.dessert = builder.getDessert();
    }

    public void displayMeal() {
        System.out.println("Meal includes: ");
        System.out.println("Burger: " + burger);
        System.out.println("Drink: " + drink);
        System.out.println("Fries: " + fries);
        System.out.println("Dessert: " + dessert);
    }
}

public class FastFoodRestaurant {

    private String burger;
    private String drink;
    private String fries;
    private String dessert;

    public String getBurger() {
        return burger;
    }

    public String getDrink() {
        return drink;
    }

    public String getFries() {
        return fries;
    }

    public String getDessert() {
        return dessert;
    }

    public FastFoodRestaurant setBurger(String burger) {
        this.burger = burger;
        return this;
    }

    public FastFoodRestaurant setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodRestaurant setFries(String fries) {
        this.fries = fries;
        return this;
    }

    public FastFoodRestaurant setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public Meal build() {
        return new Meal(this);
    }

    public static void main(String[] args) {
        
        FastFoodRestaurant restaurant = new FastFoodRestaurant();
        Meal meal = restaurant.setBurger("Crispy Chicken Burger with extra Cheese")
                            //   .setDrink("Coke")
                              .setFries("Large Fries")
                              .setDessert("Chocolate Sundae")
                              .build();
        
        meal.displayMeal();

    }
    
}
