#include <iostream>
int main() 
{
	// Type your code here
  int n;
  int m=0;
  std::cin>>n;
  while(n!=0)
  {
  m=m*10;
  m=m+n%10;
  n=n/10;
   
  }
   std::cout<<m;
	return 0;
}