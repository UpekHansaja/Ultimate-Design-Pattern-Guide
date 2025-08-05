# Question:
You are developing a text editor application (like Microsoft Word or Google Docs) where users can write documents containing thousands of characters. Each character has formatting attributes such as font family, font size, style (bold, italic), and color.

In a large document, many characters share the same formatting. For example, entire paragraphs might use the same font, size, and style. However, each character has a different position (line number, column number).

Given this context:
 1. What design challenges arise if you store every character along with its formatting individually?
 2. Explain how the Flyweight Design Pattern can help improve the memory efficiency of the application.
 3. Identify what attributes can be considered intrinsic and extrinsic in this scenario.
 4. Design a high-level class structure using Flyweight pattern principles.
 5. Write down sample code snippet to demonstrate this scenario.
 6. What role does the Flyweight Factory play here, and why is it essential?
 7. How would the system behave differently (in memory and performance) with and without the Flyweight pattern?

