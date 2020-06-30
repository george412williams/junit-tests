import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private long id;
    private int grade;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, int id, int[] grades){

    }

    // returns the student's id
    public long getId(){
        return id;
    }
    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        for (int grade : grades) {
            int sum = 0;
            sum += grade;
        }
        return getGradeAverage();
    }



}
