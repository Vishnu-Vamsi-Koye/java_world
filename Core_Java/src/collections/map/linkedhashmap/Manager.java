package collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Manager {
    public static void main(String[] args) {
        Employee emp= new Employee();
        LinkedHashMap<Integer, String> employeeData = emp.getEmployeedata();
        for (Map.Entry<Integer, String> entry : employeeData.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Employee Name: " + entry.getValue());
        }

        //Methods

        System.out.println("Employee Data of key 1: " + employeeData.get(1));
        System.out.println("Employee Data contains given key  or not: " + employeeData.containsKey(3));
        System.out.println("Employee Data, contains given value or not: " + employeeData.containsValue("raju"));
        System.out.println("Employee Data with keys in map: " + employeeData.keySet());
        System.out.println("Employee Data values all values in map: " + employeeData.values());
        System.out.println("Employee Data with keys and values: " + employeeData.entrySet());

        employeeData.remove(null);
        System.out.println("Employee Data with keys and values after removing: " + employeeData.entrySet());


    }

}
