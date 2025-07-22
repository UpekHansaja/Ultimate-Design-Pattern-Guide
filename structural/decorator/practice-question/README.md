# Q:
 - You are developing a food ordering system for a cafe that sells beverages like coffe and tea. Customers can customize their drinks by adding extra items such as milk, sugar, whipped cream, or chocolate. Each addition increases the total cost of the drink.

The menu changes frequently with new add-ons, and you want to avoid creating a subclass for every possible combination (eg: MilkCoffeeWithSugar, TeaWithWhippedCreamAndSugar, etc..). You are also expected to support runtime configuration of add-ons, meaning the user can choose add-ons dynamically before checkout.

Task:
 1. Explain why the decorator pattern is suitable for this scenario.
 2. Illustrate how you would design the system using the decorator pattern.
 3. Include the following components in your explanation:
    - The Component interface .
    - One or two Concrete Components.
    - At least two Decorators with price modification logic.