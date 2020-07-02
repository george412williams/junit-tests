import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp(){
        Student student1  = new Student("Naymoe", 1);
        student1.addGrade(22);
        student1.getId();
    }

    @Test
    public void testHasThreeGrades(){
        Student student3 = new Student(new int[]{25, 48});
        assertEquals(student3.getGrades().size(), 2);
    }

    @Test
    public void testAssertEquals() {
        Student student1  = new Student("Naymoe", 1);
        assertEquals(student1.getName(), "Naymoe");
        Student studentJ = new Student("John", 1L);
        assertEquals("John", studentJ.getName());
        assertTrue(studentJ.getGrades().isEmpty());
        //set the values inn he constructors
        //nullpointer exception
    }

    @Test
    public void testIfStudentAdded(){
        Student student1  = new Student("Naymoe", 1);
        student1.addGrade(100);
        assertEquals(1, student1.getGrades().size());
    }

    @Test
    public void testIfGradeAvgWks(){
        Student student1  = new Student("Naymoe", 1);
        //double mgrad = mgrad.gradAverage(mike.getGrades());
        student1.addGrade(100);
        assertEquals(100, student1.getGradeAverage(), 0);
        //important here to have mult assertions
        student1.addGrade(0);
        assertEquals(50, student1.getGradeAverage(), 0);
    }

}
