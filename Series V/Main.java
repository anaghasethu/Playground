#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int i;
  int s=0;
  int a=11;
  for(i=0;i<n;i++)
  {
    s=(a+4*i)*(a+4*i);
    cout<<s<<" ";
  }
}