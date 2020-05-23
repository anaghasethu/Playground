#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,odds=0;
  int x=1;
  float score=0;
  while(x>0 && odds!=3)
  {
   cin>>x;
    if(x%2==1 && x>0)
    {
     score+=1 ;
     odds++;
    }
    else if(x>0 && x%2==0)
    {
      score-=0.5;
    }
    else
      score--;
  }
  cout<<score;
}