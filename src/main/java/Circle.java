public record Circle(Point point, double r) implements Shape {

    public Circle {
        if (r < 0) {
            throw new IllegalArgumentException("r (radius) cannot be lower than 0");
        }
    }

    @Override
    public String getArea() {
        return String.format("Area of circle in point %s and radius = %f", point, r);
    }

}
