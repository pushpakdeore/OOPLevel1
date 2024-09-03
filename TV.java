package pushpak15L1ClassObjectConstructor;

public class TV {
    private String brand;
    private  float size;
    private double price;
    public TV(String brand,float size,double price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }
    public double discount(){
        double dicountPrice=0.0;
        if(size>=40){
            dicountPrice=price-price*0.2;
        } else if (size>=30) {
            dicountPrice=price-price*0.15;
        } else if (size>=20) {
            dicountPrice=price-price*0.1;
        }return dicountPrice;


    }
    public void printDetails(){
        double acutal = discount();
        System.out.println("Brand :"+brand);
        System.out.println("Size :"+size);
        System.out.println("Actual Price:"+price);
        System.out.println("dicount price :"+acutal);
    }

    public static void main(String[] args) {
        TV TV1 =new TV("Apple",45,3455);
        TV1.printDetails();
    }
}
