#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit;
  int a,b,c,d;
  std::cin>>unit;
  a=unit*0.5;
  b=unit*0.65+100;
  c=unit*0.8+200;
  d=unit*1.25+425;
  if(unit <= 200)
  {
    std::cout<<"Rs."<<a;
  }
  else if(unit <= 400)
  {
    std::cout<<"Rs."<<b;
  }
  else if(unit >= 600)
  {
    std::cout<<"Rs."<<c;
  }
  else{
    std::cout<<"Rs."<<d;
  }
}