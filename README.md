# Java OOP Practice Project

## Overview
This project is a hands-on exploration of Object-Oriented Programming (OOP) concepts using Java. It serves as a learning tool to solidify an understanding of fundamental OOP principles, including polymorphism, inheritance, interfaces, abstraction, encapsulation, and more. Through this project, practical examples are implemented to demonstrate how these concepts work in real-world scenarios, utilizing Java’s powerful features such as `super`, `this`, method overriding, method overloading, and the `final` keyword.

The goal of this project is to create a modular, reusable, and well-structured codebase that showcases growing proficiency in Java and OOP design.

## Project Description
This project consists of a collection of classes, interfaces, and examples that illustrate key OOP concepts. It includes a simple simulation (e.g., a vehicle with Car, a Bank Account Simulation, or a Library management system) to provide a practical context for applying these principles. Each concept is demonstrated with clear code examples and explanations.

## OOP Concepts Covered

### 1. Encapsulation
**Definition:** Encapsulation is the bundling of data (attributes) and methods (behavior) into a single unit (class) while restricting direct access to some of an object’s components. It is achieved using access modifiers like `private`, `protected`, and `public`.

**Implementation:** Private fields with public getter and setter methods control access to data. Example: A `Person` class where the `age` field is private, and access is provided via `getAge()` and `setAge()` methods.

**Purpose:** Ensures data integrity and hides implementation details from the outside world.

### 2. Inheritance
**Definition:** Inheritance allows a class (subclass) to inherit properties and methods from another class (superclass), promoting code reuse.

**Types:**
- **Single Inheritance:** A class inherits from one superclass (e.g., `Dog` extends `Animal`).
- **Multilevel Inheritance:** A class inherits from a subclass (e.g., `Puppy` extends `Dog` extends `Animal`).
- **Hierarchical Inheritance:** Multiple classes inherit from a single superclass (e.g., `Cat` and `Dog` extend `Animal`).
  - *Note:* Java does not support multiple inheritance of classes, but it can be simulated using interfaces.

**Implementation:** A base class `Animal` with common attributes like `name` and `age`, and subclasses like `Dog` and `Cat` that inherit and extend its functionality.

**Keywords:**
- `super`: Used to call the superclass constructor or methods (e.g., `super(name)` in a subclass constructor).

**Purpose:** Reduces redundancy and establishes a clear hierarchy.

### 3. Polymorphism
**Definition:** Polymorphism allows objects of different classes to be treated as objects of a common superclass. It comes in two forms:
- **Compile-time Polymorphism:** Achieved through method overloading.
- **Runtime Polymorphism:** Achieved through method overriding.

**Implementation:**
- **Method Overloading:** Multiple methods with the same name but different parameters (e.g., `bark()` and `bark(int times)` in the `Dog` class).
- **Method Overriding:** Subclasses provide their own implementation of a superclass method (e.g., `makeSound()` in `Animal` overridden by `Dog` to return "Woof").

**Purpose:** Increases flexibility and allows dynamic behavior based on the object type.

### 4. Abstraction
**Definition:** Abstraction hides complex implementation details and exposes only the essential features of an object. Achieved using abstract classes or interfaces.

**Implementation:**
- **Abstract Class:** An abstract class `Vehicle` with an abstract method `startEngine()`, implemented differently by `Car` and `Bike`.
- **Interface:** An interface `Playable` with a method `play()`, implemented by classes like `Guitar` and `Piano`.

**Purpose:** Simplifies interaction with objects and enforces a contract for subclasses.

### 5. Interfaces
**Definition:** An interface is a fully abstract type that defines a contract of methods without implementation. Classes implement interfaces to provide the behavior.

**Implementation:**
- An interface `Swimmable` with a method `swim()`, implemented by classes like `Duck` and `Fish`.

**Key Points:**
- Supports multiple inheritance (e.g., a class can implement multiple interfaces).
- All methods are implicitly `public` and `abstract` (unless marked `default` or `static`).

**Purpose:** Ensures consistency across unrelated classes and enables loose coupling.

### 6. Final Keyword
**Definition:** The `final` keyword prevents modification or extension.

**Uses:**
- **Final Variable:** A constant (e.g., `final int MAX_SPEED = 100;`).
- **Final Method:** Cannot be overridden by subclasses (e.g., a final `calculateTax()` method).
- **Final Class:** Cannot be extended (e.g., `final class ImmutableData`).

**Implementation:** Applied `final` to a constant in a `Config` class and a method in a superclass to enforce immutability.

**Purpose:** Enhances security and design clarity.

### 7. `this` Keyword
**Definition:** `this` refers to the current object instance and is used to differentiate between instance variables and parameters or to invoke constructors.

**Implementation:** In a `Student` class, `this.name = name` is used in the constructor to assign a parameter to the instance variable.

**Purpose:** Avoids naming conflicts and improves code readability.

### 8. Method Overriding
**Definition:** A subclass provides a specific implementation of a method already defined in its superclass.

**Implementation:** Overrode the `toString()` method in a `Book` class to return a custom string representation.

**Rules:**
- Same method name, return type, and parameters as the superclass method.
- Uses the `@Override` annotation.

**Purpose:** Customizes inherited behavior.

### 9. Method Overloading
**Definition:** Multiple methods with the same name but different parameter lists (number, type, or order).

**Implementation:** In a `Calculator` class, defined `add(int a, int b)` and `add(double a, double b)` for different data types.

**Purpose:** Enhances usability by allowing flexible method calls.

---

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 8 or later
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or VS Code

### Installation & Running the Project
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/JavaOOPPractice.git
   ```
2. Open the project in your preferred IDE.
3. Compile and run the Java classes to see the concepts in action.

### Contributing
If you’d like to contribute to this project, feel free to submit a pull request. Contributions are welcome to add more examples or improve explanations.

### License
This project is licensed under the MIT License - see the LICENSE file for details.

---

Enjoy learning Java OOP!

