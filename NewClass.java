/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import javax.swing.JOptionPane;

public class NewClass {

    public static void main(String args[]) {
        Double num1 = Double.parseDouble(JOptionPane.showInputDialog("forneça a largura"));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog("forneça a profundidade"));

        double result = num1 * num2;
                JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}
 