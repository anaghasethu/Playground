#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[100];
  char b[100];
  gets(a);
  gets(b);
  if (strcmp(a,b)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}