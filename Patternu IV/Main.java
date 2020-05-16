#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int a,i,j,c=0;
cin>>a;
  for(i=1;i<a+1;i++)
  {
    if(i%2!=0)
    {
c++;
      for(j=1;j<a;j++)
      {
cout<<c;
      }
c++;
cout<<c<<"\n";
    }
    else
    {
c++;
cout<<c--;
      for(j=1;j<a;j++)
      {
cout<<c;
      }
cout<<"\n";
    }
  }
    return 0;
}
