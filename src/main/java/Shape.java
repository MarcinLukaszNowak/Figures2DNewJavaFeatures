sealed public interface Shape permits Circle, Polygon {

    String getArea();

    default String getDiameter() {
        String shapeName = switch (this) {
            case Circle c -> c.getClass().getName();
            case Section s -> s.getClass().getName();
            case Triangle t -> t.getClass().getName();
        };
        return String.format("The diameter of the circle described on %s", shapeName);
    }

}
