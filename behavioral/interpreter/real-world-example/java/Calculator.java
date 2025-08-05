class Calc {

    public int calc(String expression) {

        String token[] = expression.split(" ");
        int result = Integer.parseInt(token[0]);

        for (int i = 1; i < token.length; i += 2) {
            String operator = token[i];
            int number = Integer.parseInt(token[i + 1]);

            switch (operator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                default:
                    break;
            }

        }

        return result;
    }
}

public class Calculator {

    public static void main(String[] args) {
     
        Calc calculator = new Calc();
        System.out.println("Result : " + calculator.calc("3 + 5 - 2"));

    }
    
}
