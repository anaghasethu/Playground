#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
  if(z<=(x*y-x) && (z%(x+y) == 0))
     {
       std::cout<<"It is a mango tree";
     }
     else
       std::cout<<"It is not a mango tree";
}