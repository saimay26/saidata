class Student1
{
int id;
String name;
Student1(int id,String name)
{
this.id=id;
this.name=name;
System.out.println(id+" "+name);
}
public static void main(String args[])
{
//Student1 sdt1=new Student1();
Student1 sdt2=new Student1(10,"abc");
Student1 sdt3=new Student1(10,"def");
}
}
