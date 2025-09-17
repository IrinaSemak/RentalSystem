import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Apartment> apartments = new ArrayList<>();
    private List<Tenant> tenants = new ArrayList<>();
    private List<Contract> contracts = new ArrayList<>();

    public void addApartment(Apartment apartment) { apartments.add(apartment); }
    public void addTenant(Tenant tenant) { tenants.add(tenant); }
    public void addContract(Contract contract) { contracts.add(contract); }

    public List<Apartment> findApartmentsByPrice(double maxPrice) {
        List<Apartment> result = new ArrayList<>();
        for (Apartment apartment : apartments) {
            if (apartment.getPrice() <= maxPrice) result.add(apartment);
        }
        return result;
    }

    public List<Tenant> filterTenantsByContractDuration(int minDuration) {
        List<Tenant> result = new ArrayList<>();
        for (Contract contract : contracts) {
            if (contract.getDurationMonths() >= minDuration) result.add(contract.getTenant());
        }
        return result;
    }
}
