#include<iostream>
int main(){
  // Type your code here
  int n,i;
  int fact=1;
  std::cin>>n;
  if(n==0)
    std::cout<<"1";
  else
  {
   for(i=1;i<=n;i++)
   {
     fact=fact*i;
   }
    std::cout<<fact;
  }
}