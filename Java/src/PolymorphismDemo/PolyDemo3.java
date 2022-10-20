package PolymorphismDemo;

class Animal
{  
void eat(){System.out.println("eating...");}  
}  


class Dog extends Animal
{  
void eat(){System.out.println("eating bread...");}  
}  


class Cat extends Animal
{  
void eat(){System.out.println("eating rat...");}  
}  

class Lion extends Animal
{  
void eat(){System.out.println("eating meat...");}  
}  


class PolyDemo3{  
public static void main(String[] args){  
  
Dog d=new Dog();  
d.eat();


Cat c=new Cat();  
c.eat();  


Lion l=new Lion();  
l.eat();  
}} 


