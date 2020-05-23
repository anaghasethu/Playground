#include <iostream> 
using namespace std; 
int* insertX(int n, int arr[],  int x, int pos) 
{ 
    int i;     n++; 
    for (i = n; i >= pos; i--) 
		 arr[i] = arr[i - 1]; 
       arr[pos - 1] = x; 
 return arr; 
} 
int main() 
{ 
    int i, x, pos, n = 10; 
    std::cout<<"Enter the number of elements in the array \n";
    std::cin>>n;
    int arr[n];
    std::cout<<"Enter the elements in the array \n";
  for (i = 0; i <n; i++) 
        std::cin>>arr[i]; 
   std::cout<<"Enter the location where you wish to insert an element \n";
  std::cin>>pos;
  if(pos>n)
  {
    std::cout<<"Invalid Input \n";
    exit(0);
  }
  else
  {
   std::cout<<"Enter the value to insert \n";
   std::cin>>x;insertX(n, arr, x, pos); 
   std::cout<<"Array after insertion is\n";
    for (i = 0; i < n + 1; i++) 
        cout << arr[i] << "\n"; 
  }return 0; 
} 