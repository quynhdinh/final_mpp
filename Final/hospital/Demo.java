package Final.hospital;

public class Demo {
    public static void main(String[] args) {
        BillingProcessor processer = new BillingProcessor() {
            @Override
            public boolean processBill(String patientId, double amount) {
                return true;
            }
        };
        processer.printDetailedBill("1", 100);
    }
}
