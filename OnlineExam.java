
import java.util.Scanner;


public class OnlineExam {


Scanner sc = new Scanner(System.in);
String username = "Apurba";
int password =5678;

//login
void login() {

System.out.println("\tWELCOME TO ONLINE EXAM PORTAL!!!");

//taking username
System.out.print("Enter username:");
username = sc.next();

//taking user password
System.out.print("Enter your password:");
password = sc.nextInt();

if (username.equals("Apurba") && password ==5678) {
System.out.println("Login Successful");
menu();
} else {
System.out.println("Login failed, try again!!");
login();
}

}
public void menu() {
int Choice;
System.out.println("===User Menu===");
System.out.println("1.Update Profile \n 2.Write Exam \n 3.Exit ");
System.out.println("Enter The Choice: ");
Choice = sc.nextInt();
switch(Choice) {
case 1:
Update_Details();
break;
case 2:
examination();

break;
case 3:
//closing session
System.out.println("Thanks For Using!!!");
System.exit(0);
break;
default:
System.out.println("Enter valid choice.");
}
}


//update profile and password
public void Update_Details(){
String update_name;
int update_pwd;
System.out.println("Update profile and password ");
System.out.println("Enter The Username: ");
update_name = sc.next();
if(update_name.equals(username)) {
System.out.println("Enter New Password for your Account");
update_pwd = sc.nextInt();
username = update_name;
password=update_pwd;


System.out.println("Updated Your Details Successfully....");
}
else {
System.out.println("Enter The Correct UserName");
}
menu();
}

public void examination() {

int ans;
int score=0;
long start_time=System.currentTimeMillis();
long end_time=start_time+30;


//timer and auto submit
while(System.currentTimeMillis()<end_time)
{
System.out.println("You have 10 quetions and time limit is 20 minutes");
System.out.println("");
System.out.println("Each question is for 5 marks and negative marking is there...");
System.out.println("");

System.out.println("****Now answer the following questions: ****");
System.out.println();

//selecting answers for MCQs
//1
System.out.println("Q1. In which process, a local variable has the same name as one of the instance variables?");
System.out.println("1)Serialization"+"\t"+"2)Variable Shadowing"+"\t"+"3)Abstraction"+"\t"+"4)Multi-threading");

System.out.println("Enter your ans: ");
ans=sc.nextInt();
System.out.println("----your Answer is saved----");

if(ans==2)
{
score=score+5;
}
else
{
score--;
}

System.out.println();

//2.

System.out.println("Q2. An interface with no fields or methods is known as a ______.");
System.out.println("1)Runnable Interface"+"\t"+"2) Marker Interface"+"\t"+"3)Abstract Interface"+"\t"+"4)CharSequence Interface");

System.out.println("Enter your ans: ");
ans=sc.nextInt();
System.out.println("----your Answer is saved----");

if(ans==2)
{
score=score+5;
}
else
{
score--;
}

System.out.println();


//3.

System.out.println("Q3. Output of Math.floor(3.6)?");
System.out.println("1)3"+"\t"+"2) 3.0"+"\t"+"3)4"+"\t"+"4)4.0");

System.out.println("Enter your ans: ");
ans=sc.nextInt();
System.out.println("----your Answer is saved----");

if(ans==2)
{
score=score+5;
}
else
{
score--;
}
System.out.println();


//4

System.out.println("Q4. Exception created by try block is caught in which block");
System.out.println("1)catch"+"\t"+"2)throw"+"\t"+"3)final"+"\t"+"4)none");

System.out.println("Enter your ans: ");
ans=sc.nextInt();
System.out.println("----your Answer is saved----");

if(ans==1)
{
score=score+5;
}
else
{
score--;
}

System.out.println();


//5

System.out.println("Q5. Identify the incorrect Java feature.");
System.out.println("1)Object oriented"+"\t"+"2)Use of pointers "+"\t"+"3)Dynamic"+"\t"+"4)Architectural neutral");

System.out.println("Enter your ans: ");
ans=sc.nextInt();
System.out.println("----your Answer is saved----");

if(ans==2)
{
score=score+5;
}
else
{
score--;
}

break;
}
System.out.println();


//6.

System.out.println("Q6. Automatic type conversion is possible in which of the possible cases?");
System.out.println("1)Byte to int"+"\t"+"2) Int to long"+"\t"+"3)Long to Int"+"\t"+"4)4.Short to int");

System.out.println("Enter your ans:");
ans=sc.nextInt();
System.out.println("----Your Answer is Saved----");

if(ans==2)
{
score=score+5;
}
else
{
score--;
}
System.out.println();


//7.

System.out.println("Q7. Arrays in java are-?");
System.out.println("1)Object references"+"\t"+"2)Objects"+"\t"+"3)Primitive Data Type"+"\t"+"4)None");

System.out.println("Enter your ans:");
ans=sc.nextInt();
System.out.println("----Your Answer is Saved----");

if(ans==2)
{
score=score+5;
}
else
{
score--;
}
System.out.println();


//8.

System.out.println("Q8. To which of the following does the class string belongs?");
System.out.println("1)Java.lang"+"\t"+"2)Java.awt"+"\t"+"3)Java.applet"+"\t"+"4)Java.string");

System.out.println("Enter your ans:");
ans=sc.nextInt();
System.out.println("----Your Answer is Saved----");

if(ans==1)
{
score=score+5;
}
else
{
score--;
}
System.out.println();


//9.

System.out.println("Q9. Identify the modifier which cannot be used for constructor.");
System.out.println("1)Object references"+"\t"+"2)Objects"+"\t"+"3)Primitive Data Type"+"\t"+"4)None");

System.out.println("Enter your ans:");
ans=sc.nextInt();
System.out.println("----Your Answer is Saved----");

if(ans==4)
{
score=score+5;
}
else
{
score--;
}
System.out.println();


//10.

System.out.println("Q10. When is the finalize() method called?");
System.out.println("1)Before garbage collection"+"\t"+"2)Before an object goes out of scope"+"\t"+"3)Before a variable goes out of scope"+"\t"+"4)None");

System.out.println("Enter your ans:");
ans=sc.nextInt();
System.out.println("----Your Answer is Saved----");

if(ans==1)
{
score=score+5;
}
else
{
score--;
}
System.out.println();

System.out.println("You have Finished the Exam!!!");
System.out.println();
System.out.println("Congratulations!!!");
System.out.println();
System.out.println("*****Your Score is "+""+score+"/50"+"*****");
System.out.println();

menu();

}

public static void main(String[] args) {

OnlineExam e1 =new OnlineExam();
e1.login();

}

}
