#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n;
  cin>>n;
  int x,i=0;
  int sum=0;
  while(sum<n){
    cin>>x;
    sum+=x;
    i++;
  }
  cout<<"The number of turns is "<<i;
}