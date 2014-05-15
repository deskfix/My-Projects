#include <iostream>
 
using namespace std;
 
int main()
{
  int something;
 
  cout<<"Please enter a number: ";
  cin>> something;
  cin.ignore();
  cout<<"You entered: "<< something <<"\n";
  cin.get();
}
