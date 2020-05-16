#include<iostream>

using namespace std;

int main()

{

  //Type your code here.

  int i,j,m,n,temp;

  cin>>m>>n;

  int a[m][n];

  for(i=0;i<m;i++)

  {

    for(j=0;j<n;j++)

    {

      cin>>a[i][j];

    }

  }

  temp=a[0][0];

  for(i=0;i<m;i++)

  {

    for(j=0;j<n;j++)

    {

      if(temp<a[i][j])

      {

        temp=a[i][j];

      }

    }

  }

  cout<<"The maximum element is "<<temp;

  return 0;

}
