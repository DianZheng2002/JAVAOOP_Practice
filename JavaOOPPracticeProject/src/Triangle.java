public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (isValidTriangle(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("无法构成三角形，三边设为0");
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getArea() {
        double s = getPiremeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPiremeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("三角形三边是：%.1f, %.1f, %.1f，面积是：%.1f，周长是：%.1f",
                a, b, c, getArea(), getPiremeter());
    }

    //hashcode不懂该怎么写

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Triangle triangleToCompare = (Triangle) obj;
        return Double.compare(a, triangleToCompare.a) == 0 &&
                Double.compare(b, triangleToCompare.b) == 0 &&
                Double.compare(c, triangleToCompare.c) == 0;
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(3,4,5);
        System.out.println(t1.equals(t2));
        System.out.println(t1);
        System.out.println(t2);
    }

}
