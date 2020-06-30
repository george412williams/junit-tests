import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private long id;
    private int grade;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, int id, int[] grades){

    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        for (int grade : grades) {
            int sum = 0;
            sum += grade;
        }
        return getGradeAverage();
    }



}
