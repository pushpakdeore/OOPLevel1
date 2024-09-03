package pushpak15L1ClassObjectConstructor;

public class Furniture {
    private String type;
    private String material;
    private double price;
    public Furniture(String type,String material,double price){
        this.type =type;
        this.material=material;
        this.price=price;
    }
    public double calculateDiscount() {
        double discountRate = 0.0;

        // Discount logic based on material
        if (material.equalsIgnoreCase("Wood")) {
            discountRate = 0.20;
        } else if (material.equalsIgnoreCase("Metal")) {
            discountRate = 0.15;
        } else if (material.equalsIgnoreCase("Plastic")) {
            discountRate = 0.10;
        }

        return price - (price * discountRate);
    }
    public void printDetail(){
        System.out.println("type :"+type);
        System.out.println("matrial :"+material);
        System.out.println("price :"+price);
        System.out.println("Discounrt Price : "+calculateDiscount());
    }


    public static void main(String[] args) {
        Furniture f1 =new Furniture("plane","wood",345);
        f1.printDetail();
    }
}
