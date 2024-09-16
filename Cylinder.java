public class Cylinder extends GeometricFigure{

    private double radius;
    private double height;

    public Cylinder(double xPositon, double yPositon, double zPositon, double radius, double height) {
        super(xPositon, yPositon, zPositon);
        this.radius = radius;
        this.height = height;
    }

    public Cylinder() {
        this(0, 0, 0, 1, 1);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double calculateSurfaceSquare() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

}
