public class Point {
    private int x;
    private int y;

    public Point(){
         x = 0;
         y = 0;

    }
    public Point(int xVal, int yVal){
        this.x = xVal;
        this.y= yVal;


    }
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
    public void setPoint(int newX, int newY){
        this.x =  newX;
        this.y = newY;

    }

    public String toString(){
        return ("(" + x + ", " + y + ")");
    }
    public double distance(Point n) {
        return Math.sqrt((Math.pow((x - n.x), 2) + (Math.pow((y - n.y), 2) )));
    }

}
