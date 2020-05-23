#include<iostream>
int main()
{
 int a,i;
  float n=0.5;
 std::cin>>a;
 if( a==1)
 {
  std::cout<<n;
 }
  else
  {
 for(i=0;i<a;i++)
 {
   std::cout<<n<<" ";
   n=n*3;
   
 } 
  }
}