import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DialogBox extends JFrame {
    private static JDialog d;

    DialogBox(){
        d=new JDialog(this,"Dialogue Box",true);
        d.setLayout(new FlowLayout());
        JButton b=new JButton("OK");
        b.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar()==(char)10)
                    d.dispose();
                //else DialogBox.d.setVisible(true)
                    //DialogBox.d.setVisible(false);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogBox.d.setVisible(false);
            }
        });
        d.add(new Label("Click"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogBox();
    }
}
