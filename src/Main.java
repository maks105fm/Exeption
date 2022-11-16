import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] box = new int[10];



        try{
          throw new Exception();
        }catch (Exception e){
            System.out.println("123131");
        }


        try {

            System.out.println( 6 / 2 );
            int x = scanner.nextInt();
            box[10] = 0;
        }catch (InputMismatchException e){
            System.out.println("вы ввели не число");
        }catch (ArithmeticException e){
            System.out.println("delite 0");
        }catch (Exception e){


            System.out.println("error");
           // System.exit(0);
        }finally {
            System.out.println("работа завершенна");
        }



    }
}
