// run time polymorphism
class  Animal
{
public void move()
{
System.out.println("Call From Animal class");
}
}
class  Wild extends  Animal
{
public void move()
{
System.out.println(" Call From Wild class");
}
}
class  Pet extends  Wild
{
public void move()
{
System.out.println("Call From  pet class");
}
}
class Test23
{
public static void main(String args[])
{
Animal a=new Animal();
Animal w=new Wild();
Animal p=new Pet();
a.move();
w.move();
p.move();
}
}
