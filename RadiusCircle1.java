class Circle {
    private double radius;
    
    public Circle(double r) {
        radius = r;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double newR) {
        radius = newR;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class RadiusCircle1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(30);
        Circle circle3 = new Circle(150);
        
        System.out.println("Initial Circle Details:");
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
        System.out.println("Circle 3 - Radius: " + circle3.getRadius() + ", Area: " + circle3.getArea());
        
        circle2.setRadius(300);
        System.out.println("\nUpdated Circle 2 Details:");
        System.out.println("Circle 2 - New Radius: " + circle2.getRadius() + ", New Area: " + circle2.getArea());
    }
}
