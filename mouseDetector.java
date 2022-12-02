package SwingFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseDetector extends Frame implements MouseListener {
    static JLabel lable1;
    static JLabel lable2;
    static JLabel lable3;
    mouseDetector(){
        lable1=new JLabel("No Event");
        lable2=new JLabel("No Event");
        lable3=new JLabel("No Event");
    }
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Mouse Events");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        mouseDetector mouse=new mouseDetector();
        frame.addMouseListener(mouse);
        panel.add(lable1);
        panel.add(lable2);
        panel.add(lable3);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lable1.setText("Mouse clicked at: ("+e.getX()+", "+e.getY()+")\nNo.of times clicked: "+e.getClickCount());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lable2.setText("Mouse pressed at: ("+e.getX()+", "+e.getY()+")\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lable1.setText("Mouse released at: ("+e.getX()+", "+e.getY()+")\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lable3.setText("Mouse entered at: ("+e.getX()+", "+e.getY()+")\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lable3.setText("Mouse exited at: ("+e.getX()+", "+e.getY()+")\n");
    }
}
