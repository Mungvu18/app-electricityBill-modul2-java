public class Customer {
    private String name;
    private String apartmentId;
    private String meterCode;

    public Customer(String name, String apartmentId, String meterCode) {
        this.name = name;
        this.apartmentId = apartmentId;
        this.meterCode = meterCode;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", apartmentId='" + apartmentId + '\'' +
                ", meterCode='" + meterCode + '\'' + " ";
    }
}
