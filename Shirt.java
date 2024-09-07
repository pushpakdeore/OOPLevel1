package pushpak15L1ClassObjectConstructor;


public class Shirt {
    private  int size;
    private  String color;
    private double price;

    public Shirt(int size, String color,double price) {
        this.size =size;
        this.color=color;
        this.price=price;
    }
    public double discount(){
         double discount=0.0;
         if(size>=30){
             discount =price-price*0.1;
         } else if (size>=40) {
             discount =price-price*0.15;
         }

         if(color.toLowerCase()=="balck"){
             discount = price-price*0.1;
         }else {
             discount = price-price*0.15;
         }

         if(price>=1000){
             discount =price-price*0.1;
         }
         return discount;

    }
    public void printDetail(){
        System.out.println("Size :"+size);
        System.out.println("color :"+color);
        System.out.println("Actual price :"+price);
        System.out.println("Discount price :"+discount());

    }

    public static void main(String[] args) {
        Shirt s1 =new Shirt(45,"black",700);
        Shirt s2 =new Shirt(3,"Red",700);
        s1.printDetail();
        s2.printDetail();
    }
}
