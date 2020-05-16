#include<iostream>
using namespace std;
int main()
{
  int a,i,c=1;
cin>>a;
  for(i=1;i<a+1;i++)
  {
    if(i%2==0)
    {
      c=c+i;
      for(int j=1;j<=i;j++)
      {
cout<<c;
        if(j!=i)
        {
cout<<"*";
          c--;
        }  
      }
cout<<"\n";   
    }
    else
    {
        c=c+i-1; 
        for(int j=1;j<=i;j++)
      {
cout<<c;
        if(j!=i)
        {
cout<<"*";
c++;
        }  
      }
cout<<"\n";
    }
  }
  return 0;
}
