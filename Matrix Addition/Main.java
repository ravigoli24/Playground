
#include<iostream>

using namespace std;

int main()

{

  //Type your code here.

  int r,c,i,j,z;

  cin>>r>>c;

int a[r][c];

int b[r][c];

for(i=0;i<r;i++)

{

for(j=0;j<c;j++)

{

cin>>a[i][j];

}

}

  for(i=0;i<r;i++)

{

for(j=0;j<c;j++)

{

cin>>b[i][j];

}

}

for(i=0;i<r;i++)

{

for(j=0;j<c;j++)

{

  z=(a[i][j]+b[i][j]);

cout<<z<<" ";

}

cout<<"\n";

}

  return 0;

}

