package MyFactoryMethod;

public class MersedesFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Mersedes();
    }
}
