package collections.map.linkedhashmap;

import java.util.LinkedHashMap;

public class Employee {
    private LinkedHashMap <Integer, String> employeedata;

    public Employee()
    {
        employeedata= new LinkedHashMap<>();
        employeedata.put(101,"Rahul");
        employeedata.put(102,"Prasanna");
        employeedata.put(103,"Nag");
        employeedata.put(104,"Charan");
        employeedata.put(106,null);
        employeedata.put(105,null);
        employeedata.put(108,"Varma");
        employeedata.put(109,"Kumar");
        employeedata.put(null,"Sai");


    }

    public LinkedHashMap<Integer, String> getEmployeedata() {
        return employeedata;
    }

    public void setEmployeedata(LinkedHashMap<Integer, String> employeedata)
    {
        this.employeedata = employeedata;
    }
}
