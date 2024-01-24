package collections.map.hashmap;

import java.util.HashMap;

public class Doctor {
    public static void main(String[] args) {
        Patient patient = new Patient();
        HashMap<Integer, String> patientData = patient.getPatientData();

        //Methods

        System.out.println("Patient Data of key 1: " + patientData.get(1));
        System.out.println("Patient Data contains given key  or not: " + patientData.containsKey(3));
        System.out.println("Patient Data, contains given value or not: " + patientData.containsValue("raju"));
        System.out.println("Patient Data with keys in map: " + patientData.keySet());
        System.out.println("Patient Data values all values in map: " + patientData.values());
        System.out.println("Patient Data with keys and values: " + patientData.entrySet());

        patientData.remove(7);
        System.out.println("Patient Data with keys and values after removing: " + patientData.entrySet());




        }
}
