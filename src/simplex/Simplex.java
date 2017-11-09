package simplex;

import java.util.ArrayList;

public class Simplex {
	
	private ArrayList<Integer[]> matrizCoeficientesA;
	private Integer vetorRecursos_b;
	private Integer vetorCusto_c;
	private ArrayList<Integer> indicesBase;
	private ArrayList<Integer> indicesNaoBase;
	private Integer m;
	private Integer n;
	private String titulo;
	
	

    public Simplex(ArrayList<Integer[]> matrizCoeficientesA, Integer vetorRecursos_b, Integer vetorCusto_c,
			ArrayList<Integer> indicesBase, ArrayList<Integer> indicesNaoBase, Integer m, Integer n, String titulo) {
    	
		this.matrizCoeficientesA = matrizCoeficientesA;
		this.vetorRecursos_b = vetorRecursos_b;
		this.vetorCusto_c = vetorCusto_c;
		this.indicesBase = indicesBase;
		this.indicesNaoBase = indicesNaoBase;
		this.m = m;
		this.n = n;
		this.titulo = titulo;
	}

	public void Solve() {
        Integer iteracao = 0;
        
        //TODO metodo toString para essas variaveis
        System.out.println("A");
        System.out.println("b");
        System.out.println("c");
        
        System.out.println("Titulo: "+ titulo);
        
        do {
            /*
             * Passo 1: Calculando SBF inicial
             */
            
            
            // Exibe indices basicos e nao basicos da iteracao atual (apenas debug)
            System.out.println("\nIteracao #" + iteracao+"\n");
            
            System.out.print("\tIndices Basicos: ");
            for (Integer i : indicesBase) {
                System.out.print(" " + i);
            }
            System.out.println("");
            
            System.out.print("\tIndices Nao Basicos: ");
            for (Integer i : indicesNaoBase) {
                System.out.print(" " + i);
            }
            System.out.println("");
            
            //TODO Cria o espaco reservado para a matriz basica B de dimensao m x m
            //Integer B[][];
            
            //TODO Copia as colunas que formam a base inicial
            for (int j = 0; j < m; j++) {
                /*
                // B_j <- A_{B(j)}
                B[,j] <- A[,IndicesBase[j]];
                */
            }
            
            // Exibe a base (apenas debug)
            System.out.println("\tBase");
            for (int i = 0; i < m; i++) {
                System.out.print("\t\t|");
                for (int j = 0; j < m; j++) {
                    System.out.print("\t" /*+ B[i][j]*/);
                }
                System.out.println("\t|");
            }
            
            // Calcula a SBF inicial pelo produto da inversa de B com b
            // TODO metodos manipulacao Matrizes e Vetores
            /*
            BMenosUm = solve(B);
            x = BMenosUm %*% b;
            */
            
            
        } while (true);
    }

	public ArrayList<Integer[]> getMatrizCoeficientesA() {
		return matrizCoeficientesA;
	}

	public void setMatrizCoeficientesA(ArrayList<Integer[]> matrizCoeficientesA) {
		this.matrizCoeficientesA = matrizCoeficientesA;
	}

	public Integer getVetorRecursos_b() {
		return vetorRecursos_b;
	}

	public void setVetorRecursos_b(Integer vetorRecursos_b) {
		this.vetorRecursos_b = vetorRecursos_b;
	}

	public Integer getVetorCusto_c() {
		return vetorCusto_c;
	}

	public void setVetorCusto_c(Integer vetorCusto_c) {
		this.vetorCusto_c = vetorCusto_c;
	}

	public ArrayList<Integer> getIndicesBase() {
		return indicesBase;
	}

	public void setIndicesBase(ArrayList<Integer> indicesBase) {
		this.indicesBase = indicesBase;
	}

	public ArrayList<Integer> getIndicesNaoBase() {
		return indicesNaoBase;
	}

	public void setIndicesNaoBase(ArrayList<Integer> indicesNaoBase) {
		this.indicesNaoBase = indicesNaoBase;
	}

	public Integer getM() {
		return m;
	}

	public void setM(Integer m) {
		this.m = m;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
