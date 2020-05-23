#include <iostream>
using namespace std;
int main(){
  int n,j;
  cin>>n;
  int a=1;
  int d=n+n*(n-1)+1;
  int b=n+(n*(n-1)/2);
  int dif=n-1;
  for(int i=1;i<=n;i++){
    for(int k=1;k<=2*(i-1);k++){
      cout<<"-";
    }
    for(j=0;j<=(n-i);j++){
      cout<<a+j;
      
      cout<<"*";
    }
    for(j=0;j<=(n-i);j++){
      cout<<d+j;
      if(j==(n-i)){
         continue;
      }
         cout<<"*";
         }
    d-=dif;
    dif--;
    a+=j;
    cout<<"\n";
  }
}