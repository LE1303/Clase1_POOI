package metodo;

import java.util.Arrays;

public class Burbuja {
	public static void main(String[] args) {
		//Se declara el arreglo
		int arr[] = {64, 25, 12, 22, 11};
		System.out.println("Arreglo Original: "+ Arrays.toString(arr));
		bubble(arr);
		System.out.println("Arreglo Ordenada: "+ Arrays.toString(arr));
	}
	
public static void bubble(int arr[]) {
	int n = arr.length;
	int temp = 0;
	for(int i = 0; i < n; i++) {
		for(int j = 1; j < (n-i);j++) {
				if(arr[j-1] > arr[j]) {
					//Aqui se intercambian los elementos
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
	
