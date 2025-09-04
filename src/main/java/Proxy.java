/**
 * Proxy sınıfı uygulamanın başlangıç noktasıdır.
 * Burada önce doğrudan 'Vehicle' sınıfı kullanılır, sonra 'VehicleProxy' üzerinden kullanım gösterilir.
 */
public class Proxy {
    public static void main(String[] args) {
        Person ali = new Person();
        ali.setName("Ali");
        ali.setSurname("Tas");
        ali.setHasDriveLicense(true);
        Person veli = new Person();
        veli.setName("Veli");
        veli.setSurname("Tas");
        veli.setHasDriveLicense(false);

        Vehicle vehicle = new Vehicle();
        // Proxy olmadan: Vehicle sınıfı ehliyetsiz kişiye bile aracı kullandırır.
        vehicle.drive(ali);
        vehicle.drive(veli);

        System.out.println("----------- Proxy kulanimindan sonra -----------");

        VehicleProxy vehicleProxy = new VehicleProxy();
        // Proxy ile: VehicleProxy sınıfı önce kontrol yapar, yalnızca ehliyetli kişiye izin verir.
        vehicleProxy.drive(ali);
        vehicleProxy.drive(veli);

    }
}
