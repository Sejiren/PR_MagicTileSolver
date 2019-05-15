package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import board.BoardSequence;
import board.BoardState;
import board.Move;

import javax.swing.JTextArea;

public class Main_GUI {

	private JFrame frmPokmonRebornMagic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_GUI window = new Main_GUI();
					window.frmPokmonRebornMagic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPokmonRebornMagic = new JFrame();
		frmPokmonRebornMagic.setTitle("Pok\u00E9mon Reborn Magic Tile Puzzle Solver");
		frmPokmonRebornMagic.getContentPane().setBackground(Color.DARK_GRAY);
		frmPokmonRebornMagic.setBounds(100, 100, 381, 477);
		frmPokmonRebornMagic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokmonRebornMagic.getContentPane().setLayout(null);
		
		JSpinner r1c1 = new JSpinner();
		r1c1.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r1c1.setBounds(22, 38, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r1c1);
		
		JSpinner r1c2 = new JSpinner();
		r1c2.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r1c2.setBounds(71, 38, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r1c2);
		
		JSpinner r1c3 = new JSpinner();
		r1c3.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r1c3.setBounds(120, 38, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r1c3);
		
		JSpinner r2c1 = new JSpinner();
		r2c1.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r2c1.setBounds(22, 88, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r2c1);
		
		JSpinner r2c2 = new JSpinner();
		r2c2.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r2c2.setBounds(71, 88, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r2c2);
		
		JSpinner r2c3 = new JSpinner();
		r2c3.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r2c3.setBounds(120, 88, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r2c3);
		
		JSpinner r3c1 = new JSpinner();
		r3c1.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r3c1.setBounds(22, 138, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r3c1);
		
		JSpinner r3c2 = new JSpinner();
		r3c2.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r3c2.setBounds(71, 138, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r3c2);
		
		JSpinner r3c3 = new JSpinner();
		r3c3.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r3c3.setBounds(120, 138, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r3c3);
		
		JSpinner r1c4 = new JSpinner();
		r1c4.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r1c4.setBounds(203, 38, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r1c4);
		
		JSpinner r1c5 = new JSpinner();
		r1c5.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r1c5.setBounds(252, 38, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r1c5);
		
		JSpinner r1c6 = new JSpinner();
		r1c6.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r1c6.setBounds(301, 38, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r1c6);
		
		JSpinner r2c4 = new JSpinner();
		r2c4.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r2c4.setBounds(203, 88, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r2c4);
		
		JSpinner r2c5 = new JSpinner();
		r2c5.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r2c5.setBounds(252, 88, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r2c5);
		
		JSpinner r2c6 = new JSpinner();
		r2c6.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r2c6.setBounds(301, 88, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r2c6);
		
		JSpinner r3c4 = new JSpinner();
		r3c4.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r3c4.setBounds(203, 138, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r3c4);
		
		JSpinner r3c5 = new JSpinner();
		r3c5.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r3c5.setBounds(252, 138, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r3c5);
		
		JSpinner r3c6 = new JSpinner();
		r3c6.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		r3c6.setBounds(301, 138, 39, 39);
		frmPokmonRebornMagic.getContentPane().add(r3c6);
		
		JLabel lblEnterInitial = new JLabel("Enter initial state");
		lblEnterInitial.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterInitial.setForeground(Color.WHITE);
		lblEnterInitial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterInitial.setBounds(120, 0, 122, 39);
		frmPokmonRebornMagic.getContentPane().add(lblEnterInitial);
		
		JTextArea solution_output = new JTextArea();
		solution_output.setBounds(22, 234, 318, 193);
		frmPokmonRebornMagic.getContentPane().add(solution_output);
		
		JButton startButton = new JButton("Solve Puzzle");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Read the initial state of the board from user input
				int[][] initial_board = { 
									{(int)r1c1.getValue(), (int)r1c2.getValue(), (int)r1c3.getValue(), (int)r1c4.getValue(), (int)r1c5.getValue(), (int)r1c6.getValue()},
									{(int)r2c1.getValue(), (int)r2c2.getValue(), (int)r2c3.getValue(), (int)r2c4.getValue(), (int)r2c5.getValue(), (int)r2c6.getValue()},
									{(int)r3c1.getValue(), (int)r3c2.getValue(), (int)r3c3.getValue(), (int)r3c4.getValue(), (int)r3c5.getValue(), (int)r3c6.getValue()}
								};	
				BoardState initial_state = new BoardState(initial_board);
				
				// Flag notifying if the puzzle was solved: If not solved go through the working queue, if solved display solution trace in solution field
				boolean solved = false;
				
				// Set of all reached BoardStates. Is used to prevent duplicate additions to the working queue.
				Set<BoardState> reached_states = new HashSet<BoardState>();				
				
				// The working queue. The first state will be picked to process, new states are added last. This guarantees that any found solution is as short as possible.
				Queue<BoardSequence> states_to_explore = new LinkedBlockingQueue<BoardSequence>();
				BoardSequence current_sequence;
				BoardSequence next_sequence;
				
				// Adding initial board state to the set of reached states, as the process starts there, and a sequence defined by the initial board_state and an empty trace of actions performed
				reached_states.add(initial_state);
				states_to_explore.add(new BoardSequence(initial_state, ""));
				
				int c = 0;
				while (!solved) {
					// Take first sequence from queue
					current_sequence = states_to_explore.poll();
					
					for (Move move : Move.values()) {	
						// Take the currently processed BoardState and execute move. This will result in the BoardState after the corresponding rotation was performed.
						next_sequence = current_sequence.rotate(move);
						
						if(next_sequence.isSolved()) {
							// Puzzle was solved, set flag to break out of while-loop
							solved = true;
							// Write solution onto the solution output text field
							solution_output.setText(next_sequence.getSequence());
							// Break out of for-loop
							break;							
						}
						
						if (reached_states.contains(next_sequence.getBoard_state())) {
							// If state was already visited, perform next move
							continue;
						} else {
							// Otherwise add state to the set of reached states
							reached_states.add(next_sequence.getBoard_state());
							// Add sequence to the working queue
							states_to_explore.add(next_sequence);
							
							// Here, the the for-loop goes on to the next move or none of the moves led to a solution.
							// So, return to the beginning of the while-loop and pick the next sequence
						}
					}
				}
				
			}
		});
		startButton.setBounds(120, 200, 122, 23);
		frmPokmonRebornMagic.getContentPane().add(startButton);		
	}
}
