#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  float y=13.30;
  std::cin>>age;
  std::cin>>time;
  if( age > 13)
  {
   if( time == y)
     std::cout<<"$5.00";
    else
      std::cout<<"$8.00";
  }
  else
  {
   if( time == y)
     std::cout<<"$2.00";
    else
      std::cout<<"$4.00";
  }
}