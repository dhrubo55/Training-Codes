import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTesting extends JFrame {

    JTable table;
    JScrollPane sc;
    Object data [][] = {{13101219,"Dhrubo",100000},
    {14301021,"Sadia",100000},
    {14201111,"Adon",900000},
    {14401022,"Riyon",600000},
    {14301021,"Nafis",800000},
    
    {14301021,"Sadia",100000},
    {14201111,"Adon",900000},
    {14401022,"Riyon",600000},
    {14301021,"Nafis",800000
    },
    {14301021,"Sadia",100000},
    {14201111,"Adon",900000},
    {14401022,"Riyon",600000},
    {14301021,"Nafis",800000},
    {14301021,"Sadia",100000},
    {14201111,"Adon",900000},
    {14401022,"Riyon",600000},
    {14301021,"Nafis",800000},
    {14301021,"Sadia",100000},
    {14201111,"Adon",900000},
    {14401022,"Riyon",600000},
    {14301021,"Nafis",800000},
    
    
    {14301021,"Sadia",100000},
    {14201111,"Adon",900000},
    {14401022,"Riyon",600000},
    {14301021,"Nafis",800000},
    
    {14301021,"Sadia",100000},
    {14201111,"Adon",900000},
    {14401022,"Riyon",600000},
    {14301021,"Nafis",800000}
    
    };
    
    Object coulmn [] = {"Id","Name","Salary"};
	public JTableTesting()
	{
		//table = new JTable(10,20);
		table = new JTable(data, coulmn);
		
	    sc = new JScrollPane(table);
		//sc.add(table);
		table.setBackground(Color.BLACK);
		table.setForeground(Color.WHITE);
		
		Font f = new Font("Dialog",Font.BOLD+Font.ITALIC,16);
		table.setFont(f);
		
		add(sc,"North");
		
		setVisible(true);
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTesting();
	}
}
