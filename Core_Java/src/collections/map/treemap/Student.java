package collections.map.treemap;

import java.util.TreeMap;

public class Student {
    private TreeMap<String, Integer> studentdata;

    public Student()
    {
        studentdata=new TreeMap<>();
        studentdata.put("Ravi",111);
        studentdata.put("Abdul",112);
        studentdata.put("Balu",113);
        studentdata.put("David",114);
        studentdata.put("Charles",116);
        studentdata.put("Elil",115);

    }
    public TreeMap<String, Integer> getStudentdata() {
        return studentdata;
    }

    public void setStudentdata(TreeMap<String, Integer> studentdata) {
        this.studentdata = studentdata;
    }
}
