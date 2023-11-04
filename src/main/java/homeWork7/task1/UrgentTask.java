package homeWork7.task1;

import java.util.Date;

public class UrgentTask extends Task{


    public UrgentTask(String title, double reward) {
        super(title, new Date() , 1, reward);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() * 2;
    }
}
