#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c[10];
  int sum=0;
  int i;
  cin>>a;
  cin>>b;
  for(i=0;i<a;i++)
  {
   cin>>c[i]; 
  }
  for(i=0;i<a;i++)
  {
   sum=sum+c[i];
  }
  if( sum > b)
    cout<<"NO";
  else
    cout<<"YES";
}