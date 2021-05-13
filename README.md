.Java MGR Creation
It is a program with a business logic and real entity.
In Business logic we have given the properties like name,age,salaryand designation of Manager.
First i created a class 
class MGR{
//In this project I am declaring the  variables are
Sting name,design;
int age,sal;
//I take Scanner class to read the dynamic inputs
Scanner t=new Scanner(System.in);
//In this project,I am using the methods are read,display,raise and main methods

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
//which is used to read the inputs like name,age,salary and designation at runtime.
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+sal);
System.out.println("Designation:"+design);
}
//display() which is used to display the outputs like name,age,salary and designation.
void raise()
{
sal=sal/1000;
System.out.println("Salary Raised....");
}
//raise() which is used to increement  the salary then shows salary is raised.
}
//then i take public class
public class Manager{
public static void main(String[] args){
Scanner t=new Scanner(System.in);
MGR m=new MGR();
// here i created object for Manager class
then i take 1 integer which is c  for the cases in switch
then I take do while loop
do{
System.out.println("\n1.Create");
System.out.println("2.Display");
System.out.println("3.Raised Salary");
System.out.println("4.Exit");
System.out.println("Entr your choice");
//in this loop i am creating the employee details when we enter your choice 1
 enter your name
mahi
enter age
22
enter salary
25000
enter design
ase
enter your choice 
4
exit
c=t.nextInt();
switch(c){
case 1:m.read();//reading the inputs
        b=true;
        break;
case 2: if(b)
       m.display();// it will display the output when data should present
       else
       System.out.println("\nNo data...");//otherwise it prints no data
case 3: if(b)
      m.raise();//salary raised
       else
       System.out.println("\nNo data...");
         }
}
while(c<4)
;//upto the condition the loop will works otherwise it terminates from the loop
}
}



