//COLLECTION FRAME WORKS
import java.util.*;
class CollectionFrame
{
public static void main(String args[])
{
Stack<String> stack=new Stack<String>();
stack.add("yasasree");
stack.add("nadiya");
stack.add("chandana");
stack.add("geethika");
stack.add("roshini");
stack.pop();
Iterator<String>itr=stack.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}