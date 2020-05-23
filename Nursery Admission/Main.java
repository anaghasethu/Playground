#include<iostream>
#include<string.h>

using namespace std;
int main()
{
  //Type your code here.
  char a[10];
  int n=0;
  gets(a);
  while(a[n] != '\0')
  {
   n++;
  }
  cout<<"The number of letters in the name is "<<n;
}