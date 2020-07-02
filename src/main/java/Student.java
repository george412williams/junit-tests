import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private long id;
    private double grade;
    private List<Integer> grades = new ArrayList<>();

    //CONSTRUCTOR
    public Student(String name, long id){
        this.name = name;
        this.id = id;
        //need to set arraylist otherwise nullpointer exception
        this.grades = new ArrayList<>();
        //do not necessarily need the 3rd param...
    }

    //CONSTRUCTOR FOR SPECIFIC TEST
    public Student(int[] grades){}

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

    public double getGradeAverage(){
        //set it outside, just move it
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
        //needed size not length bc is a List not Array
    }

    public List<Integer> getGrades(){
        return grades;
    }



}
