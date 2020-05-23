#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>d;
   if( b+d >=100)
   {
     int x,y,z;
     x=(b+d)%100;
     z=(b+d)/100;
     y=a+c+z;
     cout<<y<<"\n";
     cout<<x;
   }
  else
  {
    cout<<a+c<<"\n";
    cout<<b+d;
          
  }
}