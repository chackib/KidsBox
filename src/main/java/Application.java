import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String[] args) {

        List<Kids> kids = new ArrayList<Kids>();
        kids.add(new Kids(8, 8, "pA"));
        kids.add(new Kids(2, 7, "pB"));
        kids.add(new Kids(-2, 1, "pC"));
        kids.add(new Kids(-5, 7, "pD"));

        List<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(8, -6, "BOX1"));
        boxes.add(new Box(6, 10, "BOX2"));
        boxes.add(new Box(4, 5, "BOX3"));

        for( Kids kid : kids) {
            double distanceMin = distance(kid, boxes.get(0));
            Box nearestBox = boxes.get(0);
            for (Box box : boxes) {
                System.out.println(distance(kid, box));
                if(distance(kid, box) < distanceMin) {
                    distanceMin = distance(kid, box);
                    nearestBox = box;
                }
            }

            System.out.println(kid.getName() + " " + nearestBox.getName());
        }



    }

    private static double distance(Point a, Point b) {
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) - (a.getY()-b.getY())*(a.getY()-b.getY()));
    }
}
