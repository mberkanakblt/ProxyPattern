package proxy;

/**
 * Vehicle sınıfı, IVehicle implement eden sınıftır.
 */
public class Vehicle implements IVehicle{
    @Override
    public void drive(Person person) {
        System.out.println(person.getName() + " " + person.getSurname() + " araci kullaniyor");
    }
}
