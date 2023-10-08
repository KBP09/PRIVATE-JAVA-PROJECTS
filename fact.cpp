#include <iostream>
using namespace std;
int main(){
    int x;
    cin >> x;
    int sum=x;
    for(int i=1;i<x;i++){
        sum*=i;
    }
    cout << sum;
    return 0;
}