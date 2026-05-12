public class Toy{

public String name = "Ken";
public String brand = "barbie";
double price;
int quantity;


void setPrice(double price){
    this.price = price;
}

public static void main(String[] args) {
    System.out.println("hello java trainees");
    Toy toy1 = new Toy();
        Toy toy2 = new Toy();

        System.out.println(toy1.name);
}




}