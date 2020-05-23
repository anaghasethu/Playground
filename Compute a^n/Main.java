#include<iostream>
using namespace std;
int pow(int a,int n)
{
  int power=1;
  for(int i=1;i<=n;i++)
  {
   power=power*a;
  }
  return power;
}
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>n;
  cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}