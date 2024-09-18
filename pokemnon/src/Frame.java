import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Frame{
    public void exibirjanela(){
        JFrame janela = new JFrame("Janela com pokemon");

        janela.setSize(700, 500);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("bulbasaur.png");
        ImageIcon image2 = new ImageIcon("squirtle.png");
        ImageIcon image3 = new ImageIcon("charmander.png");
        JLabel agua = new JLabel(image3);
        JLabel labelComImagem = new JLabel(image);
        JLabel label = new JLabel(image2);
           
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));

        panel.add(labelComImagem);
        panel.add(label);
        panel.add(agua);
        janela.add(panel);
        janela.setVisible(true);
    }
}
