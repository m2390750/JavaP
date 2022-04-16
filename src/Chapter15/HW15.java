package Chapter15;

import java.io.*;

public class HW15
{
public static void main(String args[]) throws IOException
{
double a[]={2.14,7.148,0.236,5.98568,3.012};
double b[]={2.14,7.148,0.236,5.98568,3.012};
Sort obj1=new Sort();
obj1.show(a);
obj1.bubbleSort(a);
obj1.show(a);
obj1.show(b);
obj1.quickSort(b,0,(b.length-1));
obj1.show(b);

FileWriter fw1=new FileWriter("c:\\java\\qsort.txt");
FileWriter fw2=new FileWriter("c:\\java\\bsort.txt");
BufferedWriter bfw1=new BufferedWriter(fw1);
BufferedWriter bfw2=new BufferedWriter(fw2);
for(int i=0;i<100000;i++)
{
String str=Double.toString(Math.random()*10000.);
bfw1.write(str);
bfw1.newLine();
bfw2.write(str);
bfw2.newLine();

}
bfw1.flush();bfw2.flush();
fw1.close();fw2.close();

FileWriter fw3=new FileWriter("c:\\java\\qresult.txt");
FileWriter fw4=new FileWriter("c:\\java\\bresult.txt");
FileReader fr1=new FileReader("c:\\java\\qsort.txt");
FileReader fr2=new FileReader("c:\\java\\bsort.txt");
BufferedWriter bfw3=new BufferedWriter(fw3);
BufferedWriter bfw4=new BufferedWriter(fw4);
BufferedReader bfr1=new BufferedReader(fr1);
BufferedReader bfr2=new BufferedReader(fr2);
int i=0;
double c[]=new double[100000];
double d[]=new double[100000];
String str;
while((str=bfr1.readLine())!=null)
{
c[i]=Double.parseDouble(str);
i++;
}
fr1.close();
obj1.quickSort(c,0,(c.length-1));
for(i=0;i<c.length;i++)
{
bfw3.write(Double.toString(c[i]));
bfw3.newLine();
}
bfw3.flush();
fw3.close();

i=0;
while((str=bfr2.readLine())!=null)
{
d[i]=Double.parseDouble(str);
i++;
}
fr2.close();
obj1.bubbleSort(d);
//¦h°õ¦æºü 15-25

for(i=0;i<d.length;i++)
{
bfw4.write(Double.toString(d[i]));
bfw4.newLine();
}
bfw4.flush();
bfw4.close();
}
}