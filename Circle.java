package pushpak15L1ClassObjectConstructor;
/*3. Write a Java program to create a class called "Circle" with an instance variable "radius." Include a method to calculate the area of the circle and a method to calculate the circumference of the circle*/
public class Circle {
    private double radius;
     public Circle(double redius){
        this.radius =redius;
    }
    public void areaCircle(){
         double area =3.14*radius*radius;
        System.out.println("Area"+area);
    }
    public void circumferenceCircle(){
         double circumference =2*3.14*radius;
        System.out.println("circumference"+circumference);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        c1.areaCircle();
        c1.circumferenceCircle();
    }


}
