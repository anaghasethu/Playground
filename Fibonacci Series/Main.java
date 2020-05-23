#include<iostream>
using namespace std; 
int fib(int n) 
{ 
  int dp[n+1];
  dp[1]=0; // Base Case
  dp[2]=1; // Base Case
  for(long i=3;i<=n;i++)
      dp[i]=dp[i-1]+dp[i-2];
            
    return dp[n];
} 
int main()
{
  //Type your code here.
	int n;
    cin>>n;
	cout <<"The term "<<n<<" in the fibonacci series is "<< fib(n); 
} 

