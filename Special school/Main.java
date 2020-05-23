#include<iostream>

#include<cstring>
using namespace std;
int main()
{
 char a[100];
  char b[100];
  gets(a);
  gets(b);
  char temp;
  int count=0;
  count = strlen(a)-1;
  for(int i=0;i<count;i++,count--)
  {
   temp=a[i];
    a[i]=a[count];
    a[count]=temp;
  }
  if (strcmp(a,b)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}