interface shape{
    abstract double calculatearea(double side);
}
class rectangle implements shape{
    @Override
    public double calculatearea(double side){
        double width=10.0;
        return side*width;
    }
}
class circle implements shape{
    @Override
    public double calculatearea(double side){
        return side*(3.14)*side;
    }
}
class triangle implements shape{
    @Override
    public double calculatearea(double side){
        double height=10.0;
        return (0.5)*side*height;
    }
}
public class ShapeArea {
    public static void displayarea(shape t,double side){
        double area=t.calculatearea(side);
        System.out.println("Area of " + t.getClass().getSimpleName()+ "of"+ side + "is:" +area+ "units");
    }
    public static void main(String[]args){
        double side=15;
        shape rectangle=new rectangle();
        shape circle=new circle();
        shape triangle=new triangle();
        displayarea(rectangle,side);
        displayarea(circle,side);
        displayarea(triangle,side);
    }
}
