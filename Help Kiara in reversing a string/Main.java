#include <iostream>
#include<string.h>
int main()
{
char str[100],temp;     
int count = 0, end, i;    
//Your code goes here  
 gets(str);
 count = strlen(str)-1;
  for( i=0;i<count;i++,count--)
  {
   temp=str[i];
    str[i]=str[count];
    str[count]=temp;
  }
std::cout<<str;
}