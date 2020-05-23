#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=1;
  cin>>n;
  int sum=0;
  int s=0;
  
  while(n!=0)
  {
    if(c%2==0)
    {
      sum=sum+n%10;
      n=n/10;
      c++;
    }
    else
    {
      s=s+n%10;
      n=n/10;
      c++;
    }
  }
  if(sum==s)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}