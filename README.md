# Design-Pattern-In-Java
In this repository, we will see the most commonly asked design patterns interview questions for both freshers and experienced professionals

<h1>Decorator Design Pattern</h1>
Decorator design pattern belongs to the category of structural pattern that lets users add new features to an existing object without modifying the structure. This pattern creates a class called decorator class that acts as a wrapper to the existing class by keeping the signatures of class methods intact. This pattern makes use of abstract classes and interfaces with composition for implementing the wrapper. They are mostly used to apply SRP (Single Responsibility Principle) as we divide functionalities into classes with unique concerns. This pattern is structurally similar to the chain of responsibility pattern. Following are the steps to implement decorator design pattern:
<br> </br>
1)Create an interface and concrete classes that implement this interface.<br> </br>
2)Create an abstract decorator class that implements the above interface.<br> </br>
3)Create a concrete decorator class that extends the above abstract class.<br> </br>
4)Use the concrete decorator class to decorate the interface objects and verify the output.<br> </br>

![image](https://github.com/PranavChandore/Design-Pattern-In-Java/assets/92688004/cbb45d95-d567-486e-b8c5-a5d804bacf15)

<br></br>
<h1> Factory-Design-Pattern</h1>
Factory design pattern belongs to the category of Creational Design Patterns. Here, the objects are created without exposing the logic of creation to the client. The objects refer to the common interface.

Let us understand this with the help of an example.

Let’s consider 3 classes Square, Rectangle and Triangle. We will be using factory patterns to create objects of these three classes without exposing the creation logic by making use of ShapeFactory class. The Driver class would be passing the information like RECTANGLE/SQUARE/TRIANGLE for getting the required object. The following UML diagram represents the scenario.

![image](https://github.com/PranavChandore/Design-Pattern-In-Java/assets/92688004/897507e5-9772-43e7-a19e-20736eb8b05b)


