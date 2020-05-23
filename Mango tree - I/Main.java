#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y>>z;
  if(z%y==0 || z<=x || (z-1)%x==0)
    cout<<"Yes";
  else
     cout<<"No"; 
  
}