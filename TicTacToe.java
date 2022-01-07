
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
public class TicTacToe implements java.awt.event.ActionListener{
	
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JPanel score_panel  = new JPanel();
	
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1_turn;
	int dice = 3;
	JButton remButtons[] = new JButton[2];
	JPanel rem_panel = new JPanel();
	int [] x = new int[dice];
	int [] o = new int[dice];
	int [] s1= new int[1024];
	int [] s2 = new int[1024];
	int score1 = 0;
	int score2 = 0;
	String Score1 = Integer.toString(score1);
	String Score2 = Integer.toString(score2);
	JLabel score_text1 = new JLabel("X : "+Score1);
	JLabel score_text2 = new JLabel("O : "+Score2);
	TicTacToe(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TicTacToe programmed  by YOUNGTECH ");
		frame.setSize(850,600);
		frame.getContentPane().setBackground(new Color(0xf4f921));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(0,0,255));
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		
		score_text2.setBackground(new Color(0xff5414));
		score_text2.setForeground(new Color(0,0,255));
		score_text2.setFont(new Font("Ink Free",Font.BOLD,75));
		score_text2.setHorizontalAlignment(JLabel.CENTER);
		score_text2.setOpaque(true);
		
		score_text1.setBackground(new Color(0xff5482));
		score_text1.setForeground(new Color(0,0,255));
		score_text1.setFont(new Font("Ink Free",Font.BOLD,75));
		score_text1.setHorizontalAlignment(JLabel.CENTER);
		score_text1.setOpaque(true);
		
		score_panel.setLayout(new GridLayout(2,1));
		score_panel.setBounds(0,0,150,600);
		score_panel.add(score_text1);
		score_panel.add(score_text2);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(150,150,150));
		
		rem_panel.setLayout(new GridLayout());
		
		
		
		for(int i = 0 ; i < 9 ; i++) {
		buttons[i] = new JButton();
		button_panel.add(buttons[i]);
		buttons[i].setFont( new Font("MV Boli",Font.BOLD,120));
		buttons[i].setFocusable(false);
		buttons[i].setBackground(Color.orange);
		buttons[i].addActionListener(this);
		
		}
		
		//button_panel.add(new JButton("Pause"));
		//button_panel.add(new JButton("Restart"));
		//button_panel.add(new JButton("Exit"));
		//remButtons[0].setText("Pause");
		//remButtons[1].setText("Restart");
		//remButtons[2].setText("Exit");
		//button_panel.add(remButtons[0]);
		for (int i = 0 ; i< 2 ;i++) {
			remButtons[i] = new JButton();
			remButtons[i].setFont( new Font("MV Boli",Font.BOLD,60));
			remButtons[i].setFocusable(false);
			remButtons[i].addActionListener(this);
			
			rem_panel.add(remButtons[i]);
			if(i == 0) {
				remButtons[i].setText("Restart");
			}
			if(i == 1) {
				remButtons[i].setText("Exit");
			}
			
		}
		
		
	
		title_panel.add(textfield);
		frame.add(score_panel,BorderLayout.WEST);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(rem_panel,BorderLayout.SOUTH);
		
		frame.add(button_panel);
		
		firstTurn();
		}

	
	
	/**
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		for(int i = 0; i<9; i++) {
			
			if(e.getSource()== buttons[i]) {
				
				if(player1_turn ) {
					for(int c = 0;c<3 ;c++) {
						x[c] = x[c]+1;
						
					if(buttons[i].getText() == "") {
							
							if(x[c]== 1) {
						buttons[i].setForeground(new Color(0xff0000));
						buttons[i].setText("X");
					//	System.out.println(x[c]);
						player1_turn = false;
						textfield.setText("O turn");
						check();
					}else if(x[c]== 2) {
						buttons[i].setForeground(new Color(0xff0000));
						buttons[i].setText("X");
						//System.out.println(x[c]);
						player1_turn = false;
						textfield.setText("O turn");
						check();
					}else if(x[c]== 3) {
						buttons[i].setForeground(new Color(0xff0000));
						buttons[i].setText("X");
						//System.out.println(x[c]);
						player1_turn = false;
						textfield.setText("O turn");
						check();
					}
							else if(x[c] >3) {
							
								buttons[i].setForeground(new Color(0xff0000));
								buttons[i].setText("X");
								//System.out.println(x[c]);
								player1_turn = false;
								textfield.setText("O turn");
								check();
					}
							}
						
					}
				}
				else {
					if(buttons[i].getText() == "") {
						buttons[i].setForeground(new Color(0x00ff00));
						buttons[i].setText("O");
						player1_turn = true;
						textfield.setText("X turn");
						check();
					}
				}
			}
			
			
		}
		
		if(e.getSource() == remButtons[0]) {
			for(int i =  0; i<9;i++) {
			 buttons[i].setText("");
			 buttons[i].setEnabled(true);
			 buttons[i].setFont( new Font("MV Boli",Font.BOLD,120));
			 buttons[i].setFocusable(false);
			 buttons[i].setBackground(Color.orange);
		}
		}
		if(e.getSource() == remButtons[1]) {
		frame.dispose();
		}
	}
	
 public void firstTurn() {
	 
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 if(random.nextInt(2) == 0) {
		 player1_turn = true;
		 textfield.setText("X turn");
	 }else {
		 player1_turn = false;
		 textfield.setText("O turn");
	 }
 }
 
 
public void check() {
	 //check xx win
	if((buttons[0].getText() == "X" ) &&
        (buttons[1].getText() == "X" ) && 
        (buttons[2].getText() == "X" )) {
		xWins(0,1,2);
	}
	if((buttons[3].getText() == "X" ) &&
	   (buttons[4].getText() == "X" ) && 
	   (buttons[5].getText() == "X" )) {
			xWins(3,4,5);
		}
	if((buttons[6].getText() == "X" ) &&
	        (buttons[7].getText() == "X" ) && 
	        (buttons[8].getText() == "X" )) {
			xWins(6,7,8);
		}
	if((buttons[0].getText() == "X" ) &&
	        (buttons[3].getText() == "X" ) && 
	        (buttons[6].getText() == "X" )) {
			xWins(0,3,6);
		}
	if((buttons[1].getText() == "X" ) &&
	        (buttons[4].getText() == "X" ) && 
	        (buttons[7].getText() == "X" )) {
			xWins(1,4,7);
		}
	if((buttons[2].getText() == "X" ) &&
	        (buttons[5].getText() == "X" ) && 
	        (buttons[8].getText() == "X" )) {
			xWins(2,5,8);
		}
	if((buttons[0].getText() == "X" ) &&
	        (buttons[4].getText() == "X" ) && 
	        (buttons[8].getText() == "X" )) {
			xWins(0,4,8);
		}
	if((buttons[2].getText() == "X" ) &&
	        (buttons[4].getText() == "X" ) && 
	        (buttons[6].getText() == "X" )) {
			xWins(2,4,6);
		}
	//check o win
	if((buttons[0].getText() == "O" ) &&
	        (buttons[1].getText() == "O" ) && 
	        (buttons[2].getText() == "O" )) {
			oWins(0,1,2);
		}
		if((buttons[3].getText() == "O" ) &&
		   (buttons[4].getText() == "O" ) && 
		   (buttons[5].getText() == "O" )) {
				oWins(3,4,5);
			}
		if((buttons[6].getText() == "O" ) &&
		        (buttons[7].getText() == "O" ) && 
		        (buttons[8].getText() == "O" )) {
				oWins(6,7,8);
			}
		if((buttons[0].getText() == "O" ) &&
		        (buttons[3].getText() == "O" ) && 
		        (buttons[6].getText() == "O" )) {
				oWins(0,3,6);
			}
		if((buttons[1].getText() == "O" ) &&
		        (buttons[4].getText() == "O" ) && 
		        (buttons[7].getText() == "O" )) {
				oWins(1,4,7);
			}
		if((buttons[2].getText() == "O" ) &&
		        (buttons[5].getText() == "O" ) && 
		        (buttons[8].getText() == "O" )) {
				oWins(2,5,8);
			}
		if((buttons[0].getText() == "O" ) &&
		        (buttons[4].getText() == "O" ) && 
		        (buttons[8].getText() == "O" )) {
				oWins(0,4,8);
			}
		if((buttons[2].getText() == "O" ) &&
		        (buttons[4].getText() == "O" ) && 
		        (buttons[6].getText() == "O" )) {
				oWins(2,4,6);
			}
 }


public void xWins(int a,int b,int c) {
	 buttons[a].setBackground(Color.YELLOW);
	 buttons[b].setBackground(Color.YELLOW);
	 buttons[c].setBackground(Color.YELLOW);
	 for (int l = 0; l<1; l++){
		 s1[l] = 1;
		 score1 = score1 + s1[l];
		 //System.out.println(s1[l]);
		 Score1 = Integer.toString(score1);
		 score_text1.setText("X : "+Score1);
	 }
	 for (int i =0; i<9;i++) {
		 buttons[i].setEnabled(false);
		
		 
			
			 
	 }

	
	 textfield.setText("X wins");
	
}


public void oWins(int a,int b,int c) {
	 buttons[a].setBackground(Color.YELLOW);
	 buttons[b].setBackground(Color.YELLOW);
	 buttons[c].setBackground(Color.YELLOW);
	 for (int l = 0; l<1; l++){
		 s2[l] = 1;
		 score2 = score2 + s2[l];
		 //System.out.println(s2[l]);
		 Score2 = Integer.toString(score2);
		 score_text2.setText("O : "+Score2);
	 }
	 for (int i =0; i<9;i++) {
		 buttons[i].setEnabled(false);
	 }
	 textfield.setText("O wins");
	 
}
}
