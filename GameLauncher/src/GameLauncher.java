import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GameLauncher implements ActionListener  {

	JFrame frame;
	JPanel panel;
	JButton game1Button, game2Button;
	
	public GameLauncher() {
		
		// Create HomeScreen and Panel
		frame = new JFrame ("Game Launcher");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		// Erstelle Schaltflächen für die einzelnen Spiele 
		
		game1Button = new JButton("TIC-TAC-TOE");
		game1Button.addActionListener(this);
		panel.add(game1Button, BorderLayout.NORTH);
		
		game2Button = new JButton("PAC-MAN");
		game2Button.addActionListener(this);
		panel.add(game2Button, BorderLayout.NORTH);
		
	}
	
	public static void main(String[] args) {
		// Erstellung einer Instanz des GemaLauncher
		new GameLauncher();
	}
	
	public void  actionPerformend(ActionEvent e) {
		// Überprüfung welcher Knopf gedrückt wurde und Starte die Anwendung
		
		if (e.getSource()== game1Button) {
			// Starte das erste Spiel
			System.out.println("TIC-TAC-TOE wird gestartet...");
		
		if (e.getSource()== game2Button) {
			// Sarte das zweite Spiel
			System.out.println("PAC-MAN wird gestartet...");
			
		}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
 