public abstract class Shape {
    /**
     * Return the area of the shape. Contract: must be >= 0 for valid shapes.
     */
    public abstract double area();

    public String toString() {
        return "Shape: no dimensions";
    }

    public final String geometry() {
        return "Euclidean";
    }


}