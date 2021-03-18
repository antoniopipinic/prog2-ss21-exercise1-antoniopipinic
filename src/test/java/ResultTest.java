import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Repo link: https://github.com/antoniopipinic/prog2-ss21-exercise1-antoniopipinic

public class ResultTest {

    @BeforeAll
    static void init() {
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("1. Testfall: Ausgangssituation Angabe")
    void testGradingStudents_InitialSpecification() {
        List<Integer> list1 = Arrays.asList(4, 73, 67, 38, 33);
        List<Integer> expected = Arrays.asList(4, 75, 67, 40, 33);
        List<Integer> actual
                = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("2. Testfall: Rundungen bei 3 Studenten korrekt")
    void testGradingStudents_RoundingUnder40() {
        List<Integer> list1 = Arrays.asList(3, 38, 39, 40);
        List<Integer> expected = Arrays.asList(3, 40, 40, 40);
        List<Integer> actual
                = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("3. Testfall: Ein Student grade over 100")
    void testGradingStudents_OneStudentGradeOver100() {
        List<Integer> list1 = Arrays.asList(6, 75, 49, 98, 56, 76, 101);
        List<Integer> expected = Arrays.asList(6, 75, 50, 100, 56, 76, 0);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("4. Testfall: Zwei Studenten grades over 100")
    void testGradingStudents_TwoStudentsGradesOver100() {
        List<Integer> list1 = Arrays.asList(6, 75, 49, 98, 150, 76, 101);
        List<Integer> expected = Arrays.asList(6, 75, 50, 100, 0, 76, 0);
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }

    @Test
    @DisplayName("5. Testfall: Über 61 Studenten ")
    void testGradingStudents_StudentsOver61() {
        List<Integer> list1 = Arrays.asList(61, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Result.gradingStudents(list1);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("6. Testfall: Leere Liste")
    void testGradingStudents_EmptyList() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Result.gradingStudents(list1);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("7. Testfall: Eingabe von 0 Studenten")
    void testGradingStudents_ZeroStudents() {
        List<Integer> list1 = Arrays.asList(0,0);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Result.gradingStudents(list1);

        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual)
                && actual.containsAll(expected));
    }
}