package Final.hospital;

public interface BillingProcessor {
    boolean processBill(String patientId, double amount);

    default void printDetailedBill(String patientId, double amount) {
        // System.out.printf("%s %s", patientId, amount);
        System.out.println(formatDetailedBill(patientId, amount));
    }

    private String formatDetailedBill(String patientId, double amount) {
        return String.format("Hospital Bill for Patient %s: %s processed", patientId, amount);
    }

    static boolean validateInsuranceId(String insuranceId) {
        int count = 0;
        for (Character c : insuranceId.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c))
                count++;
        }
        return count == 10;
    }

    static boolean validatePatientId(String patientId){
        return patientId.startsWith("HSP") && patientId.length() == 8;
    }
}
