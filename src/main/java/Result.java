import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<Integer>();
        for(Integer grade: grades){
            if(grade >= 38 && grade % 5 >= 3){
                grade = grade + 5 - grade % 5;
            }
            result.add(grade);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int eingabe;
        eingabe = input.nextInt();
        List<Integer> grades = new ArrayList<Integer>(eingabe);

        for (int i=0; i<eingabe; i++){
            int newEingabe;
            newEingabe = input.nextInt();
            grades.add(newEingabe);
        }

        List<Integer> newGrades = new ArrayList<Integer>(eingabe);
        newGrades = gradingStudents(grades);

        for (int i=0; i<newGrades.size(); i++){
            System.out.println(newGrades.get(i));
        }
    }
}
