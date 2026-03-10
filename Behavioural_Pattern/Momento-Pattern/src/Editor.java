public class Editor {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState save(){
        return new EditorState(content);
    }

    public void undo(EditorState state){
        if(state == null){
            return;
        }
        content = state.getContent();
    }

    public void print(){
        System.out.println(content);
    }



}
