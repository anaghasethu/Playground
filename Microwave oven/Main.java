#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t,b;
  std::cin>>n;
  std::cin>>t;
  if( n==1)
    std::cout<<fixed<<setprecision(2)<<t;
  else if(n == 2)
  {float m = t+(0.50*t);
    std::cout<<fixed<<setprecision(2)<<m;}
  else if( n== 3)
  {b = 2*t;
    std::cout<<fixed<<setprecision(2)<<b;}
  else
    std::cout<<"Number of items is more";
}