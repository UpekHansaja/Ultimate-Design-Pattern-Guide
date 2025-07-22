interface Coffee {
    double price();

    String desc();
}

interface Tea {
    double price();

    String desc();
}

class NormalCoffee implements Coffee {
    @Override
    public double price() {
        return 500.00; // base price of normal coffee
    }

    @Override
    public String desc() {
        return "Normal Coffee";
    }
}

class NormalTea implements Tea {
    @Override
    public double price() {
        return 300.00; // base price of normal tea
    }

    @Override
    public String desc() {
        return "Normal Tea";
    }
}

abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

abstract class TeaDecorator implements Tea {
    
    protected Tea tea;

    public TeaDecorator(Tea tea) {
        this.tea = tea;
    }
}

class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double price() {
        return coffee.price() + 100.00; // add milk price
    }

    @Override
    public String desc() {
        return coffee.desc() + ", with Milk";
    }
}

class MilkTeaDecorator extends TeaDecorator {

    public MilkTeaDecorator(Tea tea) {
        super(tea);
    }

    @Override
    public double price() {
        return tea.price() + 50.00; // add milk price
    }

    @Override
    public String desc() {
        return tea.desc() + ", Milk";
    }
}

public class Cafe {

    public static void main(String[] args) {

    }

}
