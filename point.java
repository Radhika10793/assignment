class A
{
public  int x,y;
public A(int x,int y)
{
this.x=x;
this.y=y;
}
}
class B extnds A
{
public int x,y;
public B()
{
this(0,0);
}}
public B(int x,int y)
{
super(x+1,y+1);
class constructor

this.x=x;
this.y=y;
}

public void print()
{
System.out.print("Base class:{"+x+","+y+"}");
System.out.println("Super class:{"+super.x+","+super.y+"}");
}

}
class point
{
public static void main(String args[])
{
B obj=new B();
obj.print();
obj=new B(1,2);
obj.print();
}
}

