import java.util.Scanner;
class MGR
{
String name,design;
int age,sal;
Scanner t=new Scanner(System.in);

void read(){
System.out.println("\nEnter Name");
name=t.next();
System.out.println("Enter Age");
age=t.nextInt();
System.out.println("Enter Salary");
sal=t.nextInt();
System.out.println("Enter designation");
design=t.next();
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+sal);
System.out.println("Designation:"+design);
}
void raise()
{
sal=sal/1000;
System.out.println("Salary Raised....");
}
}
public class Manager{
public static void main(String[] args){
Scanner t=new Scanner(System.in);
MGR m=new MGR();
int c;
boolean b=false;
do{
System.out.println("\n1.Create");
System.out.println("2.Display");
System.out.println("3.Raised Salary");
System.out.println("4.Exit");
System.out.println("Entr your choice");
c=t.nextInt();
switch(c){
case 1:m.read();
        b=true;
        break;
case 2: if(b)
       m.display();
       else
       System.out.println("\nNo data...");
case 3: if(b)
      m.raise();
       else
       System.out.println("\nNo data...");
         }
}
while(c<4);
}
}


         

