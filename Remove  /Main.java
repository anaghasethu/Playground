#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
string removeWord(string str, string word)  
{
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
    return str; 
} 
int main(int argc, char const *argv[])  
{ 
  string string1;
 getline(std::cin,string1);
    string word1 = "the";
    std::cout<< removeWord(string1, word1) << endl; 
    return 0; 
} 