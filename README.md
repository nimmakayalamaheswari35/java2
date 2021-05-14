# Manager Details
Simple Code written to take Manager details.


It is a program with a business logic and real entity.
In business logic we have given the properties like name,age,salary and designation of MGR.
Before creating the class in order for to take input from user we use Scanner class so importing Scanner is mandatory
        import java.util.Scanner;
##MGR CLASS
In MGR class all the Parameters(states) are declared.
String name;
           String design; 
          int name; 
           int age;
	   
	   
Input is taken from the user by using Scanner object.(t)
           Scanner t=new Scanner(System.in);



And the methods(behaviours) to create the employee details are 
read(),display(),raiseSal are defined as follows
**read()** 
   void read()
       {
        System.out.println("Enter Name:");
         name=t.next();
        System.out.println("Enter Age:");
								 age=sc.nextInt();
        System.out.println("Enter Salary:");
         sal=sc.nextInt();
									 System.out.println("Enter design:");
 design=t.next();
        }
	
	
This method is written(used) to get the details of Manager 
Like the name age,sal, design of the Manager by using the methods in Scanner class like 
            t.next();            ->for a string value(for example design & name here)
	   t.nextInt();         ->for integer value
					
					
					
						   
####display()	  
	
	
       void display()
         {
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         System.out.println("Salary:"+sal);
         System.out.println("Designation:"+design);
         }
									
									
									This method is gives/displays the record of the employee created bu using **MGR()** method.	 
	 
**raise**
      public void raise()
         {
         sal=sal/1000;
         System.out.println("Salary raised ");
         }
In this method the logic is written to make hike in salary by 1000. and the sal is displayed along with the message that the **Salary is raised**
**MAIN CLASS**
In the Main class.... variable choice is declared in order to give user the choice to choose the options
and a Boolen variable is declared.


  int c;
     boolean b=false;
    MGR m=null;
     
In the main method 
we make use of nextInt() of Scanner class to take users choice(integer format)
         
										
										
										
	1.Create
2.Display
3.Raise salary
4.Exit
Enter choice
are to be displayed as menu to the user so that the user can make a choice
that is kept in iterative statement for user felxibility and the choices are kept in switch case.



    do
    {
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
					
					
					
					
					
					In case 1 the MGR object is created and the user input is taken. The boolean value will become true when the use enters details.....
code is written in such a way that whenever the Manager details are created then only the display() and raise() are going to execute else it will simply show **no records**
OUTPUT:




D:\JAVA1\basics>![2021-05-14](https://user-images.githubusercontent.com/84019315/118269049-d6d43100-b4db-11eb-8271-5219724c62d6.png)


![2021-05-14 (2)](https://user-images.githubusercontent.com/84019315/118269578-8dd0ac80-b4dc-11eb-9a73-5ddcc111f779.png)
![2021-05-14 (3)](https://user-images.githubusercontent.com/84019315/118269683-ab057b00-b4dc-11eb-89aa-d65f88b68977.png)

