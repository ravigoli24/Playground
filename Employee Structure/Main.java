#include<iostream>
using namespace std;
struct Employee
{
  int EmpId,age;
  float salary;
  char name[20], designation[20];
}emp;

int main()
{
  //Type your code here.
  cout<<"Enter name:";
  cin>>emp.name;
  cout<<"\nEnter ID:";
  cin>>emp.EmpId;
  cout<<"\nEnter age:";
  cin>>emp.age;
  cout<<"\nEnter designation:";
  cin>>emp.designation;
  cout<<"\nEnter Salary:";
  cin>>emp.salary;
  
  
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<emp.name;
  cout<<"\nID of the Employee : "<<emp.EmpId;
  cout<<"\nAge of the Employee : "<<emp.age;
  cout<<"\nDesignation of the Employee : "<<emp.designation;
   cout<<"\nSalary of the Employee : "<<emp.salary;
  return 0;
}