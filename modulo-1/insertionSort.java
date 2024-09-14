
public class InsertionSort {
/*
 * INSERTION SORT

	A IDEIA DA ORDENAÇÃO POR INSERÇÃO É DIVIDIR OS ELEMENTOS EM
	DUAS SUBESTRUTURAS, UMA COM OS ELEMENTOS JÁ ORDENADOS E OUTRA COM 
	ELEMENTOS AINDA POR ORDENAR.

	- É CONSIDERADO UM ALGORITMO ESTAVEL
	- ORDENA OS DADOS EM TEMPO REAL
	
	PERFORMANCE: 
		- PIOR CASO: O(N²)
		- MELHOR CASO: O(N)

 * 
 */
	
public static void main(String[] args) {
	//criando o vetor com 5 posições de 0 a 4
			int vet[] = {16,428,25,4,54,30};
			
			 // Chama o método bubbleSort
			vet = insertionSort(vet);
	        
	        // Imprim1e o vetor ordenado
	        System.out.println("Vetor ordenado:");
	        System.out.print("[");
	        for (int i = 0; i < vet.length; i++) {
	            System.out.print(vet[i] + " ");
	        }
	        System.out.print("]");
}

public static int[] insertionSort(int[] vetor) {
	//tamanho do vetor atribuida a variavel n
	int n = vetor.length;
	
	for(int i=0;i<n;i++) {
		int aux = vetor[i];
		int j = i;
		while(j>0 && aux < vetor[j-1]) {
			vetor[j] = vetor[j-1];
			j = j -1;
		}
		vetor[j] = aux;
	}
	
	
	
	return vetor;
}

}
