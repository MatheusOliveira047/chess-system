package chess.pieces;

import boardgme.Board;
import boardgme.Position;
import chess.ChessPiece;
import chess.Color;

public class Horse extends ChessPiece{

  public Horse(Board board, Color color) {
    super(board, color);
    
  }

  @Override
  public String toString(){
    return "H";
  }

  @Override
  public boolean[][] possibleMoves() {
    boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0,0);

    p.setValues(position.getRow() - 2, position.getColumn() - 1);
		if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

    p.setValues(position.getRow() + 2, position.getColumn() - 1);
    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

    p.setValues(position.getRow() - 2, position.getColumn() + 1);
    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

    p.setValues(position.getRow() + 2, position.getColumn() + 1);
    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

    p.setValues(position.getRow() - 1, position.getColumn() - 2);
    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

    p.setValues(position.getRow() - 1, position.getColumn() + 2);
    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

    p.setValues(position.getRow() + 1, position.getColumn() - 2);
    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

    p.setValues(position.getRow() + 1, position.getColumn() + 2);
    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		
		}
		if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
    

    return mat;
  }
  
}
