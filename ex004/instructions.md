### Exercise: Menu Extension

This exercise extends the **MenuItem hierarchy** created in the previous exercise.

#### Background

A lunch counter offers menu items represented by a class hierarchy built around the **MenuItem** interface.

Previously, you created:
- Sandwich
- Salad
- Drink
- Trio

In this exercise, you will create specialized menu item classes that represent specific menu offerings.

#### Requirements

##### 1. Create Specialized Menu Item Classes

Create the following subclasses:
- ClubSandwich extends Sandwich
- SpinachSalad extends Salad
- Cappuccino extends Drink

Because Sandwich, Salad, and Drink already implement the **MenuItem** interface, these subclasses automatically inherit that behavior. You should **not** re-implement the MenuItem interface.

##### 2. Use Proper Encapsulation

All subclasses must follow proper object-oriented design principles:
- Do not access superclass instance variables directly.
- Use the appropriate constructors, accessors, or methods provided by the superclass.
- Maintain encapsulation throughout the hierarchy.

##### 3. Fixed Menu Item Values

Each class must provide a zero-argument constructor that initializes the object with the following fixed values:

| Class | Name | Price |
|---------|---------|---------:|
| ClubSandwich | Club Sandwich | 2.75 |
| SpinachSalad | Spinach Salad | 1.25 |
| Cappuccino | Cappuccino | 3.50 |

#### Required Behavior

##### 4. Support Trio Integration

Your implementation should work correctly with the existing Trio class.

###### Example

```java
Cappuccino cappuccino = new Cappuccino();
ClubSandwich clubSandwich = new ClubSandwich();
SpinachSalad spinachSalad = new SpinachSalad();

Trio trio = new Trio(clubSandwich, spinachSalad, cappuccino);
```

The Trio should produce:

Name:
```text
Club Sandwich/Spinach Salad/Cappuccino Trio
```

Price:
```text
6.25
```

Because the two highest-priced items are:
- Cappuccino ($3.50)
- Club Sandwich ($2.75)

The lowest-priced item, Spinach Salad ($1.25), is free.

#### What Your Implementation Should Support

Your solution should allow:
- Creation of ClubSandwich objects using a default constructor.
- Creation of SpinachSalad objects using a default constructor.
- Creation of Cappuccino objects using a default constructor.
- Proper inheritance from Sandwich, Salad, and Drink.
- Proper use of encapsulation throughout the class hierarchy.
- Correct interaction with the Trio class.
- Successful execution of the provided unit test.

#### Learning Goals

By completing this exercise, you will practice:
- Extending existing classes through inheritance.
- Reusing behavior from parent classes.
- Applying encapsulation correctly.
- Working with interfaces through inheritance.
- Validating behavior using unit tests.
