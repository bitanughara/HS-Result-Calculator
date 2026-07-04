import java.util.Scanner;
public class HS Result Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks,ben,e,p,c,m,opt,min,choice=1;
        double percent;
        do{
            System.out.println("==========================");
            System.out.println("Higher Secondary Result");
            System.out.println("      Calculator");
            System.out.println("==========================");
            System.out.print("Enter your Bengali Marks :");
            ben=sc.nextInt();
            System.out.print("Enter your English Marks :");
            e=sc.nextInt();
            System.out.print("Enter your Physics Marks :");
            p=sc.nextInt();
            System.out.print("Enter your Chemistry Marks :");
            c=sc.nextInt();
            System.out.print("Enter your Mathemaics Marks :");
            m=sc.nextInt();
            System.out.print("Enter your Optional Subject Marks :");
            opt=sc.nextInt();
            if(ben < 0 || ben > 100 || e<0 || e>100 
            || p < 0 || p > 100 || c < 0 || c > 100 
            || m < 0 || m > 100 || opt < 0 || opt > 100){
                System.out.println("Invalid Marks!");
                continue;
            }
            min = p;
            if(c < min) min = c;
            if(m < min) min = m;
            if(opt < min) min = opt;
            marks = (ben+e+p+c+m+opt)-min;
            System.out.println("=== Your Result ===");
            System.out.println("Your total Marks is ="+" "+marks);
            percent = (marks/500.0)*100;
            System.out.println("Percentage = "+" "+percent+"%");
            if(marks>=400 && marks<=500){
                System.out.println("Grade : A+");
                System.out.println("Result : Excellent !");
            }
            else if(marks>=300){
                System.out.println("Grade : A");
                System.out.println("Result : First Division !");
            }
            else if(marks>=225){
                System.out.println("Grade : B");
                System.out.println("Result : Second Division !");
            }
            else if(marks>=150){
                System.out.println("Grade : C");
                System.out.println("Result : Pass !");
            }
            else if(marks>=0 && marks<150){
                System.out.println("Grade : F");
                System.out.println("Result : Fail !");
            }
            else{
                System.out.println("Invalid Marks !");
            }
            System.out.println("===================");
            System.out.println("If you want to Continue, press 1 (yes) :");
            choice = sc.nextInt();
        }
        while(choice==1);
        sc.close();
    }
}