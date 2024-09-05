import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float percentage;
        int sum=0;
        int count=0;

        System.out.print("Enter the number of Subject: ");
        int Subject=sc.nextInt();

        for (int i =1;i<=Subject;i++){
            System.out.printf("Enter marks in subject %d out of 100: ",i);
            int marks=sc.nextInt();

            if(marks<0 || marks>100){
                System.out.println("Invalid enter");
                System.out.println("Enter your marks Again!");
                System.out.printf("Enter marks in subject %d out of 100: ",i);
                marks=sc.nextInt();

            }

            sum+=marks;
            count++;
        }
        int x=count*100;
        System.out.printf("totalMarks out of %d obtained: %d",x,sum);
        System.out.println();

        percentage=(float)sum/x*100;
        System.out.println("Percentage: "+percentage+"%");

        if(percentage>=90){
            System.out.println("Grade: O ");
        }
        else if(percentage>85 && percentage<=89){
            System.out.println("Grade: A++ ");

        }
        else if(percentage>=80 && percentage<=85){
            System.out.println("Grade: A ");

        }
        else if(percentage>=75 && percentage<=79){
            System.out.println("Grade: B++ ");

        }
        else if(percentage>=70 && percentage<=74){
            System.out.println("Grade: B ");

        }
        else if(percentage>=60 && percentage<=69){
            System.out.println("Grade: C ");

        }
        else if(percentage>=40 && percentage<=59){
            System.out.println("Grade: D ");

        }
        else{
            System.out.println("Grade: F");
        }

    }
}

