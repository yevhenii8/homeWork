package homeWork7.task1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager<T extends Task>{

    private List<T> tasks = new ArrayList<>();

    public void addTask(T task) {
        tasks.add(task);
    }

    public void calculateTotalPayment() {
        double result = tasks.stream()
                .mapToDouble(Task::getReward)
                .sum();
    }
}

