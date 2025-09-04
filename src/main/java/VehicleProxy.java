/**
 * VehicleProxy sınıfı, IVehicle arayüzünü implement eder ancak doğrudan işlem yapmaz.
 * Önce gerekli kontrolleri yapar, ardından gerekirse gerçek sınıfa (Vehicle) yönlendirir.
 * Proxy Pattern’de buna Proxy (vekil) denir.
 */
public class VehicleProxy implements IVehicle {
    private final Vehicle vehicle = new Vehicle();
    @Override
    public void drive(Person person) {
        if(!person.isHasDriveLicense()){
            System.out.println("Bu kisi araba kullanamaz");
            return;
        }
        vehicle.drive(person);
    }
}
