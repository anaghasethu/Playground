#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,profit=0;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
 
  profit=((b*a)-(c*a))-100;
  std::cout<<profit;
}