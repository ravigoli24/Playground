#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
cin>>a;
  float t;
cin>>t;
  if(a>13 && (t>12.0 && t<17.0))
cout<<"$5.00";
  else if(a>13)
cout<<"$8.00";
  else if(a<=13 && (t>12.0 && t<17.0))
cout<<"$2.00";
  else
cout<<"$4.00";
  return 0;

}
