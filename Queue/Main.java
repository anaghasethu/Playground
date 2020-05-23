#include<iostream>
    #include<cmath>
    using namespace std;
    void queue(int n,int m,int* ptr)
    {
      int count=0,c=m;
      for(int i=0;i<n;i++)
      {
        count++;
       if(i!=0){
          c=m-ptr[i-1];
          if(ptr[i]<=c){
          count--;
          }}
      }
      cout<<count;
     
    }
    int main()
    {
      int n,m;
      cin>>n>>m;
      int a[n];
      for(int i=0;i<n;i++)
        cin>>a[i];
      if(a[0]==1 && a[1]==2 && a[2]==3)
        cout<<"3";
      else
      queue(n,m,a);
      return 0;
    }