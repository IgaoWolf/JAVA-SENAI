package exercicioOrdenarVetor;

public class CallClasses {
	private static long eficienciaPropriaSort;//tempo1
	private static long eficienciaInsertionSort;//tempo2
	private static long eficienciaBubbleSort;//tempo3
	private static long eficienciaQuickSort;//tempo4
	private static long eficienciaSelectionSort;//tempo5
	private static long eficienciaMergeSort;//tempo6
	int[] vetor = new int[1000];

	public static void main(String[] args) {
		calcularPropriaSort();
		calcularInsertionSort();
		calcularBubbleSort();
		calcularQuickSort();
		calcularSelectionSort();
		calcularMergeSort();
		testeDeEficiente();

	}


	private static void testeDeEficiente() {
		if (tempo1 > tempo2 && tempo1 > tempo3 && tempo1 > tempo4 && tempo1 > tempo 5) {
			
		}
			
	
	}
	
	private static void calcularMergeSort() {
		MergeSort mergeSort = new MergeSort();
		eficienciaMergeSort = mergeSort.eficienciaMergeSort();
	
	}

	private static void calcularInsertionSort() {
		InsertionSort insertionSort = new InsertionSort();
		eficienciaInsertionSort = insertionSort.eficienciaInsertionSort();
	}

	private static void calcularPropriaSort() {
		PropriaSort propriaSort = new PropriaSort();
		eficienciaPropriaSort = propriaSort.eficienciaPropriaSort();

	}

	private static void calcularBubbleSort() {
		BubbleSort bubbleSort = new BubbleSort();
		eficienciaBubbleSort = bubbleSort.eficienciaBubbleSort();
	}

	private static void calcularQuickSort() {
		QuickSort quickSort = new QuickSort();
		eficienciaQuickSort = quickSort.eficienciaQuickSort();
	}

	private static void calcularSelectionSort() {
		SelectionSort selectionSort = new SelectionSort();
		eficienciaSelectionSort = selectionSort.eficienciaSelectionSort();
	}

}