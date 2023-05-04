import java.util.List;

public class Group {
    private Student starosta;
    private List<Student> students;
    private List<Tasks> tasks;


    public void setCurrentTask(Tasks currentTask) {
        this.currentTask = currentTask;
    }

    private Tasks currentTask;

    public Group(Student starosta, List<Student> students, List<Tasks> tasks, Tasks currentTask) {
        this.starosta = starosta;
        this.students = students;
        this.tasks = tasks;
        this.currentTask = currentTask;
    }



    public Student getLeader() {
        return starosta;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public Tasks getCurrentTask() {
        return currentTask;
    }


    public void setNewStarosta(Student newStarosta) {
//        this.newStarosta = false;
        starosta.setIsStarosta(false);
        newStarosta.setIsStarosta(true);
        starosta = newStarosta;

    }


}