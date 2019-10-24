public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        MovablePoint movablePoint = new MovablePoint(0.5f,1);

        movablePoint = movablePoint.move();
        System.out.println(movablePoint);
    }
}
