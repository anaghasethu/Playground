#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,y;
  std::cin>>b;
  std::cin>>y;
  if(y<b)
  {
    b=100-b;
    a=b+y;
    std::cout<<a;
  }
  else
  {
  std::cout<<y-b;
  }
}