# Football Shop Application (OOP in Java)

This project demonstrates the application of **Object-Oriented Programming (OOP)** principles in Java through a Football Shop system. It includes classes to manage football products, customers, invoices, and discounts while leveraging Java concepts like inheritance, interfaces, exceptions, and comparable functionality.

---

## Classes Overview

### 1. **Boots.java**  
Represents football boots, with properties such as size, brand, and price.

### 2. **Soccerball.java**  
Represents soccer balls, including attributes like type, size, and material.

### 3. **Customer.java**  
Handles customer information, such as name, contact details, and purchase history.

### 4. **Invoice.java**  
Generates invoices for customer purchases, detailing items, prices, and discounts.

### 5. **DiscConsiderable.java**  
An interface for applying discounts to products.

### 6. **FootballShop.java**  
Main class that serves as the entry point for managing the shop's operations, including adding products, handling customers, and generating invoices.

### 7. **NotBallTypeException.java**  
A custom exception thrown when an invalid ball type is used.

### 8. **Comparable.java**  
Implements the `Comparable` interface for sorting products or invoices based on specific criteria.

---

## Key Features

- **Encapsulation**: Each class encapsulates related properties and methods.  
- **Inheritance**: Shared functionality across products is achieved through inheritance.  
- **Polymorphism**: Interfaces and overridden methods allow dynamic behavior.  
- **Exception Handling**: Custom exceptions, such as `NotBallTypeException`, ensure robust error handling.  
- **Comparisons**: The `Comparable` interface is implemented for sorting items (e.g., by price or brand).  
