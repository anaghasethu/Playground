#include<iostream>
#include<string.h>
using namespace std;
char *My_rev(char *);
int main() 
{ 
//Type your code here
  char My_string[20];
    gets(My_string); 
    My_rev(My_string);
    cout<<My_string;
    return 0;
}
char *My_rev(char *str)
{
  int i,count=0,n;
  char temp;
  count=strlen(str);
  n=count-1;
  count = strlen(str)-1;
  for( i=0;i<count;i++,count--)
  {
   temp=str[i];
    str[i]=str[count];
    str[count]=temp;
  }
  return str;
}