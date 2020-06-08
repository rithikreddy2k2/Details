import java.util.*;
public class Employee {

    Scanner s=new Scanner(System.in);
    public String name(){
        System.out.println("Enter your name :");
       String name=s.next();
        return name;
    }
    public int year_of_joining(){
        System.out.println("Enter the year you joined this company :");
       int year=s.nextInt();
       return year;

    }
    public int salary(){
        System.out.println("Enter your Salary");
       int salary=s.nextInt();
       return salary;

    }
    public String adress(){
        System.out.println("Enter your adress");
       String adress=s.next();
       return adress;

    }


    public static void main(String[] args) {
        Employee e=new Employee();
        String[][] mat=new String[4][4];
        mat[0][0]="Name";
        mat[0][1]="Year";
        mat[0][2]="Salary";
        mat[0][3]="Adress";

        for (int i = 1; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if (j==0)
                  mat[i][j]=e.name();
                else if (j==1)
                  mat[i][j]= String.valueOf(e.year_of_joining());
                else if (j==2)
                   mat[i][j]= String.valueOf(e.salary());
                else
                  mat[i][j]=e.adress();
            }

        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4; j++) {

                System.out.print(mat[i][j]+'\t');

            }
            System.out.println();
        }

    }
}
