package collections.map.hashmap;

import java.util.HashMap;

public class Patient {
    private HashMap<Integer, String> patientData;

    public Patient() {

        patientData = new HashMap<>();
        patientData.put(001, "hari");
        patientData.put(002, "Vardan");
        patientData.put(003, "kumar");
        patientData.put(004, "ravi");
        patientData.put(null, "king");
        patientData.put(006, null);
        patientData.put(007, null);
    }

    public HashMap<Integer, String> getPatientData() {
        return patientData;
    }




}
