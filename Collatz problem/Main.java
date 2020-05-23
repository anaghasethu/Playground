#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n;
  cin>>n;
  cout<<n <<endl;
  int count=0;
 
    
  
  if((n%2)!=0 && (n!=1))
  {
  
    n=3*n+1;
    cout<<n <<endl;
    count+=1;
  }
    
  while ((n%2)==0)
  {
    n=n/2;
    cout<<n <<endl;
    count+=1;
    if(n==1)
    {
      break;
    }
    while((n%2)!=0)
  {
    n=3*n+1;
    cout<<n <<endl;
      count+=1;
    if(n==1)
    {
      break;
    }
    }
  }
 
 cout<<count;
}
