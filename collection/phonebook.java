package collection;

import java.util.*;



public class phonebook
{ String name;
int no;



public phonebook(String name, int no)
{
super();
this.name = name;
this.no = no;
}


@Override
public String toString()
{
return "phonebook [name=" + name + ", no=" + no + "]";
}

public static void main(String[] args)
{
phonebook p=new phonebook("jhon",171);
phonebook p1=new phonebook("akash",985);
phonebook p2=new phonebook("vijay",98745);
phonebook p3=new phonebook("roy",6975);

LinkedList<phonebook> l=new LinkedList<phonebook>();
l.add(p);
l.add(p1);
l.add(p2);
l.push(p3);
Iterator<phonebook> i=l.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}



}}