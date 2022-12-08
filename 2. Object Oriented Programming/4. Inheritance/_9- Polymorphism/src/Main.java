public class Main {

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox() {
            @Override
            public void render() {
                System.out.println("Render CheckBox");
            }
        }};

        for (UIControl control : controls) {
            control.render();
        }
    }
}
