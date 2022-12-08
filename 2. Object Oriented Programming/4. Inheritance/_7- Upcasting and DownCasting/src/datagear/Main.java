package datagear;

public class Main {

    public static void main(String[] args) {
        UIControl uiControl = new UIControl(false);
        TextBox textBox = new TextBox();

        show(uiControl);
        show(textBox);
    }

    public static void show(UIControl uiControl) {
        TextBox textBox = null;
        if (uiControl instanceof TextBox) {
            textBox = (TextBox) uiControl;
            textBox.setText("Hello World!");
        }

        System.out.println(textBox);
    }
}
