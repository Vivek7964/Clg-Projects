#include<bits/stdc++.h>
using namespace std;
bool custom(pair<int,int> &a,pair<int,int> &b){
    if(a.second==b.second){
        return a.first<b.first;
    }
    return a.second<b.second;
}

int main() {
    int n;
    cin>>n;
    vector<pair<int,int>> vect;
    unordered_map<int,int> umap;
    for(int i=0;i<n;i++){
        int a,b;
        cin>>a>>b;
        umap[a]=b;
    }
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int a,b,c;
        cin>>a>>b>>c;
        int tranc=umap[a]-c;
        if(tranc>0){
            umap[a]=umap[a]-c;
            umap[b]=umap[b]+c;
            cout<<"Success"<<endl;
        }else{
            cout<<"Failure"<<endl;
        }
    }
    cout<<endl;
    for(auto it:umap){
        vect.push_back(make_pair(it.first,it.second));
    }
    sort(vect.begin(),vect.end(),custom);
    for(auto it:vect){
        cout<<it.first<<" "<<it.second<<endl;
    }
    return 0;
}