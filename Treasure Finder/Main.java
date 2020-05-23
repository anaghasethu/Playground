#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y>>z;
  if((x>y && z>x) || (x>z && y>x))
  {
    cout<<"The treasure is in box which has number "<<x<<"\n";
  }
   else if((y>x && z>y) || (y>z && x>y))
   {
      cout <<"The treasure is in box which has number "<<y<<"\n";
   }
  else
  {
    cout<<"The treasure is in box which has number "<<z<<"\n";
  }
  if(((y%x) == 0) && (z%x) == 0)
    cout<<"The code to open the box is "<<x;
  else if(((x%y) == 0) && (z%y) == 0)
    cout<<"The code to open the box is "<<y;
  else if(((x%z) == 0) && (y%z) ==0)
    cout<<"The code to open the box is "<<z;
  else
    cout<<"The code to open the box is 1";
}