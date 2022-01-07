import java.util.*;
public class game {
	
	String [][] background;
	Scanner sc = new Scanner(System.in);
	int player;

	public game() {
	  this.background();
	  this.player();
	}
	public void background() {
		background = new String[3][3];
		for(int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) 
				System.out.print(background[a][b]  = " "+ " | ");
				System.out.println();
				System.out.println("--------------");
			  }
	
	}
	public void player() {
		System.out.println("Your turn ");
		player = sc.nextInt();
		sc.nextLine();
		
		switch(player) {
		case 1:
			background[0][0] = "X";
			for(int a =0; a<3; a++) {
				for(int b = 0;b<3;b++)
					System.out.print(background[a][b]  = " "+ " | ");
				    System.out.println();
				    System.out.println("----------------");
			       // System.out.println();
			   		}
			break ;
		case 2:
			background[0][1] = "X";
			for(int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) 
					System.out.print(background[a][b]  = " "+ " | ");
					System.out.println();
					System.out.println("--------------");
				  }
			break;
		case 3:
			background[0][2] = "X";
			for(int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) 
					System.out.print(background[a][b]  = " "+ " | ");
					System.out.println();
					System.out.println("--------------");
				  }
			break;
		case 4:
			background[1][0] = "X";
			for(int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) 
					System.out.print(background[a][b]  = " "+ " | ");
					System.out.println();
					System.out.println("--------------");
				  }
			break;
		case 5:
			background[1][1] = "X";
			for(int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) 
					System.out.print(background[a][b]  = " "+ " | ");
					System.out.println();
					System.out.println("--------------");
				  }
			break;
		case 6:
			background[1][2] = "X";
			for(int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) 
					System.out.print(background[a][b]  = " "+ " | ");
					System.out.println();
					System.out.println("--------------");
				  }
			break;
		case 7:
			background[2][0] = "X";
			for(int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) 
					System.out.print(background[a][b]  = " "+ " | ");
					System.out.println();
					System.out.println("--------------");
				  }
			break;
		case 8:
			background[2][1] = "X";
			for(int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) 
					System.out.print(background[a][b]  = " "+ " | ");
					System.out.println();
					System.out.println("--------------");
				  }
			break;
		case 9:
			background[2][2] = "X";
			
			break;
		}
		
	}
	public void computer() {
		
	}

}
