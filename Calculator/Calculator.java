package Calculator;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator extends JFrame {
    JPanel[] row = new JPanel[5];
    JButton[] buttons = new JButton[19];
    String[] buttonString = {
        "7","8","9","+",
        "4","5","6","-",
        "1","2","3","*",
        "/",".","C","%",
        "+/-","=","0"
    };
    int dimW[] = {430,70,150,140};
    int dimH[] = {50,60};
    //dimension
     Dimension dispDimension = new Dimension(dimW[0],dimH[0]);
    Dimension regularDimension = new Dimension( dimW[1],dimH[1]);
    Dimension rColumDimension = new Dimension( dimW[2],dimH[1]);
    Dimension zeroButtDimension = new Dimension( dimW[3],dimH[1]);
   
//text
JTextArea display = new JTextArea(2,25);
Font font = new Font("Verdana",Font.BOLD,20);

/*constructo */
Calculator(){
    super("Calculator");
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    GridLayout grid = new GridLayout(5,5);
    setLayout(grid);
}

}


