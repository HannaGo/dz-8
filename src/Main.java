import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//Написати мінімальний клас студент, який має: ідентифікатор студента (тобто, унікальний), ім'я, прізвище.
////        Написати клас, який репрезентує групу студентів з наступними полями:
////        староста (тип студент)
////        список студентів (тип студент)
////        список завдань
////        Група не може існувати без старости.
////
//        Методи класу:
////        змінити старосту
////        додати/видалити/перейменувати студента,
////        додати завдання (для всієї групи)
////        позначити завдання як виконане (для зазначеного студента)
///
////        Староста та студенти є об'єктами класу студент.
////        Завдання є простими рядками (приклад: вивчити інкапсуляцію).
////        Зробити цей клас максимально інкапсульованим.
////        Забезпечити максимальну безпеку стану класу.
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        Student student = new Student(1, "Anna", "Gonchar", true);
        Student student2 = new Student(2, "Ola", "olaola", false);
        Student student3 = new Student(3, "Mike", "Kelly", false);
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);



        System.out.println(studentList);
        //Field[] fields = student.getClass().getDeclaredFields();

        List<Tasks> tasksListGroup = new LinkedList<>();
        Tasks task1 = new Tasks("Do task1.");
        Tasks task2 = new Tasks("Do task1.");
        Tasks task3 = new Tasks("Do task1.");

    }
}