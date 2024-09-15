import java.util.Scanner;

class Main{
    public static void main(String[] args) {
    QuestionService service =new QuestionService();
    service.initializequestion();
    service.getdata();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice");
    int choice = sc.nextInt();

System.out.println("ok its the  value have choice);
    }
}