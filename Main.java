public class Main {
    public static void main(String[] args) {
        System.out.println(GeometricFigure.getNumberOfCreated());
        Ball ball1 = new Ball();
        System.out.println(ball1.getNumberOfCreated());
        Cylinder cylinder1 = new Cylinder();
        System.out.println(ball1.getNumberOfCreated());
        System.out.println(cylinder1.getNumberOfCreated());
        ball1.setRadius(9);
        System.out.println(ball1.getRadius());
    }
}
