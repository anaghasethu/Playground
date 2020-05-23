#include<iostream>

using namespace std;
int main()
{
  //Type your code here.
  int famt,fdis,fchr;
  int samt,sdis,schr;
  int aamt,adis,achr;
  std::cin>>famt;
  std::cin>>fdis;
  std::cin>>fchr;
  std::cin>>samt;
  std::cin>>sdis;
  std::cin>>schr;
  std::cin>>aamt;
  std::cin>>adis;
  std::cin>>achr;
  
  int f,s,a;
  f=(famt-(famt*fdis)/100)+fchr;
  s=(samt-(samt*sdis)/100)+schr;
  a=(aamt-(aamt*adis)/100)+achr;
  
  std::cout<<"In Flipkart Rs."<<f<<"\n";
  std::cout<<"In Snapdeal Rs."<<s<<"\n";
  std::cout<<"In Amazon Rs."<<a<<"\n";
  int smallest = f;

  if (f < smallest)
    smallest=f;
  if (s < smallest)
    smallest=s;
  if(a < smallest)
    smallest=a;

 if(smallest == f)
   std::cout<<"He will prefer Flipkart";
  else if(smallest == s)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}