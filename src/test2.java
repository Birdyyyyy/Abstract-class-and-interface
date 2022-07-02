public class test2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();
        if (car.ticket <= 500){
            System.out.println("Car can get to Beijing.");
        }
        if (bus.ticket <= 500){
            System.out.println("Bus can get to Beijing.");
        }
        if (train.ticket <= 500){
            System.out.println("Train can get to Beijing.");
        }
        if (plane.ticket <= 500){
            System.out.println("Plane can get to Beijing.");
        }
    }
}
