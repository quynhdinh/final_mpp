package Final.pharmacy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Medication {
    private final String name;

    public Medication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Painkiller extends Medication {
    public Painkiller(String name) {
        super(name);
    }

}

class Antibiotic extends Medication {
    public Antibiotic(String name) {
        super(name);
    }
}

public class Inventory {

    public static void printMedicationNames(List<? extends Medication> medication) {
        for (int i = 0; i < medication.size(); i++) {
            System.out.print(medication.get(i).getName());
            if (i != medication.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // have to use lowerbound
    public static void addPainkiller(List<? super Painkiller> p) {
        p.add(new Painkiller("Ibuprofen"));
        p.add(new Painkiller("Acetaminophen"));
        p.add(new Painkiller("Aspirin"));
    }

    public static void main(String[] args) {
        List<Medication> meds = Arrays.asList(new Medication("Saline"), new Medication("Vitamin C"));
        List<Painkiller> painkillers = new ArrayList<>(
                Arrays.asList(new Painkiller("Ibuprofen"), new Painkiller("Aspirin")));
        List<Antibiotic> antibiotics = Arrays.asList(new Antibiotic("Amoxicillin"));
        System.out.println("Some medications: ");
        printMedicationNames(meds);
        System.out.println("\nSome painkillers: ");
        printMedicationNames(painkillers);
        System.out.println("\nSome antibiotics: ");
        printMedicationNames(antibiotics);
        addPainkiller(painkillers);
        System.out.println("\nAfter stocking some painkillers: ");
        printMedicationNames(painkillers);
    }
}