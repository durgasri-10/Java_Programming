import java.awt.*;
class simple extends frame {
    simple() {
        button b=new button("click");
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(100,100);
    }
 public static void main(String[] args) {
    new simple();
 }   
}