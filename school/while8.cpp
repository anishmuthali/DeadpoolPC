#include <iostream>

using namespace std;

int main(){
    int num;
    cout << "Please enter an integer: " << endl;
    cin >> num;
    while (num > 0){
        int bin = num % 2;
        cout << bin << endl;
        num = num/2;
    }
    return 0;
}