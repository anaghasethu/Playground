#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,n,sum=0;
  cin>>n;
  u=n;
  while (n != 0) 
    { 
     sum = sum + n % 10; 
     n = n/10; 
    }  
  int k;
  k= u%sum;
 
  if( k == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}