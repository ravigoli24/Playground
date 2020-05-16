#include<iostream>

using namespace std;

int main()

{

//Type your code here.

  int a,b=0;

cin>>a;

cout<<a<<"\n";

while(a!=1)

  {



if(a%2==0)

    {

a=a/2;

b++;

    }

else

    {

a=3*a+1;

b++;

    }

cout<<a<<"\n";

  }

cout<<b;
}
