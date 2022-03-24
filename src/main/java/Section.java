public final class Section extends Polygon {

    Point p1;
    Point p2;

    public Section(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String getArea() {
        return "Section has no area";
    }

}
