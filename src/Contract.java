public class Contract {
    private int id;
    private Apartment apartment;
    private Tenant tenant;
    private int durationMonths;

    public Contract(int id, Apartment apartment, Tenant tenant, int durationMonths) {
        this.id = id;
        this.apartment = apartment;
        this.tenant = tenant;
        this.durationMonths = durationMonths;
    }

    public int getDurationMonths() { return durationMonths; }
    public Apartment getApartment() { return apartment; }
    public Tenant getTenant() { return tenant; }
    public int getId() { return id; }
}
