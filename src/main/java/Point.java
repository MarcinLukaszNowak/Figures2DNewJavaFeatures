public record Point(double x, double y) {

    public String distance (Point p) {
        return String.format("Calculate distance from point %s", p);
    }

}


