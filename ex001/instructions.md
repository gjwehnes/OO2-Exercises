# Exercise: UnitCircle and Comparable

In this exercise, you will create a `UnitCircle` class that represents a circle using its radius.

## Requirements

### 1. Create a `UnitCircle` Class

The class should:

- Store a radius as an integer.
- Accept the radius as a parameter when a `UnitCircle` object is created.

### 2. Implement the Comparable Interface

Your class must implement Java's `Comparable` interface.

The purpose of the `compareTo()` method is to compare two circles based on their radius.

#### Expected Behavior

When comparing two circles:

- Return a negative value if the current circle's radius is smaller.
- Return `0` if both circles have the same radius.
- Return a positive value if the current circle's radius is larger. citeturn2search1

### 3. Provide a String Representation

Override the `toString()` method.

The unit test expects circles to be displayed in the following format:

```text
UnitCircle[r=1]
```

If the radius is 8:

```text
UnitCircle[r=8]
```

The formatting, capitalization, brackets, and punctuation must match exactly.

---

### 4. Verify Comparable Support

The unit test checks that a `UnitCircle` object can be treated as a `Comparable` object. Therefore, your class declaration should indicate that it implements the `Comparable` interface.

---

## What the Unit Tests Check

The tests verify that:

1. Larger circles compare as greater than smaller circles. citeturn2search1
2. Smaller circles compare as less than larger circles. citeturn2search1
3. Equal-radius circles compare as equal. citeturn2search1
4. `toString()` returns the exact expected format. citeturn2search1
5. `UnitCircle` implements `Comparable`. citeturn2search1

## Learning Goals

By completing this exercise, you will practice:

- Implementing an interface
- Writing a `compareTo()` method
- Comparing objects by an attribute
- Overriding `toString()`
- Reading unit tests to determine software requirements

These are common skills used when creating objects that can be sorted or compared in Java.
