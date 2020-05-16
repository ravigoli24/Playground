#include <iostream>
using namespace std;
struct Student{
   char stuName[30];
   int stuRollNo;
   int stuAge;
};
Student getStudentInfo();
void printStudentInfo(Student);
int main(){
   Student s;
   s = getStudentInfo();
   printStudentInfo(s);
   return 0;
}
/* This function prompt the user to input student
 * details, stores them in structure members
 * and returns the structure
 */
Student getStudentInfo(){
   Student s;
   cout<<"";
   cin.getline(s.stuName, 30);
   cout<<"";
   cin>>s.stuRollNo;
   cout<<"\n";
   cin>>s.stuAge;
   return s;
}
void printStudentInfo(Student s){
   cout<<"Student Details"<<endl;
   cout<<"Name: "<<s.stuName<<endl;
   cout<<"Roll: "<<s.stuRollNo<<endl;
   cout<<"Marks: "<<s.stuAge;
}