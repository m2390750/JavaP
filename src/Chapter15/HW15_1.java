package Chapter15;

class Sort
{
public void bubbleSort(double data[]) // ��w�ƧǨ��
{
int i,j;
boolean flag=true;
double temp;
for(i=1;(i<data.length)&&(flag==true);i++)
{
flag=false; // �N flag �]�� false
for(j=0;j<(data.length-i);j++)
if(data[j]>data[j+1])
{
temp=data[j]; // �ﴫ�}�C������
data[j]=data[j+1];
data[j+1]=temp;
flag=true; // ��ի�N flag �]�� true
}}}

public void quickSort(double data[],int left,int right)
{
if(left<right)
{
int pivot=partition(data,left,right); // �M�w�����I
quickSort(data,left,pivot-1); // �N���b����ƱƧ�
quickSort(data,pivot+1,right); // �N�k�b����ƱƧ�
}
else
return;
}

public int partition(double data[],int left,int right) // ���Ψ��
{
int i=left+1,j=right;
double temp;
while(true)
{
while(data[i]<=data[left] && i<=right && i<data.length-1)
i++; // �ѥ��ӥk�M��>��ǭȪ� data[i]
while(data[j]>data[left])
j--; // �ѥk�ӥ��M��<=��ǭȪ� data[j]
if(i<j)
{
temp=data[i]; // data[i]�P data[j]�洫
data[i]=data[j];
data[j]=temp;
}
else
break;
}
temp=data[left]; // data[j]�P��ǭ� data[left]�洫
data[left]=data[j];
data[j]=temp;
return j; // �Ǧ^�����I
}

public void show(double data[])
{
for(int i=0;i<data.length;i++)
System.out.print(data[i]+" ");
System.out.println();
}}

public class HW15_1
{}
