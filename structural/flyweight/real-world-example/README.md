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
