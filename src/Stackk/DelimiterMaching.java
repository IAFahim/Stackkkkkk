package Stackk;

public class DelimiterMaching {
    char ch,stackContent;
  //  String  inputExpr;
    //Stack2 myStack = new Stack2(inputExpr.length());
    public boolean isDelimiterMatching(String inputExpr){
        Stack2 myStack = new Stack2(inputExpr.length());
        for (int i=0;i<inputExpr.length();i++){
            ch = inputExpr.charAt(i);
            switch (ch){
                case'(':
                  case '{':
                  case '[':
                    myStack.push(ch);
                    break;
                case ')':
                    case'}':
                   case']':
                    if (myStack.isStackEmpty()){
                       stackContent = myStack.pop();
                       if (ch=='('&& stackContent==')'
                       || ch =='{'&&stackContent=='}'
                       || ch=='['&&stackContent==']'){
                           System.out.println("Mismatched Found! "+ch+"  at index "+i);
                       }
                        return false;
                    }
                    else {
                        System.out.println("Mismatched Found! "+ch+"  at index "+i);
                        return false;
                    }
            }

        }
        if (myStack.isStackEmpty()){
            System.out.println("Missing Right Delimiter");
            return false;
        }
        else
            return true;
    }
}
