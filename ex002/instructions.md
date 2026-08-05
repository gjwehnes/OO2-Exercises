# Exercise: Geometric Solids

In this exercise, you will create an interface and two classes that represent three-dimensional geometric solids. You will then create two classes that implement this interface.

## Requirements

### 1. Create a GeometricSolid Interface

The interface should define two methods:

- `getVolume()`
- `getSurfaceArea()`

Both methods should return a `double`.

### 2. Create a Cube Class

The class should:

- Implement the `GeometricSolid` interface.
- Accept the side length as a parameter when a `Cube` object is created.

#### Expected Behavior

The volume of a cube is:

```text
sideLength³
```
The surface area of a cube is:

```text
6 × sideLength²
```

### 3. Create a Sphere Class

The class should:

- Implement the `GeometricSolid` interface.
- Accept the radius as a parameter when a `Sphere` object is created.

#### Expected Behavior

The volume of a sphere is:

```text
(4/3) × π × r³
```

The surface area of a sphere is:

```text
4 × π × r²
```

### What the Unit Tests Check

The tests verify that:

- A `GeometricSolid` interface exists with the required methods.
- `Cube` implements `GeometricSolid`.
- `Cube` correctly calculates volume.
- `Cube` correctly calculates surface area.
- `Sphere` implements `GeometricSolid`.
- `Sphere` correctly calculates volume.
- `Sphere` correctly calculates surface area.

### Learning Goals

By completing this exercise, you will practice:

- Creating and implementing interfaces
- Defining constructors
- Working with object-oriented design
- Calculating geometric measurements
- Using mathematical formulas in Java
- Reading unit tests to determine software requirements

These are common skills used when designing classes that share a common interface and behavior in Java.
