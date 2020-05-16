#include<iostream>
using namespace std;
void swap(int &,int &);
int main()
{
	int a,b;
	//cout<<"Enter Value Of A:";
	cin>>a;
//	cout<<"Enter Value of B:";
	cin>>b;
	cout<<"Before swapping a= "<<a<<" and b="<<b;
	swap(a,b);
	cout<<"\nAfter swapping a= "<<a<<" and b="<<b; 
}
void swap(int &a,int &b)
{
	int c;
	c=a;
	a=b;
	b=c;
//	cout<<"after swapping"<<a<<" "<<b;
}