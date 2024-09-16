public class Ball extends GeometricFigure {
    
    private double radius;

    public Ball(double xPositon, double yPositon, double zPositon, double radius) {
        super(xPositon, yPositon, zPositon);
        this.radius = radius;
    }

    public Ball() {
        this(0, 0, 0, 1);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public double calculateSurfaceSquare() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

}
