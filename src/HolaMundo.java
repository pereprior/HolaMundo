import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class HolaMundo {
    //with psvm
    public static void main(String[] args) {
        //Show
        System.out.println("Hola Mundo!");
        //JOptionPane.showMessageDialog(null,"Hell World");

        /*String name = JOptionPane.showInputDialog(null, "Type your name please");
        System.out.println(name);*/

        String name = JOptionPane.showInputDialog(null, "Type your name please", "Type", PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "Your name is " +name, "Info", INFORMATION_MESSAGE);
    }
}
