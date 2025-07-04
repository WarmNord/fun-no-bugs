package practice01.practice_12_03;

import java.util.ArrayList;
import java.util.List;

/*Сервис GradeService<T>:
Список List<StudentGrade<T>> для хранения оценок.
Метод для добавления оценки (addGrade), который также валидирует оценку на предмет того, что она не отрицательна.
Метод для расчёта среднего значения оценок по конкретному предмету.
Обработка исключений через InvalidGradeException, если оценка некорректна.
Многопоточность:
Обеспечение потокобезопасности при добавлении оценок с использованием synchronized.*/
public class GradeService<T extends Number> {

    private final List<StudentGrade<T>> studentGrades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> studentGrade) {
        if (studentGrade.getGrage().doubleValue() <= 0) {
            throw new InvalidGradeException("Оценка отрицательная");
        }
        studentGrades.add(studentGrade);
    }

    public double averageGradeBySubject(String subject) {
        List<StudentGrade<T>> subjectGrade = studentGrades.stream()
                .filter(grade -> grade.getSubject().equals(subject))
                .toList();

        double sumGrades = subjectGrade.stream()
                .mapToDouble(grade -> grade.getGrage().doubleValue())
                .sum();

        return sumGrades / subjectGrade.size();
    }

    public synchronized boolean containsGradeByStudentGrade(StudentGrade<T> studentGrade) {
        return studentGrades.contains(studentGrade);
    }

    public synchronized void deleteSubject(StudentGrade<T> studentGrade) {
        studentGrades.remove(studentGrade);
    }

    public static void main(String[] args) {
        GradeService<Double> dGrade = new GradeService<>();

        StudentGrade<Double> st = new StudentGrade<>("A", "Math",5.0);
        StudentGrade<Double> st1 = new StudentGrade<>("B", "Math",5.0);
       // StudentGrade<Double> st2 = new StudentGrade<>("B", "Math",5.0);

        dGrade.addGrade(st);
        dGrade.addGrade(st1);
       // dGrade.addGrade(st2);
        System.out.println(dGrade.averageGradeBySubject("Math"));

       // StudentGrade<Double> st3 = new StudentGrade<>("B", "Math",0.0);
    //    dGrade.addGrade(st3);

    }
}
