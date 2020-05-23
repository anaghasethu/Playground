    #include <iostream>
    #include<math.h>
    using namespace std;
    
    int main()
    {
      int num1,num2;
      cin>>num1;
      cin>>num2;
      int sum=0,p,i;
      for( i=num1;i<=num2;i++)
      {
       p=1;
        while(p<=(i/2))
        {
         if( i % p ==0)
         {
          sum = sum + p; 
         }
         p++;
        }
        if(sum == i)
          cout<<i<<" ";
        sum=0;
      
      }
    }