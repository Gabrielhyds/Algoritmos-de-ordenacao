public class BubbleSort {
	/* BUBBLE SORT - BOLHA

	IDEIA DA ORDENAÇÃO POR BOLHAS É FLUTUAR
    O MAIOR ELEMENTO PARA O FIM.
		- REPETIR N VEZES A FLUTUAÇÃO
		- REPETIR ATÉ QUE TODOS OS ELEMENTOS ESTEJA ORDENADOS
		
	  PERFORMANCE:
  		- PIOR CASO: O(N²)
  		- MELHOR CASO: O(N)
  
	*/
	
	public static void main(String[] args) {
		//criando o vetor com 5 posições de 0 a 4
		int vet[] = {500, 1, 4, 2, 8};

		
		 // Chama o método bubbleSort
		vet = bubbleSort(vet);
        
        // Imprim1e o vetor ordenado
        System.out.println("Vetor ordenado:");
        System.out.print("[");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.print("]");
		
	}
	
	 public static int[] bubbleSort(int[] vetor) {
	        // Variáveis
	        int n = vetor.length;
	        boolean j = true;
	        
	        // Utilizando o while para otimização
	        while (j) {
	            // Declarando j como false
	            j = false;
	            // Percorre todo o vetor
	            for (int i = 0; i < n - 1; i++) {
	                // Verifica se o elemento na posição é maior do que o sucessor
	                if (vetor[i] > vetor[i + 1]) {
	                    // Troca
	                    int aux = vetor[i];
	                    vetor[i] = vetor[i + 1];
	                    vetor[i + 1] = aux;
	                    j = true;
	                }
	            }
	            n = n - 1;
	        }
	        
	        return vetor;
	    }
}
