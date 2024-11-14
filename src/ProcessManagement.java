import javax.swing.*;

public class ProcessManagement {
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Process Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 700);

        // comment 


        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton createProcessButton = new JButton("Create Process");
        createProcessButton.setBounds(20, 20, 300, 50);
        JButton destroyProcessButton = new JButton("Destroy Process");
        destroyProcessButton.setBounds(20, 90, 300, 50);
        JButton suspendProcessButton = new JButton("Suspend Process");
        suspendProcessButton.setBounds(20, 160, 300, 50);
        JButton resumeProcessButton = new JButton("Resume Process");
        resumeProcessButton.setBounds(20, 230, 300, 50);
        JButton blockProcessButton = new JButton("Block Process");
        blockProcessButton.setBounds(20, 300, 300, 50);
        JButton wakeupProcessButton = new JButton("Wakeup Process");
        wakeupProcessButton.setBounds(20, 370, 300, 50);
        JButton dispatchProcessButton = new JButton("Dispatch Process");
        dispatchProcessButton.setBounds(20, 440, 300, 50);
        JButton changePriorityButton = new JButton("Change Process Priority");
        changePriorityButton.setBounds(20, 510, 300, 50);
        JButton processCommunicationButton = new JButton("Process Communication");
        processCommunicationButton.setBounds(20, 580, 300, 50);


        panel.add(createProcessButton);
        panel.add(destroyProcessButton);
        panel.add(suspendProcessButton);
        panel.add(resumeProcessButton);
        panel.add(blockProcessButton);
        panel.add(wakeupProcessButton);
        panel.add(dispatchProcessButton);
        panel.add(changePriorityButton);
        panel.add(processCommunicationButton);


        frame.add(panel);

        frame.setVisible(true);
    }
}
