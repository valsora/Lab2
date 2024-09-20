public class Main {
    public static void main(String[] args) {
        System.out.println(GeometricFigure.getNumberOfCreated());
        Ball ball1 = new Ball();
        System.out.println(GeometricFigure.getNumberOfCreated());
        Cylinder cylinder1 = new Cylinder();
        System.out.println(GeometricFigure.getNumberOfCreated());
        System.out.println(GeometricFigure.getNumberOfCreated());
        cylinder1.setHeight(4);
        ball1.setRadius(9);
        System.out.println(ball1.getRadius());
        System.out.println(cylinder1.calculateVolume());
        Parallelepiped p = new Parallelepiped(0, 0, 0, 10, 10, Math.PI / 2, 6, Math.PI / 6, Math.PI / 6);
        System.out.println(p.calculateSurfaceSquare());
        System.out.println(p.calculateVolume());
    }
}
