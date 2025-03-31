package CLASS;


//actividad A
public static void intercambia(int x, int y){
	int aux; // O(1)
	aux = x; // O(1)
	x = y; // O(1)
	y = aux; // O(1)
	
	
//actividad B
public static int max(int x, int y) {
		int result ; // O (1)
		if (x >= y) { // O (1)
		result = x; // O (1)
		} else {
		result = y; // O (1)
		}
		return result ; // O (1)
	}

//actividad C
int suma (int [] v, int tama no) {
	int result ; // O (1)
	result = 0; // O (1)
	for ( int i = 0; i < tama no; i++) { // O(n)
		result += v[i]; // O (1)
	}
	return result ; //O (1)
	}


//actividad D
void ordenar (int [] v, int tama no) {
	int aux; // O (1)
	for ( int i = 0; i < tama no - 1; i++) { // O(n)
		for ( int j = 0; j < tama no - 1; j++) { // O(n)
			if (v[j] > v[j + 1]) { // O (1)
				aux = v[j]; // O (1)
				v[j] = v[j + 1]; // O (1)
				v[j + 1] = aux; // O (1)
}
}
}
}
}

