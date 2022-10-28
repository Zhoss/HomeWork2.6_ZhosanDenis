import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car subaru = new Car("Subaru", "Impreza", 2.0, Car.BodyType.SEDAN);
        Car mitsubishi = new Car("Mitsubishi", "Lancer", 2.5, null);
        Car citroen = new Car("Citroen", "C4", 2.2, Car.BodyType.HATCHBACK);
        Car ford = new Car("Ford", "Escort", 1.8, Car.BodyType.MINIVAN);
        System.out.println(mitsubishi);
        Car.BodyType.identifyBodyType(mitsubishi);
        Car.BodyType.identifyBodyType(ford);
        subaru.pitStop();
        System.out.println("");

        Truck kamaz = new Truck("КАМАЗ", "4350-9", 12.0, Truck.CarryingCapacity.N2);
        Truck tatra = new Truck("Tatra", "T-138", 11.5, Truck.CarryingCapacity.N1);
        Truck iveco = new Truck("IVECO", "Iveco", 12.9, Truck.CarryingCapacity.N3);
        Truck ginaf = new Truck("Ginaf", "Rally Power", 11.7, null);
        System.out.println(kamaz);
        Truck.CarryingCapacity.identifyCarryingCapacity(iveco);
        Truck.CarryingCapacity.identifyCarryingCapacity(ginaf);
        tatra.bestLapTime();
        System.out.println("");

        Bus man = new Bus("Man", "Lion’s City C", 9.0, Bus.SeatQuantity.SMALL);
        Bus volvo = new Bus("Volvo", "7900", 7.4, Bus.SeatQuantity.LARGE);
        Bus liaz = new Bus("ЛиАЗ", "5256.58", 6.7, Bus.SeatQuantity.EXTRA_LARGE);
        Bus hyundai = new Bus("Hyundai", "Aero Town", 7.5, null);
        System.out.println(liaz);
        Bus.SeatQuantity.identifySeatQuantity(man);
        Bus.SeatQuantity.identifySeatQuantity(hyundai);
        hyundai.maxSpeed();

//        DriverB<Car> denis = new DriverB<>("Жосан Денис Сергеевич", true, 8);
//        DriverC<Truck> dmitriy = new DriverC<>("Василенко Дмитрий Петрович", true, 6);
//        DriverD<Bus> nicolai = new DriverD<>("Ткаченко Николай Александрович", true, 12);
//
//        denis.drive(subaru);
//        dmitriy.drive(ginaf);
//        nicolai.drive(man);
    }
}