using System;
using System.Collections.Generic;

namespace Semana1
{
    public class S1D1_TwoSum
    {
        public int[] TwoSum(int[] nums, int target)
        {
            Dictionary<int, int> mapa = new Dictionary<int, int>();

            for (int i = 0; i < nums.Length; i++)
            {
                int complement = target - nums[i];

                if (mapa.ContainsKey(complement))
                {
                    return new int[] { mapa[complement], i };
                }

                if (!mapa.ContainsKey(nums[i]))
                {
                    mapa[nums[i]] = i;
                }
            }

            return Array.Empty<int>();
        }
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