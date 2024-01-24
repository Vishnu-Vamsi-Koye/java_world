package collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Teacher {
    public static void main(String[] args) {
        Student std=new Student();
        TreeMap<String,Integer> stuData= std.getStudentdata();
        for (Map.Entry<String,Integer> details:stuData.entrySet())
        {
            System.out.println("Student Name: "+details.getKey()+ " Student roll number : "+details.getValue());
        }
    }

}
