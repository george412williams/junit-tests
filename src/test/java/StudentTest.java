import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {



    @Before
    public void setUp(){
        Student student1  = new Student("Naymoe", 1, new int[]{25, 48});
        student1.addGrade(22);
        //student1.getName();
        student1.getGradeAverage();
        student1.getId();
        //Student getName = new getName();

    }

    @Test
    public void testHasThreeGrades(){
        //assertEquals(Student.grades.length = 3);
        Student student3 = new Student();
    }

    @Test
    public void testAssertNotNull() {
        //assertNotNull();
    }

    @Test
    public void testIsEmpty(){
        //assertTrue(student1.name.isEmpty, false);
    }

    @Test
    public void testIfIdIsInitialized(){

        //assertNotNull(student1.id);
    }

    @Test
    public void testIfNameIsInitialized(){

        //assertNotNull(student1.id);
    }

    @Test
    public void testIfStudentAdded(){
        //Student getName = new getName();
        //assertArrayEquals();
        //assertNotNull(student1.name);
    }

    @Test
    public void testIfGradeAdded(){
        //assertNotNull(student1.grades.length = 3);
        //double mgrad = mgrad.gradAverage(mike.getGrades());
        //assertEquals(23.4, ...);
    }


}
