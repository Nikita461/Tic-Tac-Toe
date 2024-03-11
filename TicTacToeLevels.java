import java.awt. CardLayout;
public class TicTacToeLevels extends JFrame implements ActionListener {
private static final long serialVersionUID = 1L;
private JPanel pane, p1, p2, p3, p4;
public static String currentplayer;
private JButton [] [] board;
private boolean haswinner;
private JMenuBar menubar;
private JMenu menu;
private JMenuItem Quit, NewGame;
private JLabel PlayerX, Playero, Choice;
private int countX = 0,
counto = 0;
private JTextField txtCountX, txtCounto;
int n;
private JButton play;
JRadioButton b1, b2, b3;
CardLayout card;
public TicTacToeLevels () {
super();
setTitle("Tic Tac Toe");
setSize (700, 700);
setResizable (false);
setDefaultCloseOperation (EXIT_ON_CLOSE);
setVisible (true);
pane new JPanel();
pane.setVisible (true);
card new CardLayout();
pane.setLayout (card);
}
private void initializeMenuBar() {
menubar new JMenuBar();
menu new JMenu("File ");
menu.setFont (new Font (Font. SANS-SERIF, Font.BOLD, 25));
NewGame new JMenuItem("New/Rematch");
NewGame.addActionListener(new ActionListener() {
@Override
public void action Performed (ActionEvent e) {
if (JOptionPane.showConfirmDialog (pane,
"Do you want to play again?\n Click 'Yes' for New game \n 'No' for Rematch", "Tic Tac Toe",
JOptionPane. YES_NO_OPTION) ==JOptionPane. YES_NO_OPTION){
new TicTacToeLevels ();
} else
resetBoard();
});
Quit = new JMenuItem("QuitGame");
Quit.addActionListener (new ActionListener() {
@Override
public void actionPerformed (ActionEvent e) {
if (JOptionPane.showConfirm Dialog (pane, "Confirm if you want to exit", "Tic Tac Toe",
JOptionPane. YES_NO_OPTION) == JOptionPane. YES_NO_OPTION)
System.exit(0);
});
}
menu.add(NewGame);
menu.add(Quit);
menubar.add(menu);
PlayerX = new JLabel ("PlayerX:");
menubar.add (PlayerX);

txtCountX.setEditable(false);

menubar.add(txtCountX);
txtCountX.setText
(String.valueOf(countX++));
txtCountx.setFont (new Font (Font. SANS-SERIF, Font. BOLD, 25));
Player = new JLabel ("Playero: ");
menubar.add(Playero);
Playero.setFont (new Font (Font. SANS-SERIF, Font. BOLD, 25));
txtCounto new JTextField();
txtCounto.setEditable (false);
menubar.add(txtCount0);
txtCounto.setText (String.valueOf(count0++));
txtCounto.setFont (new Font (Font. SANS-SERIF, Font.BOLD, 25));
setJMenuBar (menubar);
public void reset Board () {
currentplayer = "X";
haswinner = false;
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
board [i][j].setText("");
board [i][j].setBackground (Color.white);
private void initializeBoard () {
for (int i=0; i < n; i++) {
for (int j=0; j< n; j++) {
JButton btn = new JButton();
if (n=6)
else
btn.setFont(new Font (Font. SANS-SERIF, Font. BOLD, 100));
btn.setFont (new Font (Font. SANS SERIF, Font. BOLD, 150));
board[i][j]=btn;
board [i][j].setBackground (Color.white);
btn.addActionListener(new ActionListener() {
@Override
public void action Performed (ActionEvent e) {
if (((JButton) e.getSource()).getText().equals("") && haswinner == false) {
btn.setText(currentplayer);
if (btn.getText().equals ("X")) {
}
btn.setBackground (Color.cyan);
}
btn.setForeground (Color.BLUE);
if (btn.getText().equals ("0")) {
btn.setBackground (Color.pink);
btn.setForeground (Color.black);
}
if (n=3)
hasWinner3X3 ();
else if (n = 4)
hasWinner 4X4 ();
else if (n = 6)
hasWinner 6X6();
togglePlayer();
}
}
}};
﻿
if (n=3)
p2.add(btn);
if (n == 4)
p3.add(btn);
if (n == 6)
p4.add(btn);
}
}
}
public static void togglePlayer() {
if (currentplayer.equals ("X")) {
currentplayer = "0";
} else
currentplayer = "X";
}
JButton btn1;
private void hasWinner3X3 () {
if (board[0][0].getText().equals (currentplayer) && board [1][0].getText().equals (currentplayer) && board [2][0].getText().equals (currentplayer)) {
JOptionPane.showMessageDialog(null, "Player" + currentplayer+" has won");
haswinner = true;
if (currentplayer.equals("X")){
currentplayer "O";
} else
currentplayer "X";

private void hasWinner3X3 () {
if (board[0][1].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [2] [1].getText().equals (currentplayer)) {
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board[0][2].getText().equals (currentplayer) && board [1] [2].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer)) {
JOptionPane.showMessageDialog(null, "Player" + currentplayer + " has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [0].getText().equals (currentplayer) && board [0] [1].getText().equals (currentplayer) && board [0] [2].getText().equals (currentplayer)) {
JOptionPane.showMessageDialog(null, "Player" + currentplayer + " has won");
haswinner = true;
if (currentplayer.equals ("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [1][0].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [1] [2].getText().equals (currentplayer)) 
{
JOptionPane.showMessageDialog(null, "Player" + currentplayer + " has won");
haswinner = true;
if (currentplayer.equals ("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
else if (board [2][0].getText().equals (currentplayer) && board [2] [1].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer)) 
{
JOptionPane.showMessageDialog(null, "Player" + currentplayer + " has won");
haswinner = true;
if (currentplayer.equals ("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
else if (board [0][0].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer)) 
{
JOptionPane.showMessageDialog(null, "Player" + currentplayer + " has won");
haswinner = true;
if (currentplayer.equals ("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
else if (board [0][2].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [2] [0].getText().equals (currentplayer)) 
{
JOptionPane.showMessageDialog(null, "Player" + currentplayer + " has won");
haswinner = true;
if (currentplayer.equals ("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
}

private void hasWinner4X4 () {
if (board[0][0].getText().equals (currentplayer) && board [1][0].getText().equals (currentplayer)
&& board [2][0].getText().equals (currentplayer) && board [3] [0].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer+" has won");
haswinner = true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [1].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [2] [1].getText().equals (currentplayer) && board [3] [1].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [2].getText().equals (currentplayer) && board [1] [2].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer) && board [3] [2].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog(null, "Player" + currentplayer+" has won");
haswinner = true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [3].getText().equals (currentplayer) && board [1] [3].getText().equals (currentplayer) && board [2] [3].getText().equals (currentplayer) && board [3] [3].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog (null, "Player" + currentplayer" has won");
haswinner=true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [1].getText().equals (currentplayer) && board [0] [0].getText().equals (currentplayer) && board [0] [2].getText().equals (currentplayer) && board [0] [3].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog (null, "Player" + currentplayer" has won");
haswinner=true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [1] [0].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [1] [2].getText().equals (currentplayer) && board [1] [3].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog (null, "Player" + currentplayer" has won");
haswinner=true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [2] [0].getText().equals (currentplayer) && board [2] [1].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer) && board [2] [3].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog (null, "Player" + currentplayer" has won");
haswinner=true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
else if (board [3] [0].getText().equals (currentplayer) && board [3] [1].getText().equals (currentplayer) && board [3] [2].getText().equals (currentplayer) && board [3] [3].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog (null, "Player" + currentplayer" has won");
haswinner=true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
else if (board [0] [0].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer) && board [3] [3].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog (null, "Player" + currentplayer" has won");
haswinner=true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
else if (board [0] [3].getText().equals (currentplayer) && board [1] [2].getText().equals (currentplayer) && board [2] [1].getText().equals (currentplayer) && board [3] [0].getText().equals (currentplayer)) { 
JOptionPane.showMessageDialog (null, "Player" + currentplayer" has won");
haswinner=true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
}
}



private void hasWinner 6X6 () {
if (board[0][0].getText().equals (currentplayer) && board [1] [0].getText().equals (currentplayer)
&& board [2] [0].getText().equals (currentplayer) && board [3] [0].getText().equals (currentplayer) && board [4] [0].getText().equals (currentplayer) && board [5][0].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer + " has won");
haswinner = true;
if (currentplayer.equals("X"))
txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText(String.valueOf(count0++));
} 
else if (board[0][1].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [2] [1].getText().equals (currentplayer) && board [3] [1].getText().equals (currentplayer)
&& board [4] [1].getText().equals (currentplayer) && board [5] [1].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer+" has won");
haswinner = true;
if (currentplayer.equals ("X"))
txtCountX.setText(String.valueOf(countX++));
else
txtCounto.setText(String.valueOf(count0++));
} 
else if (board [0] [2].getText().equals (currentplayer) && board [1] [2].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer) && board [3] [2].getText().equals (currentplayer)
&& board [4] [2].getText().equals (currentplayer) && board [5] [2].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [3].getText().equals (currentplayer) && board [1] [3].getText().equals (currentplayer) && board [2] [3].getText().equals (currentplayer) && board [3] [3].getText().equals (currentplayer)
&& board [4] [3].getText().equals (currentplayer) && board [5] [3].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [4].getText().equals (currentplayer) && board [1] [4].getText().equals (currentplayer) && board [2] [4].getText().equals (currentplayer) && board [3] [4].getText().equals (currentplayer)
&& board [4] [4].getText().equals (currentplayer) && board [5] [4].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [5].getText().equals (currentplayer) && board [1] [5].getText().equals (currentplayer) && board [2] [5].getText().equals (currentplayer) && board [3] [5].getText().equals (currentplayer)
&& board [4] [5].getText().equals (currentplayer) && board [5] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [0].getText().equals (currentplayer) && board [0] [1].getText().equals (currentplayer) && board [0] [2].getText().equals (currentplayer) && board [0] [3].getText().equals (currentplayer)
&& board [0] [4].getText().equals (currentplayer) && board [0] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [1] [0].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [1] [2].getText().equals (currentplayer) && board [1] [3].getText().equals (currentplayer)
&& board [1] [4].getText().equals (currentplayer) && board [1] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [2] [0].getText().equals (currentplayer) && board [2] [1].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer) && board [2] [3].getText().equals (currentplayer)
&& board [2] [4].getText().equals (currentplayer) && board [2] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [3] [0].getText().equals (currentplayer) && board [3] [1].getText().equals (currentplayer) && board [3] [2].getText().equals (currentplayer) && board [3] [3].getText().equals (currentplayer)
&& board [3] [4].getText().equals (currentplayer) && board [3] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [4] [0].getText().equals (currentplayer) && board [4] [1].getText().equals (currentplayer) && board [4] [2].getText().equals (currentplayer) && board [4] [3].getText().equals (currentplayer)
&& board [4] [4].getText().equals (currentplayer) && board [4] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [5] [0].getText().equals (currentplayer) && board [5] [1].getText().equals (currentplayer) && board [5] [2].getText().equals (currentplayer) && board [5] [3].getText().equals (currentplayer)
&& board [5] [4].getText().equals (currentplayer) && board [5] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [0].getText().equals (currentplayer) && board [1] [1].getText().equals (currentplayer) && board [2] [2].getText().equals (currentplayer) && board [3] [3].getText().equals (currentplayer)
&& board [4] [4].getText().equals (currentplayer) && board [5] [5].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
else if (board [0] [5].getText().equals (currentplayer) && board [1] [4].getText().equals (currentplayer) && board [2] [3].getText().equals (currentplayer) && board [3] [2].getText().equals (currentplayer)
&& board [4] [1].getText().equals (currentplayer) && board [5] [0].getText().equals (currentplayer)) 
{ 
JOptionPane.showMessageDialog(null, "Player" + currentplayer" has won");
haswinner = true;
if (currentplayer.equals("X"))

txtCountX.setText (String.valueOf(countX++));
else
txtCounto.setText (String.valueOf(count0++));
} 
}
public static void main(String []args)
{
new TicTacToeLevels();
}



