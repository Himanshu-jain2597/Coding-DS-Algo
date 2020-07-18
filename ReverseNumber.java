#include<bits/stdc++.h>
using namespace std;
int main()
{
    long long int n;
    cin>>n;
    long long int x=0;
    long long int rem=0;
    long long int c=0;
    long long int i=0; 
    bool is=false;
    if(n<0)
    {
       is=true;
       n=n*-1; 
    }
    while(n>0)
    {
        rem=n%10;
        x=x*10+rem;
        n=n/10;
    }
    if(is)
    {
        x=x*-1;
    }
    // for(int i=0;i<c;i++)
    // cout<<0;
    cout<<x;
}