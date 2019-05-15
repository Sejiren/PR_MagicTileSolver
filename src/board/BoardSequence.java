package board;

/*
 * Tuple containing the current state of the playing field and the sequence of moves that led there.
 */
public class BoardSequence {
	
	private BoardState board_state;	
	private String sequence = "";
	
	public BoardSequence(BoardState board_state, String sequence) {
		this.board_state = board_state;
		this.sequence = sequence;
	}
	
	public BoardSequence rotate(Move move) {
		BoardState board_state = this.board_state.rotate(move);
		String sequence = this.sequence + ", " + move.name();
		
		return new BoardSequence(board_state, sequence);
	}
	
	public boolean isSolved() {
		return this.getBoard_state().isSolved();
	}

	public BoardState getBoard_state() {
		return board_state;
	}

	public void setBoard_state(BoardState board_state) {
		this.board_state = board_state;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
}
