#include <iostream>
#include <time.h>

using namespace std;

 void count (int n) {

    int s = 0;


    for (int i = 0; i < n; i ++) {

        s = s + 1;
    }

    cout << "Final value of s = " << s << endl;
 }

 int main() {

    count (10000);
    cout << "Time: " << (end - start);
    return 0;
 }


