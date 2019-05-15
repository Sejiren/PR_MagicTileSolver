package board;

/*
 * Contains information about the current state of the playing field
 */
public class BoardState {
	
	private final int SOLUTION_SUM = 15;
	private int[][] board = new int[3][6];

	public BoardState(int[][] board) {
		this.board = board;
	}
	
	public BoardState rotate(Move move) {
		BoardState board_state = null;
		switch (move) {
			case C1D:
				board_state = rotateDown(0);
				break;
				
			case C1U:
				board_state = rotateUp(0);
				break;
				
			case C2D:
				board_state = rotateDown(1);
				break;
				
			case C2U:
				board_state = rotateUp(1);
				break;
				
			case C3D:
				board_state = rotateDown(2);
				break;				
				
			case C3U:
				board_state = rotateUp(2);
				break;
				
			case C4D:
				board_state = rotateDown(3);
				break;
				
			case C4U:
				board_state = rotateUp(3);
				break;
				
			case C5D:
				board_state = rotateDown(4);
				break;
				
			case C5U:
				board_state = rotateUp(4);
				break;
				
			case C6D:
				board_state = rotateDown(5);
				break;				
				
			case C6U:
				board_state = rotateUp(5);
				break;
				
			case R1L:
				board_state = rotateLeft(0);
				break;
				
			case R1R:
				board_state = rotateRight(0);
				break;
				
			case R2L:
				board_state = rotateLeft(1);
				break;
				
			case R2R:
				board_state = rotateRight(1);
				break;
				
			case R3L:
				board_state = rotateLeft(2);
				break;				
				
			case R3R:
				board_state = rotateRight(2);
				break;
		}		
		return board_state;
	}	
	
	// Method to tell if a BoardState is a possible solution according to the rules given in the game
	public boolean isSolved() {
		boolean solved = false;
		
		if (	
				// Check sums of the left side
				(board[0][0] + board[0][1] + board[0][2] == SOLUTION_SUM)
				&& (board[1][0] + board[1][1] + board[1][2] == SOLUTION_SUM)
				&& (board[2][0] + board[2][1] + board[2][2] == SOLUTION_SUM)
				
				&& (board[0][0] + board[1][0] + board[2][0] == SOLUTION_SUM)
				&& (board[0][1] + board[1][1] + board[2][1] == SOLUTION_SUM)
				&& (board[0][2] + board[1][2] + board[2][2] == SOLUTION_SUM)
				
				&& (board[0][0] + board[1][1] + board[2][2] == SOLUTION_SUM)
				&& (board[2][0] + board[1][1] + board[0][2] == SOLUTION_SUM)
				
				// Check sums of the right side
				&& (board[0][3] + board[0][4] + board[0][5] == SOLUTION_SUM)
				&& (board[1][3] + board[1][4] + board[1][5] == SOLUTION_SUM)
				&& (board[2][3] + board[2][4] + board[2][5] == SOLUTION_SUM)
				
				&& (board[0][3] + board[1][3] + board[2][3] == SOLUTION_SUM)
				&& (board[0][4] + board[1][4] + board[2][4] == SOLUTION_SUM)
				&& (board[0][5] + board[1][5] + board[2][5] == SOLUTION_SUM)
				
				&& (board[0][3] + board[1][4] + board[2][5] == SOLUTION_SUM)
				&& (board[2][3] + board[1][4] + board[0][5] == SOLUTION_SUM)
				
				// Check for same numbers at corresponding positions (except for middle)
				&& (board[0][0] != board[0][3])
				&& (board[1][0] != board[1][3])
				&& (board[2][0] != board[2][3])
				&& (board[0][1] != board[0][4])
				
				&& (board[2][1] != board[2][4])
				&& (board[0][2] != board[0][5])
				&& (board[1][2] != board[1][5])
				&& (board[2][2] != board[2][5])
				) {
			solved = true;
		}
		
		return solved;
	}
	
	// Method to tell if two BoadStates are equal: They are equal if the contents of their boards are equal
	public boolean equals(BoardState board_state) {
		return (board==board_state.getBoard());
	}
	
	private BoardState rotateLeft(int row) {
		int[][] board = this.board;
		int temp = board[row][0];
		for (int i = 1; i <= 5 ; i++) {
			board[row][i-1] = board[row][i];
		}
		board[row][5] = temp;
		return new BoardState(board);
	}
	
	private BoardState rotateRight(int row) {
		int[][] board = this.board;
		int temp = board[row][5];
		for (int i = 4; i >= 0  ; i--) {
			board[row][i+1] = board[row][i];
		}
		board[row][0] = temp;
		return new BoardState(board);
	}
	
	private BoardState rotateUp(int column) {
		int[][] board = this.board;
		int temp = board[0][column];
		for (int i = 1; i <= 2; i++) {
			board[i-1][column] = board[i][column];
		}
		board[2][column] = temp;
		return new BoardState(board);
	}
	
	private BoardState rotateDown(int column) {
		int[][] board = this.board;
		int temp = board[2][column];
		for (int i = 1; i >= 0; i--) {
			board[i+1][column] = board[i][column];
		}
		board[0][column] = temp;
		return new BoardState(board);
	}
	
	private int[][] getBoard(){
		return board;
	}
}
