package homework12;

public class Car {
    private static int counter = 0;
    private int serialNumber;
    private String brand;

    private int price;

    private String typeOfCar;

    public Car (){
        counter += 1;
        serialNumber += counter;
    }

    public Car (String brand, int price, String typeOfCar){
        counter += 1;
        serialNumber += counter;
        this.brand = brand;
        this.price = price;
        this.typeOfCar = typeOfCar;
    }
    void getSerialNumber(){
        System.out.println("Serial number of car is: " + serialNumber);
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
