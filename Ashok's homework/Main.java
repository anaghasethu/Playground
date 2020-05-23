#include<iostream>
int main()
{
    // Type your code here
  int r, c;
    std::cin>>r>>c;
    int a1[10][10],a2[10][10];
   for( int i=0;i<r;i++)
   {
    for( int j=0;j<c;j++)
    {
     std::cin>>a1[i][j]; 
    }
   }
  for( int i=0;i<r;i++)
   {
    for( int j=0;j<c;j++)
    {
     std::cin>>a2[i][j]; 
    }
   }
  for( int i=0;i<r;i++)
   {
    for( int j=0;j<c;j++)
    {
     std::cout<<a1[i][j]+a2[i][j]<<" "; 
    }
    std::cout<<"\n";
   }
}