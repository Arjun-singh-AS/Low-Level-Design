import java.util.HashMap;
import java.util.Map;

interface Shape {
    void draw(int x, int y); // extrinsic (unshared data)
}

class Circle implements Shape {

    private String color; // intrinsic (shared data)

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("Circle of color " + color +
                " drawn at (" + x + "," + y + ")");
    }
}

class ShapeFactory {

    private static Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {

        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating new circle of color: " + color);
        }

        return circle;
    }
}

public class ShapeFlyweightDesign {
    
    public static void main(String[] args) {
        Shape circle1 = ShapeFactory.getCircle("Red");
        circle1.draw(10, 20);

        Shape circle2 = ShapeFactory.getCircle("Blue");
        circle2.draw(30, 40);

        Shape circle3 = ShapeFactory.getCircle("Red");
        circle3.draw(50, 60);
    }
    
}
