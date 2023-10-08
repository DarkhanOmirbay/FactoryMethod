package MyFactoryMethod;

public class Program {
    public static void main(String[] args) {
        CarFactory carFactory =createFactoryByMark("bmw");
        Car car=carFactory.createCar();
        car.Drive();

    }
   static CarFactory createFactoryByMark(String mark){
        if(mark.equalsIgnoreCase("bmw")){
            return new BmwFactory();
        }else if(mark.equalsIgnoreCase("mersedes")){
            return new MersedesFactory();
       }else{
            throw new RuntimeException(mark+" dont have");
        }
   }
}
