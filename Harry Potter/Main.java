#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,m,add=0;
  int n;
  std::cin>>n;
  s=n%10;
  m=n/1000;
  add=s+m;
  std::cout<<add;
}