#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n;
  cin>>n;
  int a=1,res,d=1;
  for(int i=0;i<n;i++)
  {
   res=a*a-d;
   cout<<res<<" ";
   a++;
   if( d==1)
     d=2;
   else
     d=1;
  }
}