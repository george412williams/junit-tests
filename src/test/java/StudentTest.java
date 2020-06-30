import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {



    @Before
    public void setUp(){

    }

    @Test
    public void testIfIdIsInitialized(){

        assertNotNull(Student.id);
    }

    @Test
    public void testIfNameIsInitialized(){
        assertNotNull(Student.name);
    }

    @Test
    public void testIfGradeAdded(){

    }


}
