package homeWork7.task1;

import java.util.Date;

public class PriorityTask extends Task{

    private int requiredPriority;


    public PriorityTask(String title, Date deadline, int priority, double reward, int requiredPriority) {
        super(title, deadline, priority, reward);
        this.requiredPriority = requiredPriority;
    }

    @Override
    public double calculatePayment() {
        if (getPriority() == this.requiredPriority) return super.calculatePayment() * 2;
        return 0;
    }
}
