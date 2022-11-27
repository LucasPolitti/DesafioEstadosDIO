import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExercicioEstadosDio {

    public static void main(String[] args) {

        Map <String, Estados> listaEstados = new HashMap<>() {{

            put("Pernambuco", new Estados ("PE", 9616621));
            put("Alagoas", new Estados ("AL", 3351543));
            put("Ceará", new Estados ("CE", 9187103));
            put("Rio Grande do Norte", new Estados ("RN", 3534265));


        }};

        //Método para trabalhar com elementos separadamente (entry.set)

        for (Map.Entry<String, Estados> estados : listaEstados.entrySet())
             System.out.println(estados.getKey() + " - " + estados.getValue().getNome() + " - " + estados.getValue().getPopulacao());




        System.out.println("SUBSTITUA A POPULAÇÃO DO RN POR 3534165");

        
        listaEstados.put("Rio Grande do Norte", new Estados("RN", 3534165));


        for (Map.Entry<String, Estados> estados : listaEstados.entrySet())
             System.out.println(estados.getKey() + " - " + estados.getValue().getNome() + " - " + estados.getValue().getPopulacao());


             System.out.println("CONFIRA SE PB ESTÁ NO DICIONÁRIO CASO NÃO ADICIONE PB - 4039277");

             System.out.println("Paraíba está no dicionário?" + listaEstados.containsKey("Paraíba"));

             System.out.println("ADICIONE O ESTADO DA PARAÍBA");

             listaEstados.put("Paraíba", new Estados("PB", 4039277));

             System.out.println("Paraíba está no dicionário?" + listaEstados.containsKey("Paraíba"));

             System.out.println("EXIBA A POPULAÇÃO DE PERNAMBUCO");

             System.out.println("A população de Pernanbuco é: " + listaEstados.get("Pernambuco").getPopulacao());

             System.out.println("EXIBA OS ESTADOS NA ORDEM QUE FORAM INFORMADOS");

             //Substituir HashMap por LinkedHashMap e mudar o nome da variável


             Map <String, Estados> listaEstados1 = new LinkedHashMap<>() {{

                put("Pernambuco", new Estados ("PE", 9616621));
                put("Alagoas", new Estados ("AL", 3351543));
                put("Ceará", new Estados ("CE", 9187103));
                put("Rio Grande do Norte", new Estados ("RN", 3534265));
    
    
            }};

            for (Map.Entry<String, Estados> estados1 : listaEstados1.entrySet())
             System.out.println(estados1.getKey() + " - " + estados1.getValue().getNome() + " - " + estados1.getValue().getPopulacao());

             System.out.println("EXIBA-OS EM ORDEM ALFABÉTICA");


             Map <String, Estados> listaEstados2 = new TreeMap<>(listaEstados);

             for (Map.Entry<String, Estados> estados2 : listaEstados2.entrySet())
             System.out.println(estados2.getKey() + " - " + estados2.getValue().getNome() + " - " + estados2.getValue().getPopulacao());


             System.out.println("EXIBA OS ESTADOS DE ACORDO COM A MENOR POPULAÇÃO");

             //Necessário usar o TreeSet


             Set<Map.Entry<String, Estados>> listaEstados3 = new TreeSet<>( new ComparatorPopulacao());

             listaEstados3.addAll(listaEstados.entrySet());

             for (Map.Entry<String, Estados> estados3 : listaEstados3)
             System.out.println(estados3.getKey() + " - " + estados3.getValue().getNome() + " - " + estados3.getValue().getPopulacao());

             System.out.println("EXIBA O ESTADO COM A MENOR POPULAÇÃO");






             



                
    
            

            

































        





            
        
        




    }
    
}

class ComparatorPopulacao implements Comparator<Map.Entry<String, Estados>> {

    @Override
    public int compare(Entry<String, Estados> P1, Entry<String, Estados> P2) {
        
        return P1.getValue().getPopulacao().compareTo(P2.getValue().getPopulacao());
    }


}
