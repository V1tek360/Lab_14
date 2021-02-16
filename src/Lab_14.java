import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab_14 extends Frame {
    Lab_14() {
        setTitle("AWTExample");
        setLayout(null);
        Label labelA = new Label("a");
        labelA.setBounds(50, 50, 30, 20);
        Label labelB = new Label("b");
        labelB.setBounds(50, 70, 30, 20);
        Label labelC = new Label("c");
        labelC.setBounds(50, 90, 30, 20);
        add(labelA);
        add(labelB);
        add(labelC);
        TextField tA= new TextField();
        tA.setBounds(90,50,30,20);
        TextField tB= new TextField();
        tB.setBounds(90,70,30,20);
        TextField tSum= new TextField();
        tSum.setBounds(90,90,30,20);
        add(tA);
        add(tB);
        add(tSum);
        setSize(400, 400);
        setVisible(true);
        Button cale=new Button("Calculate");
        cale.setBounds(70,120,50,30);
        cale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aStr= tA.getText();
                double a= Double.parseDouble(aStr);
                String bStr= tB.getText();
                double b= Double.parseDouble(bStr);
                tSum.setText(Double.toString(a+b));
            }
        });
        Button clear=new Button("clear");
        clear.setBounds(70,160,50,30);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tA.setText("");
                tB.setText("");
                tSum.setText("");
            }
        });
        add(cale);
        add(clear);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setSize(400,400);
    }

    public static void main(String[] args) {
        new Lab_14();
        System.out.println("");
    }
}

