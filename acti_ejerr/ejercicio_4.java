package CLASS;

public class ejercicio_4 {
	int potenciaRapida (int x, int y) {
		if (y == 0) { // O (1)
		return 1; // O (1)
		} else if (y % 2 == 0) { // O (1)
		int mitad = potenciaRapida (x, y / 2); // T(y /2)
		return mitad * mitad ; // O (1)
		} else { // O (1)
		return x * potenciaRapida (x, y - 1); // T(y -1)
		}
		}
}
