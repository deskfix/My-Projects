#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
float minutes,duration,charge,amount;
amount = 0.25;
cout<<"Insert the duration of the call - minimum 3 (in minutes):";
cin>>duration;
if (duration > 3)
{
minutes = duration - 3;
charge = minutes * 0.25;
amount = charge + amount;
cout<<amount<<endl;
cout<<"Call lasted for "<<duration<<" minutes. Call amount is "<<amount<<".";
}
else {
cout<<"wrong data";
}
getch();

}
