# Design-Pattern-In-Java
In this repository, we will see the most commonly asked design patterns interview questions for both freshers and experienced professionals

<h1>Decorator Design Pattern</h1>
Decorator design pattern belongs to the category of structural pattern that lets users add new features to an existing object without modifying the structure. This pattern creates a class called decorator class that acts as a wrapper to the existing class by keeping the signatures of class methods intact. This pattern makes use of abstract classes and interfaces with composition for implementing the wrapper. They are mostly used to apply SRP (Single Responsibility Principle) as we divide functionalities into classes with unique concerns. This pattern is structurally similar to the chain of responsibility pattern. Following are the steps to implement decorator design pattern:
<span></span>
Create an interface and concrete classes that implement this interface.
Create an abstract decorator class that implements the above interface.
Create a concrete decorator class that extends the above abstract class.
Use the concrete decorator class to decorate the interface objects and verify the output.

![image](https://github.com/PranavChandore/Design-Pattern-In-Java/assets/92688004/cbb45d95-d567-486e-b8c5-a5d804bacf15)

