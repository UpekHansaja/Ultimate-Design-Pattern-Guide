# Introduction of Mediator Design Pattern

The Mediator Pattern is a behavioral design pattern that defines an object (Mediator) to encapsulate how a set of objects interact. It promotes loose coupling by preventing objects from referring to each other explicitly, and it lets you alter their interaction independently.

## Characteristics of Mediator Design Pattern

 - Centralized communication between components.
 - Reduces direct dependencies (tight coupling) between components.
 - Makes code more maintainable and flexible.
 - Easy to add new colleagues or modify communication logic.
 - Components (Colleagues) talk to the Mediator, not to each other.


## Key Components

![Key Components of Mediator Pattern](image.png)


## Class Diagram

![Class Diagram of Mediator Pattern](image-1.png)


## Advantages of Mediator Design Pattern

 - Promotes loose coupling between components (colleagues).
 - Centralized control for communication.
 - Enhances maintainability and scalability.
 - Communication logic is isolated in one place (the Mediator).

## Disadvantages of Mediator Design Pattern

 - Mediator can become complex as more colleagues are added.
 - Might introduce a performance bottleneck in large systems.
 - Over-centralization may reduce flexibility.