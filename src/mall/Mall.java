package mall;

public class Mall implements DTO {
    private int id;
    private String name;
    private String city;
    private String address;

    public Mall(int id, String name, String city, String address) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
    }

    // Implementación de los métodos de la interfaz MallOperations
    @Override
    public String getMallName() {
        return name;
    }

    @Override
    public String getMallLocation() {
        return city;
    }

    @Override
    public String getMallAddress() {
        return address;
    }

    @Override
    public void setMallName(String name) {
        this.name = name;
    }

    @Override
    public void setMallLocation(String city) {
        this.city = city;
    }

    @Override
    public void setMallAddress(String address) {
        this.address = address;
    }

    // Resto de métodos de la clase Mall
    // ...

    @Override
    public String toString() {
        return "Mall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}{
}
