# Object-Oriented Design Patterns Guide

A comprehensive guide to software design patterns with practical implementations. This repository contains examples and explanations of the most commonly used design patterns in software development.

## Table of Contents

- [Introduction](#introduction)
- [Design Pattern Categories](#design-pattern-categories)
  - [Creational Patterns](#creational-patterns)
  - [Structural Patterns](#structural-patterns)
  - [Behavioral Patterns](#behavioral-patterns)
- [How to Use This Guide](#how-to-use-this-guide)
- [Pattern Implementation Status](#pattern-implementation-status)
- [Contributing](#contributing)

## Introduction

Design patterns are reusable solutions to commonly occurring problems in software design. They represent best practices and provide a common vocabulary for developers to communicate about recurring design problems and their solutions.

This guide follows the classic patterns from the "Gang of Four" (GoF) book, along with some additional modern patterns that have become widely adopted in the software development community.

## Design Pattern Categories

### Creational Patterns
Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

| Pattern | Description | Folder |
|---------|-------------|---------|
| [Singleton](./creational/singleton/) | Ensures a class has only one instance and provides global access to it | `creational/singleton/` |
| [Factory Method](./creational/factory-method/) | Creates objects without specifying their concrete classes | `creational/factory-method/` |
| [Abstract Factory](./creational/abstract-factory/) | Provides an interface for creating families of related objects | `creational/abstract-factory/` |
| [Builder](./creational/builder/) | Constructs complex objects step by step | `creational/builder/` |
| [Prototype](./creational/prototype/) | Creates objects by cloning existing instances | `creational/prototype/` |

### Structural Patterns
Structural patterns deal with object composition, helping to ensure that if one part changes, the entire structure doesn't need to change.

| Pattern | Description | Folder |
|---------|-------------|---------|
| [Adapter](./structural/adapter/) | Allows incompatible interfaces to work together | `structural/adapter/` |
| [Bridge](./structural/bridge/) | Separates abstraction from implementation | `structural/bridge/` |
| [Composite](./structural/composite/) | Composes objects into tree structures | `structural/composite/` |
| [Decorator](./structural/decorator/) | Adds behavior to objects without altering their structure | `structural/decorator/` |
| [Facade](./structural/facade/) | Provides a simplified interface to a complex subsystem | `structural/facade/` |
| [Flyweight](./structural/flyweight/) | Minimizes memory usage by sharing common data | `structural/flyweight/` |
| [Proxy](./structural/proxy/) | Provides a placeholder or surrogate for another object | `structural/proxy/` |

### Behavioral Patterns
Behavioral patterns focus on communication between objects and the assignment of responsibilities.

| Pattern | Description | Folder |
|---------|-------------|---------|
| [Chain of Responsibility](./behavioral/chain-of-responsibility/) | Passes requests along a chain of handlers | `behavioral/chain-of-responsibility/` |
| [Command](./behavioral/command/) | Encapsulates requests as objects | `behavioral/command/` |
| [Interpreter](./behavioral/interpreter/) | Defines a grammar and interpreter for a language | `behavioral/interpreter/` |
| [Iterator](./behavioral/iterator/) | Provides a way to access elements sequentially | `behavioral/iterator/` |
| [Mediator](./behavioral/mediator/) | Defines how objects interact with each other | `behavioral/mediator/` |
| [Memento](./behavioral/memento/) | Captures and restores object state | `behavioral/memento/` |
| [Observer](./behavioral/observer/) | Notifies multiple objects about state changes | `behavioral/observer/` |
| [State](./behavioral/state/) | Allows objects to alter behavior when internal state changes | `behavioral/state/` |
| [Strategy](./behavioral/strategy/) | Defines a family of algorithms and makes them interchangeable | `behavioral/strategy/` |
| [Template Method](./behavioral/template-method/) | Defines algorithm skeleton, subclasses override specific steps | `behavioral/template-method/` |
| [Visitor](./behavioral/visitor/) | Defines operations on objects without changing their classes | `behavioral/visitor/` |

## How to Use This Guide

Each design pattern folder contains:

- **README.md** - Detailed explanation of the pattern
- **Implementation files** - Code examples in various programming languages
- **UML diagrams** - Visual representation of the pattern structure
- **Use cases** - Real-world scenarios where the pattern is applicable
- **Pros and cons** - Advantages and disadvantages of using the pattern

### Folder Structure Example
```
pattern-name/
├── README.md
├── java/
│   ├── Example.java
│   └── ...
├── python/
│   ├── example.py
│   └── ...
├── javascript/
│   ├── example.js
│   └── ...
├── uml/
│   └── diagram.png
└── examples/
    └── real-world-example/
```

## Pattern Implementation Status

| Category | Pattern | Status |
|----------|---------|---------|
| **Creational** | Singleton | ⏳ Planned |
| | Factory Method | ⏳ Planned |
| | Abstract Factory | ⏳ Planned |
| | Builder | ⏳ Planned |
| | Prototype | ⏳ Planned |
| **Structural** | Adapter | ⏳ Planned |
| | Bridge | ⏳ Planned |
| | Composite | ⏳ Planned |
| | Decorator | ⏳ Planned |
| | Facade | ⏳ Planned |
| | Flyweight | ⏳ Planned |
| | Proxy | ⏳ Planned |
| **Behavioral** | Chain of Responsibility | ⏳ Planned |
| | Command | ⏳ Planned |
| | Interpreter | ⏳ Planned |
| | Iterator | ⏳ Planned |
| | Mediator | ⏳ Planned |
| | Memento | ⏳ Planned |
| | Observer | ⏳ Planned |
| | State | ⏳ Planned |
| | Strategy | ⏳ Planned |
| | Template Method | ⏳ Planned |
| | Visitor | ⏳ Planned |

**Legend:**
- ⏳ Planned
- 🚧 In Progress  
- ✅ Complete
- ❌ Not Applicable

## Key Benefits of Design Patterns

- **Reusability** - Solutions can be applied to similar problems
- **Communication** - Provides a common vocabulary for developers
- **Best Practices** - Incorporates proven solutions and techniques
- **Maintainability** - Makes code more organized and easier to modify
- **Flexibility** - Promotes loose coupling and high cohesion

## When to Use Design Patterns

- When you encounter recurring design problems
- When you need to make your code more flexible and maintainable
- When working in a team and need a common design vocabulary
- When refactoring existing code to improve its structure

## When NOT to Use Design Patterns

- Don't force patterns where they don't naturally fit
- Avoid over-engineering simple solutions
- Don't use patterns just for the sake of using them
- Consider the complexity they might add to your codebase

## Learning Path Recommendations

### Beginner Level
1. **Strategy Pattern** - Easy to understand and widely applicable
2. **Observer Pattern** - Fundamental for event-driven programming
3. **Factory Method** - Good introduction to creational patterns
4. **Decorator Pattern** - Teaches object composition

### Intermediate Level
1. **Command Pattern** - Advanced behavioral pattern
2. **Adapter Pattern** - Essential for working with legacy code
3. **Template Method** - Great for understanding inheritance
4. **Builder Pattern** - Useful for complex object creation

### Advanced Level
1. **Abstract Factory** - Complex creational pattern
2. **Visitor Pattern** - Advanced behavioral pattern
3. **Mediator Pattern** - Complex object interaction management
4. **Flyweight Pattern** - Performance optimization pattern

## Contributing

Contributions are welcome! Please follow these guidelines:

1. **Fork the repository**
2. **Create a feature branch** for your pattern implementation
3. **Follow the established folder structure**
4. **Include comprehensive documentation**
5. **Add real-world examples**
6. **Update the implementation status table**
7. **Submit a pull request**

### Code Style Guidelines
- Use clear and descriptive variable/method names
- Include comprehensive comments
- Follow language-specific conventions
- Provide multiple implementation examples when applicable

## Resources and References

- **Books:**
  - "Design Patterns: Elements of Reusable Object-Oriented Software" by Gang of Four
  - "Head First Design Patterns" by Freeman & Robson
  - "Patterns of Enterprise Application Architecture" by Martin Fowler

- **Online Resources:**
  - [Refactoring.Guru - Design Patterns](https://refactoring.guru/design-patterns)
  - [SourceMaking - Design Patterns](https://sourcemaking.com/design_patterns)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Happy Coding!** 🚀

*This guide is a living document and will be continuously updated as new patterns and examples are added.*
