public class Main {
    public static void main(String[] args) {

       Shapes triAngle = new Triangle(2,4);
        System.out.println("Уч бурчтуктун аянты: "+triAngle.findArea()+"\n");
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("торт бурчтуктун аянты: "+rectangle.findArea()+"\n");
        Circle circle = new Circle(5);
        System.out.println("аялананын аяты: "+circle.findArea()+"\n");
        Square square = new Square(4);
        System.out.println("кубтун аянты: "+square.findArea());
    }
}