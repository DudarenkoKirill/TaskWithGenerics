import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TimeOutQueue timeOutQueue=new TimeOutQueue();
        Scanner scanner=new Scanner(System.in);
        String choiсemenu=scanner.nextLine();
        do{

            if(choiсemenu.equalsIgnoreCase("add")){
                System.out.println("Введите время жизни млс ");
                long time=Long.parseLong(scanner.nextLine());
                System.out.println("Ввод строки(1) или числа(2) : ");
                if(scanner.nextLine().equalsIgnoreCase("1"))
                {
                    timeOutQueue.offer(scanner.nextLine(),time);
                }else if(scanner.nextLine().equalsIgnoreCase("2"))
                    timeOutQueue.offer(scanner.nextInt(),time);
            }
            else {
                System.out.println( timeOutQueue.poll());
            }
            choiсemenu=scanner.nextLine();
        }while(!choiсemenu.equalsIgnoreCase("exit"));
    }
}
