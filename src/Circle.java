public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь вашего круга: "+ Math.pow(radius,2)*3.14+" см в квадрате");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр вашего круга: "+(radius*3.14)*2+" см");
    }
}
