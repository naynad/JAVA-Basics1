package PolymorphismDemo;

class Shape
{  
void draw()
{
	System.out.println("drawing...");}  
}  

class Rectangle extends Shape
{  
void draw()
{
	System.out.println("drawing rectangle...");}  
}  

class Circle extends Shape
{  
void draw()
{
	System.out.println("drawing circle...");}  
} 

class Triangle extends Shape
{  
void draw()
{
	System.out.println("drawing triangle...");}  
}  


class PolyDemo2
{  
public static void main(String args[]){  
 
Rectangle r=new Rectangle();  
r.draw();


Circle c=new Circle();  
c.draw(); 


Triangle t=new Triangle();  
t.draw();  
}  
}  

