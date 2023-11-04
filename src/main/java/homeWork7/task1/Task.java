package homeWork7.task1;

import java.util.Date;

public class Task {
    private String title;
    private Date deadline;
    private int priority;
    private double reward;

    public Task(String title, Date deadline, int priority, double reward) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.reward = reward;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double calculatePayment() {
        return this.reward;
    }
}
