#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int a,b,i,j;
  cin>>a>>b;
  int x[a][b],y[a][b],z[a][b];
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
      cin>>x[i][j];
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
      cin>>y[i][j];
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
      z[i][j]=x[i][j]+y[i][j];
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
      cout<<z[i][j]<<" ";
    cout<<"\n";
  }
  return 0;
}