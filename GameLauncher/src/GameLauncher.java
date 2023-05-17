


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GameLauncher implements ActionListener  {

		JFrame frame;
		JPanel panel;
		JButton game1Button, game2Button;
	
		public GameLauncher() {
		
		
		
		// Erstelle HomeScreen and Panel
		frame = new JFrame ("Game Launcher");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		
		
		// Erstelle Schaltflächen für die einzelnen Spiele 
		
		game1Button = createGameButton("TIC-TAC-TOE", "pfad zum png");
		game1Button.addActionListener(this);
		panel.add(game1Button, BorderLayout.NORTH);
		
		game2Button =  createGameButton("PAC-MAN", "C:\\Users\\49152\\Documents\\GitHub\\GameLauncher\\GameLauncher\\Image");
		game2Button.addActionListener(this);
		panel.add(game2Button, BorderLayout.NORTH);
		
		frame.getContentPane().add(panel);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
		// Erstellung einer Instanz des GemaLauncher
		public static void main(String[] args) {
		new GameLauncher();
		
		}
		
		
		
		@Override
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()== game1Button) {
				// Hier Startet TIC-TAC-TOE
				startGame1();
			
			}	else if (e.getSource()== game2Button) {
					// Hier Sartet PAC-MAN
					startGame2();
				}
			}

		
		
		// Methode zum Erstellen von Buttons mit Text und Bild
		
		private JButton createGameButton(String buttonText, String imagePath) {
			JButton button = new JButton(buttonText);
			button.addActionListener(this);
			
			// Setze das Bild für den Button
			ImageIcon icon = new ImageIcon(imagePath);
			button.setIcon(icon);
			
			return button;
		}
		
		
		
		// Methode zum Starten von TIC-TAC_TOE
	
		private void startGame1() {
		
			// Hier einen verweis auf TIC-TAC-TOE einbauen
		
		JOptionPane.showMessageDialog(frame, "TIC-TAC-TOE wird gestartet....");
	}
	

		
		// Methode zum Starten von PAC-AMN
	
		private void startGame2() {
			
			// Hier einen verweis auf PAc-MAN einbauen
		
		JOptionPane.showMessageDialog(frame, "PAC-MAN wird gestartet....");
	}
	
}
 