## Definition:

The Builder pattern is a creational design pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

## When to Use:
 - You want to construct a complex object step by step.
 - You want to avoid a telescoping constructor anti-pattern.
 - You want code that's readable and maintainable.

## Characteristics:
 - Handles complex object creation.
 - Separates construction logic from object representation.
 - Follows the step-by-step object creation process.
 - Often used with Immutable objects.
 - Supports method chaining (fluent interface).