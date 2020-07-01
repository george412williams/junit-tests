import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private long id;
    private int grade;
    private List<Integer> grades = new ArrayList<>();

    //CONSTRUCTORS
    public Student(String name, int id, int[] grades){

    }

    public Student(){

    }

    public Student(int[] grades){

    }

    //GTRS/STRS
    public long getId(){
        return id;
    }

    public void setId() {this.id = id;}

    public String getName(){
        return name;
    }

    public void setName() { this.name = name;}

    public void addGrade(int grade){
        grades.add(grade);
    }

//    public double getGradeAverage(){
//        for (int grade : grades) {
//            int sum = 0;
//            sum += grade;
//        }
//        return getGradeAverage();
//    }

    public List<Integer> getGrades(){
        return grades;
    }



}
