public class Parallelepiped extends GeometricFigure {
    
    private double a;
    private double b;
    private double angleAB;
    private double c;
    private double angleABC;
    private double angleAC;
    //probems with geometry((

    public Parallelepiped(double xPositon, double yPositon, double zPositon, double a, double b, double angleAB, double c, double angleABC, double angleAC) {
        super(xPositon, yPositon, zPositon);
        this.a = a;
        this.b = b;
        this.angleAB = angleAB;
        this.c = c;
        this.angleABC = angleABC;
        this.angleAC = angleAC;
    }

    public Parallelepiped() {
        this(0, 0, 0, 1, 1, Math.PI / 2, 1, Math.PI / 2, Math.PI / 2);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getAngleAB() {
        return angleAB;
    }

    public void setAngleAB(double angleAB) {
        this.angleAB = angleAB;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getAngleABC() {
        return angleABC;
    }

    public void setAngleABC(double angleABC) {
        this.angleABC = angleABC;
    }

    public double getAngleAC() {
        return angleAC;
    }

    public void setAngleAC(double angleAC) {
        this.angleAC = angleAC;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double calculateSurfaceSquare() {
        double angleBC;
        if (Math.cos(angleABC) != 0) {
            angleBC = Math.acos(Math.cos(angleABC) * Math.cos(angleAB - Math.acos(Math.cos(angleAC) / Math.cos(angleABC))));
        }
        else {
            angleBC = Math.acos(0);
        }
        return a * b * Math.sin(angleAB) * 2 + a * c * Math.sin(angleAC) * 2 + b * c * Math.sin(angleBC) * 2;
    }

}
