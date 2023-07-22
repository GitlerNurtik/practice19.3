public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        circle.calculateArea();
        circle.calculatePerimeter();

        Threeugolnik threeugolnik = new Threeugolnik(5,3,5,4,4);
        threeugolnik.calculateArea();
        threeugolnik.calculatePerimeter();

    }
}