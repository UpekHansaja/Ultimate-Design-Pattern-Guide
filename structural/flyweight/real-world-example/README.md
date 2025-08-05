# Real-World Example: Tree Rendering in a Forest

## Scenario:

Imagine you are building a 2D forest simulation game or a map visualization tool, where thousands or even millions of trees must be rendered on screen. Each tree has attributes such as:
 - Tree Type (e.g., Oak, Pine)
 - Color (e.g., Green, Yellow)
 - Texture (e.g., Rough, Smooth)
 - ShapePosition (x, y) in the world

In a naive approach, each tree object would store all these properties, even if many trees are identical in type and appearance. For example, you might end up with:
 - 10,000 Oak trees with the same green color and Rough texture.
 - 10,000 Pine trees with another common set of properties. (yellow color, smooth texture)


## Explanation
 - Each Tree object contains full information, including type, color, and texture.
 - Even though many trees are of the same type, every instance duplicates the same data, wasting memory.
 - In total, you're creating 20,000 full tree objects, even though only 2 types exist (Oak and Pine).

## Drawbacks
 - High memory usage: Each object duplicates "Oak", "Green", "Rough" or "Pine", "Yellow", "Smooth".
 - Slow performance: Due to increased garbage collection and object creation.
 - No reuse of shared data.


## Class Diagram:

![Class Diagram](image.png)