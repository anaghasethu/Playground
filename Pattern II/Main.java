#include<iostream>
using namespace std;
int main(){
  int n,i,j,x,a=1;
  cin>>n;
  x=n*(n+1)/2;
  for(i=0;i<n;i++)
  {
    if(i==0)
      cout<<a<<endl;
    else if(i%2!=0)
    {
      for(j=0;j<=i;j++)
        a++;
      for(j=0;j<=i;j++){
        if(j==i)
        {
          cout<<a<<endl;
          break;
        }
        cout<<a<<"*";
        a--;
      }
      for(j=0;j<=i;j++)
        a++;
    }
    else
    {
      for(j=0;j<=i;j++)
      {
        if(j==i)
        {
          cout<<a<<endl;
          break;
        }
        cout<<a<<"*";
        a++;
      }
    }
  }
}