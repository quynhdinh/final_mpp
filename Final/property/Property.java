package Final.property;

public class Property {
    private String address, id;
    private int base, monthlyFee, numberOfBedroom;

    public Property(String a, String i, int b, int m, int n) {
        address = a;
        id = i;
        base = b;
        monthlyFee = m;
        numberOfBedroom = n;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public int getBase() {
        return base;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public int getNumberOfBedroom() {
        return numberOfBedroom;
    }
    @Override
    public String toString() {
        return String.valueOf(numberOfBedroom);
    }
}
