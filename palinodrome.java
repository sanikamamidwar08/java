import java.lang.*;
class palinodrome
{
public static void main(String args[])
{
String string="kayak";
boolean flag=true;
string=string.toLowerCase();
for(int i=0;i<string.length()/2;i++)
{
if(string.charAt(i)!=string.charAt(string.length()-i-1))
{
flag=false;
break;
}
}if(flag)
System.out.println("Given String is palinodrome");
else
System.out.println("Given String is not palinodrome");
}
}