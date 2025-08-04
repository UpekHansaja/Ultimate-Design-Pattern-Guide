# Introduction to Flyweight Pattern

Flyweight is a structural design pattern that enables sharing common data across multiple objects to reduce memory usage.

## Intent:
Minimize memory by sharing as much data as possible with similar objects.

## When to use:
 - You have a large number of similar objects
 - Object creation is resource-intensive

## Object State:

                                   +-------------+
                                   | Object State|
                                   +-------------+
                                          |
                                          |
                        +---------------------------------------+
                        |                                       |
                        v                                       v
                +----------------+                       +----------------+
                | Intrinsic State|                       | Extrinsic State|
                +----------------+                       +----------------+

### Intrinsic State:
    - This refers to the data that is shared among multiple objects of the same type.
    - It is independent of the object's context and remains constant once initialized.
    - Intrinsic state is typically stored within the flyweight object itself and made immutable to ensure consistent sharing.
    - Examples include the font style and size of a character in a text editor, or the type and color of a chess piece.

### Extrinsic State:
    - This refers to the data that is unique to each object instance and varies with its context.
    - It is not stored within the flyweight object but is instead passed to the object dynamically when its operations are invoked.
    - Extrinsic state allows flyweight objects to be reused across different contexts by providing the specific contextual information needed for each use case.
    - Examples include the position of a character on a screen, or the position of a chess piece on a board.


## Characteristics of the Flyweight Pattern
 
 • Intrinsic vs. Extrinsic state separation.
 • Uses a factory to cache manage shared instances.
 • Ideal for systems with high object counts (e.g., text editors, game engines).
 • Reduces memory footprint but increases complexity.