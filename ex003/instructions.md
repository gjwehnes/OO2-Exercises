## Exercise: MenuItem and Trio

This exercise is adapted from the **AP Computer Science A 2014 Exam**.

### Background

A lunch counter offers a variety of **sandwiches**, **salads**, and **drinks**. Customers may also create a **Trio**, which consists of:

- One Sandwich
- One Salad
- One Drink

The price of a Trio is determined by adding the prices of the **two most expensive items**. The item with the **lowest price is free**.

Each menu item has:

- A name
- A price

The four item types are represented by the following classes:

- `Sandwich`
- `Salad`
- `Drink`
- `Trio`

All four classes must implement the `MenuItem` interface.

---

### Requirements

#### 1. Create a Class Hierarchy

##### A. Create the Menu Item Classes

Create the following classes:

- `Sandwich`
- `Salad`
- `Drink`

Each class must:

- Implement the `MenuItem` interface
- Store a name and a price
- Properly encapsulate all instance variables

##### B. Create the `Trio` Class

The class must implement the `MenuItem` interface, but internally hold a Drink, a Salad, and a Sandwich

The class must include a constructor that accepts:

- A `Sandwich` object
- A `Salad` object
- A `Drink` object

---

### Required Behavior

#### 2. Trio Name

The name of a Trio is formed by:

1. The sandwich name
2. A `/`
3. The salad name
4. A `/`
5. The drink name
6. A space followed by `"Trio"`

##### Example

```text
Cheeseburger/Spinach Salad/Orange Soda Trio
```

---

#### 3. Trio Price

The price of a Trio is the sum of the **two highest-priced items**.

The item with the **lowest price is free**.

##### Example 1

A Trio consisting of:

- Cheeseburger ($2.75)
- Spinach Salad ($1.25)
- Orange Soda ($1.00)

would have:

```text
Name: Cheeseburger/Spinach Salad/Orange Soda Trio
Price: $4.00
```

because the two highest prices are:

```text
$2.75 + $1.25 = $4.00
```

##### Example 2

A Trio consisting of:

- Club Sandwich ($2.75)
- Coleslaw ($1.25)
- Cappuccino ($3.50)

would have:

```text
Name: Club Sandwich/Coleslaw/Cappuccino Trio
Price: $6.25
```

because the two highest prices are:

```text
$3.50 + $2.75 = $6.25
```

---

### What Your Implementation Should Support

Your solution should allow:

- Creation of `Sandwich`, `Salad`, and `Drink` objects with names and prices.
- Creation of a `Trio` from one sandwich, one salad, and one drink.
- Retrieval of the Trio name in the required format.
- Calculation of the Trio price using the two highest-priced items.
- Proper use of interfaces and encapsulation throughout the class hierarchy.

### Learning Goals

By completing this exercise, you will practice:

- Implementing interfaces
- Designing class hierarchies
- Using composition between objects
- Encapsulating instance variables
