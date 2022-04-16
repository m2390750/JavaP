package Chapter15;

class Sort
{
public void bubbleSort(double data[]) // 氣泡排序函數
{
int i,j;
boolean flag=true;
double temp;
for(i=1;(i<data.length)&&(flag==true);i++)
{
flag=false; // 將 flag 設為 false
for(j=0;j<(data.length-i);j++)
if(data[j]>data[j+1])
{
temp=data[j]; // 對換陣列內的值
data[j]=data[j+1];
data[j+1]=temp;
flag=true; // 對調後將 flag 設為 true
}}}

public void quickSort(double data[],int left,int right)
{
if(left<right)
{
int pivot=partition(data,left,right); // 決定分割點
quickSort(data,left,pivot-1); // 將左半部資料排序
quickSort(data,pivot+1,right); // 將右半部資料排序
}
else
return;
}

public int partition(double data[],int left,int right) // 分割函數
{
int i=left+1,j=right;
double temp;
while(true)
{
while(data[i]<=data[left] && i<=right && i<data.length-1)
i++; // 由左而右尋找>基準值的 data[i]
while(data[j]>data[left])
j--; // 由右而左尋找<=基準值的 data[j]
if(i<j)
{
temp=data[i]; // data[i]與 data[j]交換
data[i]=data[j];
data[j]=temp;
}
else
break;
}
temp=data[left]; // data[j]與基準值 data[left]交換
data[left]=data[j];
data[j]=temp;
return j; // 傳回分割點
}

public void show(double data[])
{
for(int i=0;i<data.length;i++)
System.out.print(data[i]+" ");
System.out.println();
}}

public class HW15_1
{}
