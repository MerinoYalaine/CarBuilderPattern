public class CarTest{
    
    public static void main(String[] args){

        Car myCar = new Car.CarBuilder()
        .engineType("Diesel")
        .color("menk")
        .transmission("Automatic")
        .passengerCapacity(100)
        .brand("Honda")
        .build();

        System.out.println(myCar.brand);
        System.out.println(myCar.engineType);
        System.out.println(myCar.transmission);
        System.out.println(myCar.color);
        System.out.println(myCar.passengerCapacity);
        
    }
    
}