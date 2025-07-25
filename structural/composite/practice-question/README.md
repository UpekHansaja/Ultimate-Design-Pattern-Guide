# Senario:
 You are developing a document editor application that supports a variety of content types such as,
    -   text, 
    -   images,
    -   tables.
 Users can create individual items like a Textbox, an Image, or a Table, and also group these items into Sections and Pages. Each Section or Page can contain a mix of items, including other nested sections.

Your task is to design a system that allows:
• Treating individual elements (Textbox, Image, Table) and groups of elements (Sections, Pages) uniformly.
• Applying actions like render(), move(), or resize() on both single elements and groups.
• Easily extending the system with new components like Charts or Videos.

# Q:
 As a software architect, how would you apply the Composite Design Pattern to this scenario? Explain:
    1. What would be the Component, Composite, and Leaf classes?
    2. How does the Composite Pattern help in this scenario?
    3. If a new component like Chart needs to be added later, what changes are required?
    4. What are the potential drawbacks of using Composite Pattern in this case?
    5. Draw an UML class diagram to demonstrate this scenario.

# A:

## 1.
 The Component class would be an interface called `DocumentElement` with methods like `render()`, `move(int x, int y)`, and `resize(double scale)`. 
 The Composite class would be `Section` or `Page`, which implements `DocumentElement` and can contain other `DocumentElement` objects. The Leaf classes would be individual elements like `TextBox`, `Image`, and `Table`, which also implement the `DocumentElement` interface.

## 2.
 - Uniformity: Treat all elements (Textbox, Image, Section, Page) the same.
 - Recursive Composition: Sections inside Pages, Sections inside Sections.
 - Scalability: Adding new element types (e.g., Chart, Video) only requires implementing the DocumentElement interface.
 - Extensibility: New actions like export() or highlight() can be added to the interface and all components will support it uniformly.

## 3.
 View [EditDocsApp.java](./java/EditDocsApp.java)

## 4.
 - Complexity in Large Hierarchies:
        -   Managing deeply nested elements can become hard to debug or maintain.
 - Overgeneralization: 
        -   Not all operations may be meaningful for all components (e.g., resizing a Section may not make sense). You may need to throw exceptions or no-op in such cases.
 - Performance:
        -   Recursive calls in large document trees (e.g., for render()) can affect performance.
 - Uniform Interface Trade-off:
        -   Uniform method signatures force all elements to support all operations, even if not meaningful (e.g., moving a Page).