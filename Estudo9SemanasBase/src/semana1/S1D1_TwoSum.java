package semana1;

import java.util.HashMap;

public class S1D1_TwoSum {
	  
	public int[] twoSum(int[] nums, int target) {
        
		HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (mapa.containsKey(complement)) {
                return new int[] { mapa.get(complement), i };
            }

            mapa.put(nums[i], i);
        }

        return new int[] {};
    }

}


/*
 * Este código utiliza a estratégia de tabela de dispersão (HashMap)
 * para encontrar, em tempo linear, dois valores em um array cuja soma
 * resulta no alvo especificado. Durante a iteração sobre o array, cada elemento 
 * é analisado para verificar se o valor complementar necessário para atingir o alvo já foi
 * encontrado anteriormente. Caso o complemento esteja armazenado no mapa, a solução é
 * imediatamenteretornada com os índices correspondentes. Caso contrário, o valor atual é 
 * nserido na estrutura para consultas futuras. Esse mecanismo evita buscas repetitivas e
 * elimina a necessidade de loops aninhados, reduzindo a complexidade da solução para O(N). 
 * Trata-se, portanto, de uma abordagem eficiente, direta e amplamente utilizada para 
 * resolver o problema de Two Sum de forma otimizada.
 * 
 * */
 */