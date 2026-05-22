package basic;

abstract class Shape {

    abstract double area();

    abstract double perimeter();
}

interface Drawable {

    void draw();
}

class Circle extends Shape implements Drawable {

    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class ShapeDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);

        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());

        c1.draw();

        System.out.println();

        Shape s = new Circle(7);

        System.out.println("Area using Shape reference: " + s.area());
        System.out.println("Perimeter using Shape reference: " + s.perimeter());

        System.out.println();

        Drawable d = new Circle(10);

        d.draw();
    }
}