package S401TO600;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println(" ----");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }
}

public class S497 {
    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        switch (shapeType){
            case "Square":      return new Square();
            case "Triangle":    return new Triangle();
            case "Rectangle":   return new Rectangle();
        }
        return null;
    }
}