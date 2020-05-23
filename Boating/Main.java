#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wgt,ad,ch,sum;
  std::cin>>wgt;
  std::cin>>ad;
  std::cin>>ch;
  sum = (75*ad) + (30*ch);
  if(wgt >= sum)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
  
  
  }