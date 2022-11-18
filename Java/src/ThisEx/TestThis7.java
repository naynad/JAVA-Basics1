package ThisEx;


class Student{  
int rollno;  
String name,course;  
float fee;  


Student(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  

}  


Student(int rollno,String name,String course,float fee)
{  
this(rollno,name);//reusing constructor  
//this.rollno=rollno;  
//this.name=name;  
//this.course=course;
this.course=course;  
this.fee=fee;  
}  


void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis7{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit");  
Student s2=new Student(112,"sumit","java",6000f);  
s1.display();  
s2.display();  
}}  

