package datagear;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(false);
//        System.out.println("Text Box");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
