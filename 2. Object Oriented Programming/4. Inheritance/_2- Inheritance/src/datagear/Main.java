package datagear;

public class Main {

    public static void main(String[] args) {
        //        UIControl uiControl = new UIControl();
        TextBox textBox1 = new TextBox();
        TextBox textBox2 = textBox1;

        System.out.println(textBox1.equals(textBox2));
        //
        //        uiControl.disable();
        //        System.out.println(uiControl.isEnabled());
        //
        //        System.out.println(textBox.isEnabled);
        //        textBox.disable();
        //        System.out.println(textBox.getClass());
    }
}
