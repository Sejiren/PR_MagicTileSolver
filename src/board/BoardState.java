package board;

/*
 * Contains information about the current state of the playing field
 */
public class BoardState {
	
	private int[][] board = new int[3][6];

	public BoardState(int[][] board) {
		this.board = board;
	}
	
	public BoardState rotate(Moves move) {
		switch (move) {
			case C1D:
				rotateDown(0);
				break;
				
			case C1U:
				rotateUp(0);
				break;
				
			case C2D:
				rotateDown(1);
				break;
				
			case C2U:
				rotateUp(1);
				break;
				
			case C3D:
				rotateDown(2);
				break;				
				
			case C3U:
				rotateUp(2);
				break;
				
			case C4D:
				rotateDown(3);
				break;
				
			case C4U:
				rotateUp(3);
				break;
				
			case C5D:
				rotateDown(4);
				break;
				
			case C5U:
				rotateUp(4);
				break;
				
			case C6D:
				rotateDown(5);
				break;				
				
			case C6U:
				rotateUp(5);
				break;
				
			case R1L:
				rotateLeft(0);
				break;
				
			case R1R:
				rotateRight(0);
				break;
				
			case R2L:
				rotateLeft(1);
				break;
				
			case R2R:
				rotateRight(1);
				break;
				
			case R3L:
				rotateLeft(2);
				break;				
				
			case R3R:
				rotateRight(2);
				break;
		}		
		return new BoardState(board);
	}	
	
	private void rotateLeft (int row) {
		int temp = board[row][0];
		for (int i = 1; i <= 5 ; i++) {
			board[row][i-1] = board[row][i];
		}
		board[row][5] = temp;
	}
	
	private void rotateRight (int row) {
		int temp = board[row][5];
		for (int i = 4; i >= 0  ; i--) {
			board[row][i+1] = board[row][i];
		}
		board[row][0] = temp;
	}
	
	private void rotateUp (int column) {		
		int temp = board[0][column];
		for (int i = 1; i <= 2; i++) {
			board[i-1][column] = board[i][column];
		}
		board[2][column] = temp;
	}
	
	private void rotateDown (int column) {		
		int temp = board[2][column];
		for (int i = 1; i >= 0; i++) {
			board[i+1][column] = board[i][column];
		}
		board[0][column] = temp;
	}
}
