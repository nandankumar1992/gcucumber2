package steps;

public class Reverse{
public static String reverseword(String str)
{
String words[]=str.split("\\s");
String reverseword="";
for(String w:words)
{
StringBuilder sb=new StringBuilder(w);
sb.reverse();
reverseword+=sb.toString()+" ";
}
return reverseword.trim();
}
public static void main(String args[])
{
System.out.println(reverseword("my name is nandan"));
}}