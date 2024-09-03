package pushpak15L1ClassObjectConstructor;

public class Dog {
    String breed ;
    int age;
    float weight;
    public Dog(String breed,int age,float weight){
        this.breed =breed;
        this.age=age;
        this.weight=weight;
    }
    public int calculateHumanYear(){
        return age*7;
    }
    public  void  printDetail(){
        System.out.println("Breed: "+breed);
        System.out.println("Age in Dog Year: "+age);
        System.out.println("Weight : " +weight );
        System.out.println("Age in human Years: "+calculateHumanYear());
    }

    public static void main(String[] args) {
        Dog tommy =new Dog("Rot",3,24);
        tommy.printDetail();
    }

}

