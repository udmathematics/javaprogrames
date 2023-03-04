import java.util.*;
class EnumerationDemo 
{
public static void main(String[] args) 
{
ArrayList al = new ArrayList();
for (int i = 0;i<=10 ;i++ )
{
al.add(i);
}
System.out.println(al);
Enumeration e = al.ArrayList();
while(e.hasMoreElements())
{
Integer i = (Integer)e.nextElement();
if(i %2==0)
{
System.out.println(i);
}
else
{
System.out.println(i+"will be removed");
al.remove(i);
System.out.println(al);
}
}
System.out.println(al);
}
}