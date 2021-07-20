import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {

public static void main(String[] args_) {


    String[] args = { "add", "20", "1" }; 


    if(Objects.nonNull(args) && args.length > 0){

        if("soma".equals(args[0])) {
            soma(args);

        }else if ("add".equals(args[0])) {
            CriarLista(args);

        }else if ("explicacao".equals(args[0])) {
            ApresentarExplicacao(args);

        }else if ("multiplicacao".equals(args[0])) {    
            multiplicacao(args);

        }else {
            ApresentarLista(args);

        }
    }
              
    if(Objects.nonNull(args) && args.length > 0 && "multiplicacao".equals(args[0])) {
       
    }

}
    private static void soma(String[] args) {
        Integer soma = 0;
            for (int i = 0; i < args.length; i++) {
                soma += Integer.valueOf(args[i]);
        }
        System.out.println("O valor da soma do vetor args é: " + soma);
    }

    private static void CriarLista(String[] args) {
        List<String> compras = new ArrayList<>();
        Integer i = 1;
        while(i < args.length) {
            compras.add(args[i]);
            i++;
        }
        System.out.println(Arrays.toString(compras.toArray()));
    }
    private static void ApresentarLista(String[] args) {
        for(String item : args) {
            System.out.println("voce informou: " + item); //transforme para metodo
        }
    }
    private static void ApresentarExplicacao(String[] args) {
        int i = 0;
        int j = 0;
        System.out.println(i++);
        System.out.println(++j);
    }
    private static void multiplicacao(String[] args) {
        int multiplicacao = 0;
        for (int i = 1; i < args.length; i++) {
            multiplicacao = Integer.valueOf(args[i]) * Integer.valueOf(args[i]);
         }
         System.out.println("O valor da multiplicacao do vetor args é: " + multiplicacao);
    }


}




    
