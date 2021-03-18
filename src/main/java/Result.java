import java.util.List;
import java.util.ArrayList;

public class Result {

    public static final int MAX_AMOUNT_STUDENTS = 60;
    public static final int MAX_GRADES = 100;
    public static final int MINIMUM_AMOUNT_STUDENTS = 1;
    public static final int NO_ROUND_MINIMUM = 38;
    public static final int DIVIDE_BY_FIVE = 5;
    public static final int DIVIDE_BY_THREE = 3;
    public static final int ZERO = 0;

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>(grades);

        if(grades.isEmpty()){
            return new ArrayList<>();
        }
        else if (grades.get(ZERO) < MINIMUM_AMOUNT_STUDENTS || grades.get(0) > MAX_AMOUNT_STUDENTS) {
            return new ArrayList<>();
        }

        for (int i = 1; i <= grades.get(ZERO); i++) {
            if (grades.get(i) > MAX_GRADES) {
                result.set(i, ZERO);

            } else if(grades.get(i) >= NO_ROUND_MINIMUM && grades.get(i) % DIVIDE_BY_FIVE >= DIVIDE_BY_THREE) {
                    result.set(i, grades.get(i) + DIVIDE_BY_FIVE - grades.get(i) % DIVIDE_BY_FIVE);
            }
            System.out.println(result.get(i));
        }
        return result;
    }
}
