import java.util.Objects;

public class Programinha {

    public int soma;

    public static void main(String[] args) {

        System.out.println("Iniciado");
        if(Objects.nonNull(args) && args.length > 0) {
            System.out.println(args[0]);
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }else {
            System.out.println("Em args tem menos que 1");
        }




}
