class Solution {
public:
    static bool value(const pair<char,int>&a,const pair<char,int>&b){
        return a.second>b.second;
    }
    int minimumPushes(string word) {
        unordered_map<char, int> map;
        for (auto it : word) {
            if (map.find(it) == map.end())
                map.insert({it, 1});
            else
                map[it]++;
        }
        vector<pair<char,int>>result(map.begin(),map.end());
        sort(result.begin(),result.end(),value);
        int ans=0;
        int k=0;
        for (auto it : result) {
            if(k<8) {
                ans=ans+it.second;
                k++;
            }
            else if(k>=8&&k<16){
                ans=ans+(it.second*2);
                k++;
            }
            else if (k>=16&&k<24)
            {
                ans=ans+(it.second*3);
                k++;
            }
            else
                ans =ans+(it.second*4);
            cout<<it.first<<" "<<it.second<<endl;
        }
        return ans;
    }
};