/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoreditproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Main
 */
public class CalculatorEditProject extends JFrame {

    private JButton add, subtract, multiply, divide, equals, clear, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JLabel numLabel1, numLabel2, resultLabel, title, pictureLabel;
    private JInternalFrame bg;
    private JTextField numField1, numField2, resultField;
    private static final long serialVersionUID = 1L;
    private boolean clicked = false;
    
    private int var1, var2;
    private String eqString = "";
     

    public CalculatorEditProject() {
            createUserInterface();
        }
    
    public void createUserInterface(){
    
    Container contentPane = getContentPane();
    contentPane.setBackground(Color.BLACK);
    contentPane.setLayout(null);
    
    ImageIcon tester2 = new ImageIcon("src/images/tree.png");
    pictureLabel = new JLabel();
    pictureLabel.setLocation(330, 0);
    pictureLabel.setIcon(tester2);
    pictureLabel.setSize(256,256);
    contentPane.add(pictureLabel);
    
    
    
    title = new JLabel();
    title.setText("Calculator");
    title.setSize(200, 75);
    title.setForeground(Color.white);
    title.setFont(new Font("Impact", Font.ITALIC, 36));
    title.setLocation(20, 20);
    title.setHorizontalAlignment(JLabel.CENTER);
    contentPane.add(title);
    
    resultLabel = new JLabel();
    resultLabel.setText("Result: ");
    resultLabel.setSize(100, 75);
    resultLabel.setFont(new Font("Arial", Font.PLAIN, 24));
    resultLabel.setForeground(Color.white);
    resultLabel.setLocation(0, 110);
    contentPane.add(resultLabel);
    
    resultField = new JTextField();
    resultField.setSize(250, 50);
    resultField.setLocation(80, 120);
    resultField.setFont(new Font("Arial", Font.PLAIN, 20));
    contentPane.add(resultField);
    
    add = new JButton();
    add.setSize(100,100);
    add.setText("+");
    add.setFont(new Font("Arial", Font.PLAIN, 36));
    add.setLocation(35, 320);
    add.addActionListener(new AdditionActionListener());
    contentPane.add(add);
    
    subtract = new JButton();
    subtract.setSize(100,100);
    subtract.setText("-");
    subtract.setFont(new Font("Arial", Font.PLAIN, 36));
    subtract.setLocation(135, 320);
    subtract.addActionListener(new SubtractionActionListener());
    contentPane.add(subtract);
    
    multiply = new JButton();
    multiply.setSize(100,100);
    multiply.setText("*");
    multiply.setFont(new Font("Arial", Font.PLAIN, 36));
    multiply.setLocation(235, 320);
    multiply.addActionListener(new MultiplicationActionListener());
    contentPane.add(multiply);
    
    divide = new JButton();
    divide.setSize(100,100);
    divide.setText("/");
    divide.setFont(new Font("Arial", Font.PLAIN, 36));
    divide.addActionListener(new DivisionActionListener());
    divide.setLocation(35, 420);
    contentPane.add(divide);
    
    equals = new JButton();
    equals.setSize(100,100);
    equals.setText("=");
    equals.setFont(new Font("Arial", Font.PLAIN, 36));
    equals.setLocation(135, 420);
    equals.addActionListener(new EqualsActionListener());
    contentPane.add(equals);
    
    clear = new JButton();
    clear.setSize(100,100);
    clear.setText("C");
    clear.setFont(new Font("Arial", Font.PLAIN, 36));
    clear.addActionListener(new ClearActionListener());
    clear.setLocation(235, 420);
    contentPane.add(clear);
    
    b1 = new JButton();
    b1.setSize(50,50);
    b1.setText("1");
    b1.setFont(new Font("Arial", Font.PLAIN, 12));
    b1.setLocation(350, 320);
    b1.addActionListener(new OneActionListener());
    contentPane.add(b1);
    
    b2 = new JButton();
    b2.setSize(50,50);
    b2.setText("2");
    b2.setFont(new Font("Arial", Font.PLAIN, 12));
    b2.setLocation(400, 320);
    b2.addActionListener(new TwoActionListener());
    contentPane.add(b2);
    
    b3 = new JButton();
    b3.setSize(50,50);
    b3.setText("3");
    b3.setFont(new Font("Arial", Font.PLAIN, 12));
    b3.setLocation(450, 320);
    b3.addActionListener(new ThreeActionListener());
    contentPane.add(b3);
    
    b4 = new JButton();
    b4.setSize(50,50);
    b4.setText("4");
    b4.setFont(new Font("Arial", Font.PLAIN, 12));
    b4.setLocation(350, 370);
    b4.addActionListener(new FourActionListener());
    contentPane.add(b4);
    
    b5 = new JButton();
    b5.setSize(50,50);
    b5.setText("5");
    b5.setFont(new Font("Arial", Font.PLAIN, 12));
    b5.setLocation(400, 370);
    b5.addActionListener(new FiveActionListener());
    contentPane.add(b5);
    
    b6 = new JButton();
    b6.setSize(50,50);
    b6.setText("6");
    b6.setFont(new Font("Arial", Font.PLAIN, 12));
    b6.setLocation(450, 370);
    b6.addActionListener(new SixActionListener());
    contentPane.add(b6);
    
    b7 = new JButton();
    b7.setSize(50,50);
    b7.setText("7");
    b7.setFont(new Font("Arial", Font.PLAIN, 12));
    b7.setLocation(350, 420);
    b7.addActionListener(new SevenActionListener());
    contentPane.add(b7);
    
    b8 = new JButton();
    b8.setSize(50,50);
    b8.setText("8");
    b8.setFont(new Font("Arial", Font.PLAIN, 12));
    b8.setLocation(400, 420);
    b8.addActionListener(new EightActionListener());
    contentPane.add(b8);
    
    b9 = new JButton();
    b9.setSize(50,50);
    b9.setText("9");
    b9.setFont(new Font("Arial", Font.PLAIN, 12));
    b9.setLocation(450, 420);
    b9.addActionListener(new NineActionListener());
    contentPane.add(b9);

    
    
    
    setTitle("Welcome");
    setSize(608, 750);
    setVisible(true);
    
    }

     class OneActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "1");
         eqString += "1";
         
        }
     }
     
     class TwoActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "2");
         eqString += "2";
         
        }
     }
          
     class ThreeActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "3");
         eqString += "3";
         
         }
     }
               
     class FourActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "4");
         eqString += "4";
         
         }
     }
                    
     class FiveActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "5");
         eqString += "5";
         
        }
     }
                         
     class SixActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "6");
         eqString += "6";
         
         }
     }
                              
     class SevenActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "7");
         eqString += "7";
         
     }
     }
     
     class EightActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "8");
         eqString += "8";
         
     }
     }
     
     class NineActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
         String curResult = resultField.getText();
         resultField.setText(curResult + "9");
         eqString += "9";
         
     }
     }
    
     class AdditionActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
       resultField.setText("");
       eqString+="+";
      }
     }
     
     class SubtractionActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
       resultField.setText("");
       eqString+="-";
      }
     }
     
     class MultiplicationActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
       resultField.setText("");
       eqString+="*";
      }
     }
     
     class DivisionActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
       resultField.setText("");
       eqString+="/";
      }
     }
     
     class ClearActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
         eqString = "";
         resultField.setText("");
                 
         }
      }
     
     class EqualsActionListener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        
        String eqResult = "";
         try {
            Object result = engine.eval(eqString);
            eqResult = result.toString();
            resultField.setText(eqResult);
            eqString = eqResult;
         } catch (ScriptException ex) {
             Logger.getLogger(CalculatorEditProject.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         }
      }
    
    
    
    public static void main(String[] args) {
        CalculatorEditProject application = new CalculatorEditProject();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
