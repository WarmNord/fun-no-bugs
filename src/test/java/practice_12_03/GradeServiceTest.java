package practice_12_03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class GradeServiceTest {
    static GradeService<Double> dGrade;

    StudentGrade<Double> st = new StudentGrade<>("A", "Math", 5.0);
    StudentGrade<Double> st1 = new StudentGrade<>("B", "Math", 0.0);
    StudentGrade<Double> st2 = new StudentGrade<>("B", "Math", -10.0);

    @BeforeAll
    static void setUp() {
        dGrade = new GradeService<>();
    }

    @AfterEach
    void setDown() {
        dGrade.deleteSubject(st);
    }

    @Test
    void addGrade() {
        dGrade.addGrade(st);
        assertTrue(dGrade.containsGradeByStudentGrade(st));
    }

    @Test
    void addGradeWithException() {
        assertThrows(InvalidGradeException.class, () -> dGrade.addGrade(st1));
        assertThrows(InvalidGradeException.class, () -> dGrade.addGrade(st2));
    }

    @Test
    void checkAverageGradesBySubject() {
        StudentGrade<Double> st3 = new StudentGrade<>("B", "Math", 5.0);
        StudentGrade<Double> st4 = new StudentGrade<>("B", "Math", 5.0);
        dGrade.addGrade(st3);
        dGrade.addGrade(st4);
        assertEquals(5.0, dGrade.averageGradeBySubject("Math"));
    }
}
