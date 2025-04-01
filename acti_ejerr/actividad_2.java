package CLASS;

public class actividad_2 {
	double potencia ( double x, int y) {
		double t;
		if (y == 0) // O (1)
		return 1.0; // O (1)
		if (y % 2 == 1) // O (1)
		return x* potencia (x, y-1); // T(y -1)
		else {
		t = potencia (x, y / 2); // T(y /2)
		return t * t; // O (1)
		}
		}
}
