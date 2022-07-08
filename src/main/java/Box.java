public class Box extends  Point{

    private String name;

    public Box(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
