package org.kevi.game.fivechess;

import java.util.HashMap;
import java.util.Map;

public class MapChessboardSet extends ChessboardSet {
	Map<String, Chess> chessMap = new HashMap<String, Chess>();
	private String getKeyByXY(int x, int y) {
		return x + "-" + y;
	}
	@Override
	public void addChess(Chess chess) {
		chessMap.put(getKeyByXY(chess.x,chess.y), chess);
	}

	@Override
	public Chess getChess(int x, int y) {
		return chessMap.get(getKeyByXY(x,y));
	}
	@Override
	public void removeChess(int x, int y) {
		chessMap.remove(getKeyByXY(x,y));
	}
	@Override
	public void removeChess(Chess chess) {
		removeChess(chess.x, chess.y);
	}
	@Override
	public ChessboardSet clone() {
		MapChessboardSet newSet = new MapChessboardSet();
		for (int i = 0; i < chessBoardSize; i++) {
			for (int j = 0; j < chessBoardSize; j++) {
				if(!isBlankChess(j, i)) {
					newSet.addChess(getChess(j, i).clone());
				}
			}
		}
		return newSet;
	}

}
