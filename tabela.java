package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Panel;

class Tab2 extends JFrame {
	
	private JPanel p;
	private JFrame f;
	private JTable jt;

	String[] coluna = { "time", "pontos", "gol" };
	String[][] linha = { { "Sao Paulo", "65", "40" },{ "homem", "65", "40" }, { "chelsea", "63", "38" } };

	public Tab2() {

		
	
		jt = new JTable(linha, coluna);
		jt.setBounds(100, 100, 200, 300);
		
		jt.setRowHeight(50);
		
		p = new JPanel(new GridBagLayout());
		
		p.add(jt);
		

		f = new JFrame("Creativity tuts");
		f.setVisible(true);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(p);
		
		
		
	
	
	

	}



	public static void main(String[] args) {
		Tab2 tab2 = new Tab2();
		
		
		
	}

}