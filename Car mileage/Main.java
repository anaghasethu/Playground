#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int l,d;
  int ds;
  std::cin>>m;
  std::cin>>l;
  std::cin>>d;
  ds=l*m;
  if(ds <= d)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
}