package Final.pharmacy;

import java.util.Arrays;
import java.util.List;

class Medication {
    private final String name;
    public Medication(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Painkiller extends Medication {
    public Painkiller(String name){
        super(name);
    }
    @Override
    public String toString() {
        return this.getName();
    }
}

class Antibiotic extends Medication {
    public Antibiotic(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
public class Inventory {    
    static List<Medication> meds = Arrays.asList(new Medication("Saline"), new Medication("Vitamin C"));
    public static void printMedicationNames(List<? extends Medication> medication){
        for (var m : medication) {
            System.out.print(m + ", ");
        }
        System.out.println();
    }
    public static void addPainkiller(List<? super Medication> p){
        // do_add(meds);
    }
    // private static <T> void do_add(List<T> list){
    //     for (T l : list) {
    //         meds.add(l);
    //     }
    // }
    public static void main(String[] args) {
        List<Painkiller> painkillers = Arrays.asList(new Painkiller("Ipuprofen"), new Painkiller("Aspirin"));
        List<Antibiotic> antibiotics = Arrays.asList(new Antibiotic("Amoxicillin"));

        printMedicationNames(meds);
        printMedicationNames(painkillers);
        printMedicationNames(antibiotics);
    }
}

