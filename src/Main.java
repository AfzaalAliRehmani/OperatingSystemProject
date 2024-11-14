import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OS Kernel Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 700);


        JPanel panel = new JPanel();
        panel.setLayout(null);


        JButton ProcessManagementButton = new JButton("Process management");
        ProcessManagementButton.setBounds(20, 20, 300, 50);
        ProcessManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                ProcessManagement pm = new ProcessManagement();
                pm.createAndShowGUI();
            }
        });

        JButton MemoryManagementButton = new JButton("Memory management");
        MemoryManagementButton.setBounds(20, 90, 300, 50);
        JButton IOManagementButton = new JButton("I/O management");
        IOManagementButton.setBounds(20, 160, 300, 50);
        JButton OtherOperationButton = new JButton("Other Operations");
        OtherOperationButton.setBounds(20, 220, 300, 50);


        panel.add(ProcessManagementButton);
        panel.add(MemoryManagementButton);
        panel.add(IOManagementButton);
        panel.add(OtherOperationButton);


        frame.add(panel);

        frame.setVisible(true);
    }
}
