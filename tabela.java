package view;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tab4 extends JFrame
{
	JPanel painel;
	private JTable jt;
	
	String[] coluna = { "time", "pontos", "gol" };
	String[][] linha = { { " ", "Temperatura", "Umidade" }, { "Setor 1", "40", "40" }, { "Setor 2", "63", "38" } };
	
	
	public Tab4()
	{
		super("Teste Painel");
		
		//seta o layout do frame como nulo, assim tem mais liberdade
		setLayout(null);
		setSize(200,200);
		configuraPainel();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		
	}
	private void configuraPainel()
	{
		
		// jtable
		JScrollPane sPane = new JScrollPane();
		sPane.setPreferredSize(new Dimension(400, 250));

		DefaultTableModel model = new DefaultTableModel(new String[][] { { "Setor 1", "2", "4", "5"}, { "Setor 2", "4" , "8","5"},{ "Setor 3", "8" , "9","10"}  },
				new String[] { " ", "TEMPERATUA", "UMIDADE","STATUS" });
		
		JTable table = new JTable(model);
		table.setRowHeight(50);
		sPane.getViewport().add(table);

		JPanel panel = new JPanel();
		panel.add(sPane);
				
		painel = new JPanel();
		//cor apenas para notar a diferença entre o frame e o painel
		painel.setBackground(Color.RED);
		//seta o tamanho do painel
		painel.setSize(600,400);
		//seta a localização - layout é null
		painel.setLocation(600,100);
		
		painel.add(sPane);
		add(painel);
		
	}
	public static void main(String[] args)
	{
		new Tab4();
	}
}