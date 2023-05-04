import java.util.List;

public class Tasks {
    private String groupTasks;
    private Boolean isFinished;

    public Tasks(String groupTasks) {
        this.groupTasks = groupTasks;
        this.isFinished = false;
    }

    public String getGroupTasks() {
        return groupTasks;
    }

    public void setGroupTasks(String groupTasks) {
        this.groupTasks = groupTasks;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }
}
