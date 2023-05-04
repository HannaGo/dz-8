//Написати мінімальний клас студент, який має: ідентифікатор студента (тобто, унікальний), ім'я, прізвище.
////        Написати клас, який репрезентує групу студентів з наступними полями:
////        староста (тип студент)
////        список студентів (тип студент)
////        список завдань
////        Група не може існувати без старости.
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Boolean isStarosta;

    private static int idCounter = 0;

    public Student(int i, String firstName, String lastName, boolean isStarosta) {

        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isStarosta = isStarosta;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getIsStarosta() {
        return isStarosta;
    }

    public void setIsStarosta(Boolean isStarosta) {
        this.isStarosta = isStarosta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isStarosta=" + isStarosta +
                '}';
    }
}
