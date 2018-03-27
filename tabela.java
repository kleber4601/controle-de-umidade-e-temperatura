package view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;

class Tab2 extends JFrame {

	JTable jt;

	String[] coluna = { "time", "pontos", "gol" };
	String[][] linha = { { "homem", "65", "40" }, { "chelsea", "63", "38" } };

	public Tab2() {

	

		jt = new JTable(linha, coluna);
		jt.setBounds(50, 50, 200, 230);
		JScrollPane js = new JScrollPane(jt);
		this.add(js);
		this.setSize(300, 400);
		this.setVisible(true);
	

	}



	public static void main(String[] args) {
		Tab2 tab2 = new Tab2();
		
		
	}

}