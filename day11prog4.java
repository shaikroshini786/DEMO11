// run time polymorphism
class Person
{
public void move()
{
System.out.println("I am person");
}
}
class Faculty extends Person
{
public void move()
{
System.out.println("Faculty is person");
}
}
class Student extends  Faculty
{
public void move()
{
System.out.println("I am student");
}
}
class Test23
{
public static void main(String args[])
{
 Person a=new Person();
 Person b=new Faculty();
Person c=new Student();
a.move();
b.move();
c.move();
}
}
