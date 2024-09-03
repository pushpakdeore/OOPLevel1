package pushpak15L1ClassObjectConstructor;

public class Computer {
    private String processor;
    private  int RAM;
    private int storage;
    public Computer(String processor,int RAM,int storage){
        this.processor =processor;
        this.RAM=RAM;
        this.storage=storage;
    }
    public int price(){
        int price =100;
        if(processor.toLowerCase()=="intel"){
            price =price+100;
        } else {
            price=price+200;
        }

        if(RAM>=8){
            price=price+100;
        } else if (RAM>=16) {
            price=price+200;
        }

        if(storage>=256){
            price=price+100;
        } else if (storage>=512) {
            price=price+200;

        }return price;


    }
    public void printDetail(){
        System.out.println("processor : "+processor);
        System.out.println("RAM : "+RAM);
        System.out.println("Size : "+storage);
        System.out.println("Price :"+price());
    }

    public static void main(String[] args) {
        Computer com =new Computer("intel",45,345);
        com.printDetail();
    }

}
