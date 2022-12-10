import java.util.LinkedList;
import java.util.List;

public class Generate_Parentheses22 {
    List<String> res = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        if(n == 0){
            return res;
        }
        StringBuilder sb = new StringBuilder();
        backtracking(sb,n,n,res);
        return res;
    }


    void backtracking(StringBuilder sb, int left, int right, List<String> res ){
        if(left==0&&right==0){
            res.add(sb.toString());
            return;
        }
        //剪枝， 严格控制左括号数量小于右括号
        if(left>right){
            return;
        }

        if(left>0){
            sb.append("(");
            backtracking(sb,left-1,right,res);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right>0){
            sb.append(")");
            backtracking(sb,left,right-1,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}


