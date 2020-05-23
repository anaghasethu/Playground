#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n;
  cin>>n;
  int a=0;
  int b =1;
  int m = 0;
  for(int i=1;i<=n;++i)
  {
  if(i==1)
  {
    continue;
  }
  if(i==2)
  {
    continue;
  }
    m=a+b;
    a=b;
    b=m;
  }
    cout<<m;
}