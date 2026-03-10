import java.util.*;

public class History {

    private final Stack<EditorState> stack = new Stack<>();

    public void save(EditorState state){
        stack.push(state);
    }

    public EditorState undo(){
        if(stack.size() <= 1){
            return null;
        }
        stack.pop();
        return stack.peek();
    }


}
