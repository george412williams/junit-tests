import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort cohortWithNone;
    private Cohort cohortWithStudents;
    private Cohort cohortWithSingleton;

    @Before
    public void setUp() {
        cohortWithNone = new Cohort();
        cohortWithSingleton = new Cohort();
        cohortWithStudents = new Cohort();
    }

    @Test
    public void testAddStudent() {
        //cohortWithNone.addStudent();
        //assertEquals(1, cohortWithNone.size());


        //cohortWithSingleton.addStudent();
    }

    @Test
    public void getStudents() {
    }

    @Test
    public void getCohortAverage() {
    }

    //BONUS
    @Test
    public void testFindStudentById(){

    }
}