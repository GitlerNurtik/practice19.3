public class Threeugolnik extends Shape{
    private int Osnovanie;
    private int high;
    private int side1;
    private int side2;
    private int side3;

    public Threeugolnik(int osnovanie, int high, int side1, int side2, int side3) {
        Osnovanie = osnovanie;
        this.high = high;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь вашего треугольника: "+Osnovanie*high*0.5+ " см в квадрате");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр вашего треугольника: "+side1+side2+side3+" см ");
    }
}
