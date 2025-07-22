interface Beverage {
    double price();
    String desc();
}

class NormalCoffee implements Beverage {
    @Override
    public double price() {
        return 500.00; // base price of normal coffee
    }

    @Override
    public String desc() {
        return "Normal Coffee";
    }
}

class NormalTea implements Beverage {
    @Override
    public double price() {
        return 300.00; // base price of normal tea
    }

    @Override
    public String desc() {
        return "Normal Tea";
    }
}

abstract class BeverageDecorator implements Beverage {

    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

}

class MilkBeverageDecorator extends BeverageDecorator {

    public MilkBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 100.00; // add milk price
    }

    @Override
    public String desc() {
        return beverage.desc() + ", with Milk";
    }
}

class SugarBeverageDecorator extends BeverageDecorator {

    public SugarBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 50.00; // add sugar price
    }

    @Override
    public String desc() {
        return beverage.desc() + ", with Sugar";
    }
}

class WhippedCreamBeverageDecorator extends BeverageDecorator {

    public WhippedCreamBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 150.00; // add whipped cream price
    }

    @Override
    public String desc() {
        return beverage.desc() + ", with Whipped Cream";
    }
}

class ChocolateBeverageDecorator extends BeverageDecorator {

    public ChocolateBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 200.00; // add chocolate price
    }

    @Override
    public String desc() {
        return beverage.desc() + ", with Chocolate";
    }
}

public class Cafe {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("--------------Coffee-----------------");

        Beverage coffee = new NormalCoffee();
        System.out.println(coffee.desc() + " price: " + coffee.price());

        coffee = new MilkBeverageDecorator(coffee); // adding milk
        System.out.println(coffee.desc() + " price: " + coffee.price());
        coffee = new SugarBeverageDecorator(coffee); // adding sugar
        System.out.println(coffee.desc() + " price: " + coffee.price());
        coffee = new WhippedCreamBeverageDecorator(coffee); // adding whipped cream
        System.out.println(coffee.desc() + " price: " + coffee.price());
        coffee = new ChocolateBeverageDecorator(coffee); // adding chocolate
        System.out.println(coffee.desc() + " price: " + coffee.price());

        System.out.println("\n");
        System.out.println("---------------Tea------------------");

        Beverage tea = new NormalTea();
        System.out.println(tea.desc() + " price: " + tea.price());

        tea = new MilkBeverageDecorator(tea); // adding milk
        System.out.println(tea.desc() + " price: " + tea.price());
        tea = new SugarBeverageDecorator(tea); // adding sugar
        System.out.println(tea.desc() + " price: " + tea.price());

    }

}
