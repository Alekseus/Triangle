import java.util.Scanner;

public class triangle {
    public static  void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите треугольное число: ");
        int i = iScanner.nextInt();
        System.out.printf("Число точек правильного треугольника: %d\n", giveMeNumber(i));
        iScanner.close();


    }

    public static int giveMeNumber(int a){
        return (a * (a + 1)) / 2; 
    }

}


