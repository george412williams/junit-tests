import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort cohortWithNone;
    private Cohort cohortWithStudents;
    private Cohort cohortWithSingleton;
    Student student1  = new Student("Naymoe", 1);
    Student student2  = new Student("Bingo", 2);
    Student student3  = new Student("Eleven", 3);

    @Before
    public void setUp() {
        cohortWithNone = new Cohort();
        cohortWithSingleton = new Cohort();
        cohortWithStudents = new Cohort();
    }

    @Test
    public void testAddStudent() {
        cohortWithNone.addStudent(student1);
        assertEquals(1, cohortWithNone.getStudents().size());

        cohortWithSingleton.addStudent(student2);
    }

    @Test
    public void getStudents() {
        assertEquals("Naymoe", student1.getName());
        cohortWithStudents.addStudent(student2);
        cohortWithStudents.addStudent(student3);
        assertNotSame(student2, cohortWithStudents.toString());

    }

    @Test
    public void getCohortAverage() {
        student1.addGrade(90);
        student2.addGrade(100);
        cohortWithStudents.addStudent(student1);
        cohortWithStudents.addStudent(student2);
        assertEquals(95, cohortWithStudents.getCohortAverage(), 0);
    }

    //BONUS
    @Test
    public void testFindStudentById(){
        cohortWithStudents.addStudent(student1);
        cohortWithStudents.addStudent(student2);
        //assertEquals("Bingo", cohortWithStudents.findStudentById(2));

    }
}