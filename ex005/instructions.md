### Exercise: UtensilCheck

This exercise builds on the **MenuItem hierarchy** created in the previous exercises.

#### Background

A lunch counter offers a variety of menu items represented by the following classes:
- Sandwich
- Salad
- Drink
- Cappuccino
- Trio

When preparing a take-out order, the restaurant must determine which utensils should be included for each menu item.

#### Requirements

##### 1. Create the UtensilCheck Class

Create a new class named **UtensilCheck**.

The class will provide information about which utensils should be included with a take-out order.

##### 2. Create Static Methods

Implement the following **static boolean methods**:
- requireFork(MenuItem item)
- requireKnife(MenuItem item)
- requireSpoon(MenuItem item)
- requireStraw(MenuItem item)

Each method must:
- Accept exactly one parameter of type MenuItem.
- Return true if the utensil should be included.
- Return false otherwise.

#### Required Behavior

##### 3. Fork Requirements

A fork is required for:
- Sandwiches
- Salads

A fork is not required for:
- Drinks
- Cappuccinos

##### 4. Knife Requirements

A knife is required for:
- Sandwiches

A knife is not required for:
- Salads
- Drinks
- Cappuccinos

##### 5. Spoon Requirements

A spoon is required for:
- Cappuccinos

A spoon is not required for:
- Sandwiches
- Salads
- Other Drinks

##### 6. Straw Requirements

A straw is required for:
- Drinks, with the exception of Cappuccinos

A straw is not required for:
- Sandwiches
- Salads

#### Implementation Notes

You will need to determine the runtime type of the MenuItem provided to each method.

You may use either:
- The instanceof operator
- The object's class information

Be aware that these approaches behave differently when inheritance is involved.

#### Example Expectations

| Menu Item | Fork | Knife | Spoon | Straw |
|------------|:----:|:-----:|:-----:|:-----:|
| Sandwich | ✓ | ✓ | ✗ | ✗ |
| Salad | ✓ | ✗ | ✗ | ✗ |
| Drink | ✗ | ✗ | ✗ | ✓ |
| Cappuccino | ✗ | ✗ | ✓ | ✗ |

#### What Your Implementation Should Support

Your solution should allow:
- Determining whether a fork is required for any MenuItem.
- Determining whether a knife is required for any MenuItem.
- Determining whether a spoon is required for any MenuItem.
- Determining whether a straw is required for any MenuItem.
- Correct handling of Cappuccino as a specialized Drink.
- Use of runtime type checking through a MenuItem reference.
- Successful execution of the provided unit test.

#### Learning Goals

By completing this exercise, you will practice:
- Working with inheritance hierarchies.
- Using polymorphism through interfaces.
- Determining object types at runtime.
- Writing utility methods that operate on abstract types.
- Applying object-oriented design principles.
