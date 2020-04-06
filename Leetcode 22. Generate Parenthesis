/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/

//Java Implementation

class Solution {
    List<String> lt=new ArrayList<String>();
    
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        
        backtrack(lt,open,close,n,"");
        return lt;
        
    }
    
    public void backtrack(List<String> lt, int open, int close,int n,String currStr){
        if(open>n) return;
        if(open==n && close==n){
            lt.add(currStr); return;
        }

        backtrack(lt,open+1,close,n,currStr+"(");
        if(open>close)
            backtrack(lt,open,close+1,n,currStr+")");
    }
}
