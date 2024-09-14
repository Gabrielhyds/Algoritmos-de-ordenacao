package Modulo1;

public class SelectionSort {
/*
 * SELECTION SORT

	A IDEIA DA ORDENAÇÃO POR SELEÇÃO
	É PROCURAR O MENOR ELEMENTO DO VETOR
	(OU MAIOR) E MOVIMENTA-LO PARA A PRIMEIRA(ULTIMA)
	POSIÇÃO DO VETOR
		-REPETE PARA OS N ELEMENTOS DO VETOR

	PERFORMANCE:
		- PIOR CASO: O(N²)
		- MELHOR CASO: O(N)

  */
	
	public static void main(String[] args) {
		int[] vetDesordenado = {16,428,25,4,54,30};
		
		
		 // Chama o método bubbleSort
		vetDesordenado = selectionSort(vetDesordenado);
        
        // Imprim1e o vetor ordenado
        System.out.println("Vetor ordenado:");
        System.out.print("[");
        for (int i = 0; i < vetDesordenado.length; i++) {
            System.out.print(vetDesordenado[i] + " ");
        }
        System.out.print("]");
		
		
	}
	
	public static int[] selectionSort(int[] vetor) {
		 int n = vetor.length;
	        for (int i = 0; i < n - 1; i++) {
	            // Encontra o menor elemento no vetor[i..n-1]
	            int minimo = i;
	            for (int j = i + 1; j < n; j++) {
	            	if(vetor[j] < vetor[minimo]) {
	            		minimo = j;
	            			
	            	}
	            }if(i !=minimo) {
	            	int aux = vetor[i];
	            	vetor[i] = vetor[minimo];
	            	vetor[minimo] = aux;
	            	
	            }
	        }
		
		return vetor;
	}
}

