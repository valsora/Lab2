public class Ball extends GeometricFigure {
    
    private double radius;

    public Ball(double xCenter, double yCenter, double zCenter, double radius) {
        super(xCenter, yCenter, zCenter);
        this.radius = radius;
    }

    public Ball() {
        this(0, 0, 0, 0);
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
