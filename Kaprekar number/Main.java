#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n,m;
  cin>>n;
  m=n*n;
  int sum=0;
 int s=0;
  if(m>1000)
  {
    sum=m%100;
    s=m/100;
    
}
  else if(m<10)
  {sum=m;
  }
  else if(m<100)
  {
    sum=m%10;
    s=m/10;
  }
  if((sum+s)==n)
  {
    cout<<"Kaprekar Number";
  }
  else
  {
    cout<<"Not a Kaprekar Number";
  }
}