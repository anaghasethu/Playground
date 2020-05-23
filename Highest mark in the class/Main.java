#include<iostream>
int main()
{
  // Type your code here
  int n;
  int arr[100];
  int max=arr[0];
  int i;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
   std::cin>>arr[i]; 
  }
  for(i=0;i<n;i++)
  {
   if(arr[i]>max)
     max=arr[i];
  }
  std::cout<<max;
}