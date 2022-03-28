import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student top;
    private Student bottom;
    private Student meh;

    @BeforeEach
    public void setup(){
        top = new Student("I'm the Top", 'A', 3);
        bottom = new Student("Can't get Worse", 'F', 4);
        meh = new Student("Middle Step", 'C', 2);
    }

    @Test
    public void checkValidStudent(){
        assertDoesNotThrow(() -> new Student("Mark", 'A', 1));
    }

    @Test
    public void checkInvalidStudent(){
        assertThrows(IllegalArgumentException.class,
                () -> new Student("Bad Grade", 'Z', 1));
        assertThrows(IllegalArgumentException.class,
                () -> new Student("Bad Group Low", 'C', 0));
        assertThrows(IllegalArgumentException.class,
                () -> new Student("Bad Group High", 'C', 6));
    }

    @Test
    void checkGetName() {
        assertEquals("Middle Step", meh.getName());
    }

    @Test
    void checkGetGrade() {
        assertEquals('A', top.getGrade());
    }

    @Test
    void checkGetGroup() {
        assertEquals(4, bottom.getGroup());
    }
}