
#include<iostream>

using namespace std;

int main()

{

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

  

  for(i=0;i<m;i++)

  {

    temp=a[i][0];

    for(j=1;j<n;j++)

    {

      if(temp<a[i][j])

      {

        temp=a[i][j];

      }

    }

    cout<<temp<<"\n";

  }

  return 0;

}
