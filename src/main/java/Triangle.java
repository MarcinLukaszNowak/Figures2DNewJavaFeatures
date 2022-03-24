public final class Triangle extends Polygon {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getArea() {
        return String.format("Area of triangle with points a = %s, b = %s, c = %s", a, b, c);
    }

}
