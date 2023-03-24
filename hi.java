import java.util.Scanner;
class studentInformation {
  

    // using constructor
//     studentInformation(int rollno,String className,String name,String address){

//   this.Rollno=rollno;
//   this.address=address;
//   this.className=className;
//   this.name=name;
//   System.out.println(this.Rollno+"\n"+this.className+"\n"+this.name+"\n"+this.address);
//     }
    int Rollno;
    String address;
    String className;
    String name;
    
}
class mahesh{
    int a;
}

public class hi {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
         studentInformation[] std = new studentInformation[20];

         

             for (int i = 0; i < 5; i++) {
                std[i]=new studentInformation();
            System.out.print("enter rollno:");
            std[i].Rollno = sc.nextInt();
            System.out.print("enter a class:");
            std[i].className = sc.next();
            System.out.print("enter name:");
            std[i].name = sc.next();
            System.out.print("enter a address");
            std[i].address=sc.next();

        }
        System.out.println("rollNo\tclass\tname\taddress");
        for(int i=0;i<5;i++){
            System.out.println("\t"+std[i].Rollno +"\t"+std[i].className +"\t"+std[i].name+"\t"+std[i].address);
        }

    }


    }

