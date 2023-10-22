package hoemworkweek7;

public class Wall {
    double height;
    double width;

    public Wall(){

    }

    public Wall(double width, double height){
        if (width<0) {
            this.width = 0;
        } else{
            this.width = width;
        }
        if (height<0) {
            this.height = 0;
        } else{
            this.height = height;
        }
    }

    public float getWidth(){
        return (float) width;
    }

    public float getHeight(){
        return (float) height;
    }

    public void setWidth(double width){
        if (width<0)
            this.width=0;
        else
            this.width = width;
    }

    public void setHeight(double height){
        if (height<0)
            this.height=0;
        else
            this.height = height;
    }

    public double getArea(){
        double area = width*height;
        return area;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
