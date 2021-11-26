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


public class atv2 {
    
    public static void main(String args[]) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("forneça a largura"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("forneça a profundidade"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("forneça a comprimento"));

        double result = num1 * num2 * num3;
        double preco = result * 45.00;
                JOptionPane.showMessageDialog(null,"valores ofrnecidos foram: " + num1 + ", " + num2 + ", " + num3 
                        +"\na piscina solicitada tem: " + result + " metros cubicos"
                        +"\no valor da construção será de: R$" + preco);
        System.exit(0);
}
}
