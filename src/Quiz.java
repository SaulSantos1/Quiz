import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
	
	String[] perguntas = 	{
								"Quais desses não está entre os pilares de POO?",
							};
	String[][] respostas = 	{
								{"Herança","Interface","Abstração","Polimorfismo"},
							};
	char[] itens = 		{
								'A',
								'B',
								'C',
								'C'
							};
	char palpite;
	char item;
	int indice;
	int palpite_correto =0;
	int total_perguntas = perguntas.length;
	int resultado;
	
	JFrame frame = new JFrame();
	JButton botaoA = new JButton();
	JButton botaoB = new JButton();
	JButton botaoC = new JButton();
	JButton botaoD = new JButton();
	JLabel palpite_labelA = new JLabel();
	JLabel palpite_labelB = new JLabel();
	JLabel palpite_labelC = new JLabel();
	JLabel palpite_labelD = new JLabel();
	
	public Quiz() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setLayout(null);
		frame.setResizable(false);
		
		botaoA.setBounds(0,100,100,100);
		botaoA.setFont(new Font("Poppins",Font.BOLD,35));
		botaoA.addActionListener(this);
		botaoA.setText("A");
		
		botaoB.setBounds(0,200,100,100);
		botaoB.setFont(new Font("Poppins",Font.BOLD,35));
		botaoB.addActionListener(this);
		botaoB.setText("B");
		
		botaoC.setBounds(0,300,100,100);
		botaoC.setFont(new Font("Poppins",Font.BOLD,35));
		botaoC.addActionListener(this);
		botaoC.setText("C");
		
		botaoD.setBounds(0,400,100,100);
		botaoD.setFont(new Font("Poppins",Font.BOLD,35));
		botaoD.addActionListener(this);
		botaoD.setText("D");
		frame.add(botaoA);
		frame.add(botaoB);
		frame.add(botaoC);
		frame.add(botaoD);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			botaoA.setEnabled(true);
			botaoB.setEnabled(true);
			botaoC.setEnabled(true);
			botaoD.setEnabled(true);
	
	}
}