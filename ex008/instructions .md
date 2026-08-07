#### Shapes

This exercise focuses on extending an abstract class with both abstract and concrete methods. Then, we will create a method that demonstrates the value of using an abstract superclass.

##### Background
You should review the concept of abstract and concrete classes and methods.

You also will remember the subtituion principle (LSP). In this case, we are using a more generic definition:  **a subclass should be able to replace its superclass without changing the correctness of the program**.
- The superclass establishes a **behavioral contract**. This is partly done through the syntax (what methods need to be included in subclasses), partly through the naming (as methods should be descriptive of what they do), and partly through their own implementation (which subclasses will inherit).
- In this case, we want to ensure that all subclasses of `Shape` cannot return a negative area.
- Therefore, we test whether they throw exceptions if one tries to instatiate the shape with negative parameters.


##### Requirements:

The goal is to implement an abstract Shape type with a double area() method and three concrete subclasses (Circle, Rectangle, Triangle). Each shape returns a non-negative area (area() >= 0). Constructors should validate dimensions (reject negative values with IllegalArgumentException).

Use the ShapeTest unit test as your guide for expected behaviour

Shape must be an abstract class with 
- abstract method `double area()`;
- concrete method `String toString()`;

Circle, Rectangle, Triangle must extend Shape and override area() correctly:
- Circle: area = pi \* radius^2
- Rectangle: area = width \* height
- Triangle: area = base \* height / 2

ShapeUtils.totalArea(List<Shape>) returns the sum of area() for all non-null shapes in the list.


##### Notes:
- Why should the Shape be abstract?
    - You cannot have an instance of a Shape in the "real" world that does not have dimensions
    - Thus, to model this reality, the design specifies that you cannot create an object of type Shape
- Why should the area method be abstract?
    - Simply, because a Shape by itself cannot calculate an area... it has no dimensions, or even a specific geometry!
    - We want to keep our design mathematically correct, so we explicitly enforce this
- Why should the dimensions method be concrete?
    - To save space... all subclasses will inherit this method, and thus do not need to re-implement it
    - It does allow for subclasses to override this method, if one day we want to implement 3D objects.
- Why should the geometry method be final?
    - Partly to save space, for the same reason as above
    - Also, we may by design want to ensure that all subclasses represent objects in Euclidian space. The final keyword ensures that this method cannot be overriden
    - Of course we cannot control how a subclass is actually designed but we can hope that they would follow the substitution principle!