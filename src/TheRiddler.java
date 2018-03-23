import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
String answer1=JOptionPane.showInputDialog("What is greater than God,\n" + 
		"more evil than the devil,\n" + 
		"the poor have it,\n" + 
		"the rich need it,\n" + 
		"and if you eat it, you'll die? \n" + 
		"\n" + 
		")");
if (answer1.equals("nothing")) {
	score=score+1;
}
else {
	score=score+0;
}
String answer2=JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
if (answer2.equals("a stamp")) {
	score=score+1;
}
else {
	score=score+0;
}
JOptionPane.showMessageDialog(null, "Your score is: "+score);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

