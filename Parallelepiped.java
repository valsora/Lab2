public class Parallelepiped extends GeometricFigure {
    
    private double a;
    private double b;
    private double angleAB;
    private double c;
    private double angleCAndAB;
    private double angleAC;
    //probems with geometry((
    //angleCAndAB should be equal or less than 90deg
    //arccos(cos(angleAC)/cos(anglecAndAB)) sould be equal or less than angleAB - projection of C should be between A and B

    public Parallelepiped(double xPositon, double yPositon, double zPositon, double a, double b, double angleAB, double c, double angleCAndAB, double angleAC) {
        super(xPositon, yPositon, zPositon);
        this.a = a;
        this.b = b;
        this.angleAB = angleAB;
        this.c = c;
        this.angleCAndAB = angleCAndAB;
        if (angleCAndAB == Math.PI / 2) this.angleAC = Math.PI / 2;
        else this.angleAC = angleAC;
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
        return angleCAndAB;
    }

    public void setAngleABC(double angleCAndAB) {
        this.angleCAndAB = angleCAndAB;
    }

    public double getAngleAC() {
        return angleAC;
    }

    public void setAngleAC(double angleAC) {
        this.angleAC = angleAC;
    }

    @Override
    public double calculateVolume() {
        return a * b * Math.sin(angleAB) * c * Math.sin(angleCAndAB);
    }

    @Override
    public double calculateSurfaceSquare() {
        double angleBC;
        if (Math.cos(angleCAndAB) != 0) {
            angleBC = Math.acos(Math.cos(angleCAndAB) * Math.cos(angleAB - Math.acos(Math.cos(angleAC) / Math.cos(angleCAndAB))));
        }
        else {
            angleBC = Math.acos(0);
        }
        return a * b * Math.sin(angleAB) * 2 + a * c * Math.sin(angleAC) * 2 + b * c * Math.sin(angleBC) * 2;
    }

}
