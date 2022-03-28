import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

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
}