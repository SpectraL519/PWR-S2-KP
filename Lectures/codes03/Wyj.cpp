#include <iostream>
#include <string>
using namespace std;

double division(int a, int b) {
if( b == 0 ) {
      throw (string) "Division by 0";
   }
   return (a/b);
}

int main () {
   int x = 50;
   int y = 0;
   double z = 0;
 
    try {
      z = division(x, y);
      cout << z << endl;
   }catch (string msg) {
      cerr << msg << endl;
   }

   return 0;
}