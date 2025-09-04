package proxy;
/**
 *  Aşağıdaki Person sınıfı bir kişinin temel bilgilerini tutmaktadır.
 * */
public class Person {
    private String name;
    private String surname;
    private boolean hasDriveLicense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isHasDriveLicense() {
        return hasDriveLicense;
    }

    public void setHasDriveLicense(boolean hasDriveLicense) {
        this.hasDriveLicense = hasDriveLicense;
    }


}
