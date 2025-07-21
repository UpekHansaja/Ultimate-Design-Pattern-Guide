
interface Coffee {
    double cost();
    String description();
}

class NormalCoffee implements Coffee {
    @Override
    public double cost() {
        return 500.00; // base cost of normal coffee
    }

    @Override
    public String description() {
        return "Normal Coffee";
    }
}

abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 100.0; // adding milk costs 100
    }

    @Override
    public String description() {
        return coffee.description() + ", with Milk"; // adding milk to description
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 50.0; // adding sugar costs 50
    }

    @Override
    public String description() {
        return coffee.description() + ", with Sugar"; // adding sugar to description
    }
}

public class Decorator {

    public static void main(String[] args) {

        Coffee coffee = new NormalCoffee();
        System.out.println("Price of " + coffee.description() + ": " + coffee.cost());

        coffee = new MilkDecorator(coffee); // adding milk
        System.out.println("Price of " + coffee.description() + ": " + coffee.cost());

        coffee = new SugarDecorator(coffee); // adding sugar
        System.out.println("Price of " + coffee.description() + ": " + coffee.cost());

    }

}
