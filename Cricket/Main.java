#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  float r,s,m,o;
  int v,b;
  std::cin>>b;
  std::cin>>r;
  std::cin>>s;
  std::cin>>v;
  m=(b)/6;
  int n=(v/6);
  float k = n+0.1*(v%6);
  std::cout<<m<<"\n";
  std::cout<<k<<"\n";
  std::cout<<fixed<<setprecision(1)<<(s/k)<<"\n";
  std::cout<<(r/m)<<"\n";
  if( r/m <s/k)
    std::cout<<"Eligible to Win";
   else
     std::cout<<"Not Eligible to Win";
}
