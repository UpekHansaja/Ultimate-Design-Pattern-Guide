# Introduction to Composite Design Pattern

Composite design pattern is a structural pattern. It allows you to compose objects into tree structures to represent part-whole hierarchies. Treats individual objects and compositions of objects uniformly. Based on the concept of recursion.

## Characteristics
 - Supports recursive composition.
 - Treats leaf nodes and composite nodes in the same way.
 - Promotes transparent design (client doesn't need to distinguish between individual and group).
 - Commonly used to model hierarchical structures like file systems or UI components.

## Real-world Example of Composite Pattern
In a computer file system,
 - A file is a single item (like resume.pdf).
 - A folder can contain files and/or other folders.
 - You might want to perform actions like,
    - Show all contents.
    - Open everything.
    - Calculate total size.
    - Delete all contents.
 - This is a tree structure where each folder can recursively contain more items.

## Issues Without Composite Pattern:
 - No common interface between File and Folder.
 - Client needs to know whether it's dealing with a File or a Folder.
 - If behavior changes, both classes must be changed individually.
 - Not scalable - new types (e.g., Shortcuts, Archives) increase complexity.