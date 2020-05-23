#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[7],i,s=0,k=0;
  for(i=0;i<7;i++)
  {
    cin>>a[i];
    k+=a[i];
  }
  for(i=0;i<7;i++)
  {
    s+=a[i]*100;
    if(i==0)
    {
      s+=a[0]*50;
      continue;
    }
    if(i==6)
    {
      s+=a[6]*25;
      continue;
    }
    if(k==40)
      s+=(k-40)*25;
    if(a[i]>8)
      s+=(a[i]-8)*15;
  }
  cout<<s;
}