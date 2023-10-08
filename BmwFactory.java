package MyFactoryMethod;

public class BmwFactory implements CarFactory{
    public Car createCar(){
        return new Bmw();
    }

}
