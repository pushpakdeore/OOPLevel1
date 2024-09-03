package pushpak15L1ClassObjectConstructor;

public class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 500.0;

        switch (make.toLowerCase()) {
            case "apple":
                basePrice += 300.0;
                break;
            case "samsung":
                basePrice += 200.0;
                break;
            case "google":
                basePrice += 150.0;
                break;
            default:
                basePrice += 100.0;
                break;
        }

        if (model.toLowerCase().contains("pro")) {
            basePrice += 200.0;
        } else if (model.toLowerCase().contains("plus")) {
            basePrice += 150.0;
        }

        if (storage > 256) {
            basePrice += 200.0;
        } else if (storage > 128) {
            basePrice += 100.0;
        }

        return basePrice;
    }
    public void printPhoneDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + calculatePrice());
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "iPhone 14 Pro", 256);
        Phone phone2= new Phone("samsung","plus",230);
        phone.printPhoneDetails();
        phone2.printPhoneDetails();
    }
}


