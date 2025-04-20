#include <iostream>
#include <string.h>
using namespace std;

   class Credentials
   {
    public:
     string  FirstName;
     string LastName;
//     int PhoneNumber;
   };

int main(void)
{
 Credentials Cred;
  cout<<"Enter First Name: ";
  cin>>Cred.FirstName;
  cout<<"Enter Last Name:  ";
  cin>>Cred.LastName;
  cout<<"Your Name is "<<Cred.FirstName<<" "<<Cred.LastName<<endl;
//  cout<< Cred; 
}
