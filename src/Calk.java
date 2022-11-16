import java.util.Scanner;

public class Calk {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя");
        String name = scanner.nextLine();
        if (name.isBlank()){
            try {
                throw new ExeptionName();
            }catch (ExeptionName e){
                e.printStackTrace();
            }
        }

        int i = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            if (i == 2 || b == 2) {
                throw new ExeptionDeleteTwo();
            }
        } catch (ExeptionDeleteTwo e){
            System.out.println(e);
           e.printStackTrace();
        }
        System.out.println(i / b);
    }
}
