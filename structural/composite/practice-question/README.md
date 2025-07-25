Senario:
 You are developing a document editor application that supports a variety of content types such as,
    -   text, 
    -   images,
    -   tables.
 Users can create individual items like a Textbox, an Image, or a Table, and also group these items into Sections and Pages. Each Section or Page can contain a mix of items, including other nested sections.

Your task is to design a system that allows:
• Treating individual elements (Textbox, Image, Table) and groups of elements (Sections, Pages) uniformly.
• Applying actions like render(), move(), or resize() on both single elements and groups.
• Easily extending the system with new components like Charts or Videos.

Question:
 As a software architect, how would you apply the Composite Design Pattern to this scenario? Explain:
    1. What would be the Component, Composite, and Leaf classes?
    2. How does the Composite Pattern help in this scenario?
    3. If a new component like Chart needs to be added later, what changes are required?
    4. What are the potential drawbacks of using Composite Pattern in this case?
    5. Draw an UML class diagram to demonstrate this scenario.