package lab12;
enum Shape {
    SQUARE(1),
    RECTANGLE(2),
    CIRCLE(3),
    TRAPEZOID(4),
    RHOMBUS(5),
    TRIANGLE(6),
    OVAL(7),
    HEXAGON(8);

    private final int initialValue;
    Shape(int initialValue) {
        this.initialValue = initialValue;
    }

    public int getInitialValue() {
        return initialValue;
    }

    // Getter method to retrieve the ordinal value
    public int getOrdinalValue() {
        return ordinal();
    }
}

public class task1 {
    public static void main(String[] args) {
        // Display enumeration constants, initial values, and ordinal values
        System.out.println("Enumeration Constants and their Values:");
        for (Shape shape : Shape.values()) {
            System.out.println(shape + ": Initial Value = " + shape.getInitialValue() +
                    ", Ordinal Value = " + shape.getOrdinalValue());
        }
    }
}

