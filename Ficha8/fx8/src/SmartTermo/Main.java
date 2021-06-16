package SmartTermo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame termoFrame = new JFrame("SmartTermo");
        termoFrame.setContentPane(new SmartTermo().getPanelMain());
        termoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        termoFrame.pack();
        termoFrame.setVisible(true);
    }
}