package Stack_Queue;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix="A+(B*C)-(D/E^F)*G";
        System.out.println("Infix:"+infix);
        System.out.println("Postfix:"+Infix(infix));
    }
    static int fix(char ch){
        switch (ch){
            case'+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static boolean operator(char ch){
        return (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^');
    }
    static String Infix(String exp){
        char[] stack=new char[exp.length()];
        int top=-1;
        String postfix="";

        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                postfix+=c;
            }
            else if(c=='('){
                stack[++top]=c;
            }
            else if(c==')'){
                while(top!=-1&&stack[top]!='('){
                    postfix+=stack[top--];
                }
                top--;
            }
            else if(operator(c)){
                while(top!=-1&& fix(stack[top])>fix(c)){
                    postfix+=stack[top--];
                }
                stack[++top]=c;
            }
        }
        while(top!=-1){
            postfix+=stack[top--];
        }
        return postfix;
    }
}
