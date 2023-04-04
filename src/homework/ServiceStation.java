package homework;

public class ServiceStation {
    public void check(Car car) {

        car.checkTyres();

        car.checkEngine();
    }

    public void check(Truck truck) {

        truck.checkTyres();

        truck.checkEngine();

        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {

        bicycle.checkTyres();
    }
}
