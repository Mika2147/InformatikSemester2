package de.hska.iwii.i2.gol;

/**
 * Die eigentliche Spielelogik. Das Spielfeld wird hier nicht
 * als zyklisch geschlossen betrachtet wird.
 *
 * @author Holger Vogelsang
 */
public class GameOfLifeLogic {
	private boolean[][] currentGeneration;

	/**
	 * Macht die ausgewählte Startgeneration zu aktuellen Generation zum Start des Spiels.
	 *
	 * @param generation Entspricht der Startgeneration, gespeichert als Array
	 *
	 */
	public void setStartGeneration(boolean[][] generation) {
		currentGeneration = generation;
	}

	/**
	 * Errechnet aus der aktuellern Generation die nächste Gneration und speichert diese zum Schluss als aktuelle Generation.
	 */
	public void nextGeneration() {
		boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];


		for (int i = 0; i < currentGeneration.length; i++) {
			for (int j = 0; j < currentGeneration[i].length; j++) {
				//Felder um Feld herum überprüfen und Wert für nächste Generation festlegen
				int sindAmLeben = 0;
				if (i > 0 && j > 0) {
					if (currentGeneration[i - 1][j - 1]) {
						sindAmLeben++;
					}
				}
				if (i > 0) {
					if (currentGeneration[i - 1][j]) {
						sindAmLeben++;
					}
				}
				if (i > 0 && j < currentGeneration[i].length - 1) {
					if (currentGeneration[i - 1][j + 1]) {
						sindAmLeben++;
					}
				}
				if (j > 0) {
					if (currentGeneration[i][j - 1]) {
						sindAmLeben++;
					}
				}
				if (j < currentGeneration[i].length - 1) {
					if (currentGeneration[i][j + 1]) {
						sindAmLeben++;
					}
				}
				if (i < currentGeneration.length - 1 && j > 0) {
					if (currentGeneration[i + 1][j - 1]) {
						sindAmLeben++;
					}
				}
				if (i < currentGeneration.length - 1) {
					if (currentGeneration[i + 1][j]) {
						sindAmLeben++;
					}
				}
				if (i < currentGeneration.length - 1 && j < currentGeneration[i].length - 1) {
					if (currentGeneration[i + 1][j + 1]) {
						sindAmLeben++;
					}
				}

				if (sindAmLeben < 2 || sindAmLeben > 3) {
					nextGeneration[i][j] = false;
				} else if (sindAmLeben == 2 && !(currentGeneration[i][j])) {
					nextGeneration[i][j] = false;
				} else {
					nextGeneration[i][j] = true;
				}
			}
		}
		currentGeneration = nextGeneration;
	}

	/**
	 *Ermöglicht es für jedes Feld abzufragen ob dieses am Leben oder Tot ist.
	 *
	 *@param x Entspricht dem der Reihe des Feldes auf der x-Achse
	 *@param y Entspricht der Reihe des Feldes auf der Y-Achse
	 *
	 * @returns Gibt zurück ob das abgefragte Feld lebt
	 */
	public boolean isCellAlive(int x, int y) {
		return currentGeneration[x][y];
	}
}