#include<iostream>
int main()
{
 int a,i;
  int n=11;
  int b=0;
 std::cin>>a;
 for(i=0;i<a;i++)
 {
  
  b=(n+4*i)*(n+4*i); 
   std::cout<<b<<" ";
 }
}