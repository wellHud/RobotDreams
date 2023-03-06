package homework10;

public class Car {
    private String brand;

    private int price;

    private String typeOfCar;

    public Car (){
    }

    public Car (String brand, int price, String typeOfCar){
        this.brand = brand;
        this.price = price;
        this.typeOfCar = typeOfCar;
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    void setPrice(int price){
        this.price = price;
    }

    void setTypeOfCar(String typeOfCar){
        this.typeOfCar = typeOfCar;
    }

    String getBrand(){
        return brand;
    }

    int getPrice(){
        return price;
    }

    void getTypeOfCar(){
        System.out.println("The type of car is: " + typeOfCar);
    }

    void startTheCar(){
        System.out.println("The car is started!");
    }

}
