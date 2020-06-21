
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class Assistant extends JFrame implements KeyListener {
    JTextField Name = new JTextField(7);
    JTextField Level = new JTextField("10", 2);
    JTextField Boosts = new JTextField("0", 2);
    JTextField Attacks = new JTextField("1", 2);
    JLabel Damage = new JLabel("2332");
    Double AllDamage;
    HashMap<String, Double> Brawlers = new HashMap<>();
    public Assistant() {
        setTitle("Помощник");
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setAlwaysOnTop(true);
        setLayout(new FlowLayout());

        Name.addKeyListener(this);
        Level.addKeyListener(this);
        Boosts.addKeyListener(this);
        Attacks.addKeyListener(this);

        add(Name);
        add(Level);
        add(Boosts);
        add(Attacks);
        add(Damage);
    }

    public static void main(String[] args) {
        Assistant a = new Assistant();
        a.Brawlers.put("Шелли", 300*5.0);
        a.Brawlers.put("Нита", 800.0);
        a.Brawlers.put("Кольт", 320*6.0);
        a.Brawlers.put("Булл", 400*5.0);
        a.Brawlers.put("Джесси", 840.0);
        a.Brawlers.put("Брок", 1100.0);
        a.Brawlers.put("Динамайк", 800*2.0);
        a.Brawlers.put("Бо", 3*520.0);
        a.Brawlers.put("Тик", 680*3.0);
        a.Brawlers.put("8-ИмБит", 6*320.0);
        a.Brawlers.put("Эмз", 500.0);
        a.Brawlers.put("Эль Примо", 360*4.0);
        a.Brawlers.put("Барли", 680.0);
        a.Brawlers.put("Поко", 700.0);
        a.Brawlers.put("Роза", 460*3.0);
        a.Brawlers.put("Рико", 5*320.0);
        a.Brawlers.put("Дэррил", 240*10.0);
        a.Brawlers.put("Пэнни", 900.0);
        a.Brawlers.put("Карл", 660.0);
        a.Brawlers.put("Джеки", 120.0);
        a.Brawlers.put("Пайпер", 1520.0);
        a.Brawlers.put("Пэм", 260*9.0);
        a.Brawlers.put("Фрэнк", 1200.0);
        a.Brawlers.put("Биби", 1300.0);
        a.Brawlers.put("Беа", 800.0);
        a.Brawlers.put("Нани", 700*3.0);
        a.Brawlers.put("Мортис", 900.0);
        a.Brawlers.put("Тара", 3*420.0);
        a.Brawlers.put("Джин", 1000.0);
        a.Brawlers.put("Макс", 4*320.0);
        a.Brawlers.put("Мистер П.", 700.0);
        a.Brawlers.put("Спраут", 940.0);
        a.Brawlers.put("Спайк", 520.0);
        a.Brawlers.put("Ворон", 3*320.0);
        a.Brawlers.put("Леон", 4*440.0);
        a.Brawlers.put("Сэнди", 920.0);
        a.Brawlers.put("Гэйл", 360*5.0);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        try {
            AllDamage = Brawlers.get(Name.getText());
            if (Double.valueOf(Level.getText()) > 9) {
                AllDamage += Brawlers.get(Name.getText()) * (double) 5 / 100 * (Double.valueOf(Level.getText()) - 2);
            } else {
                AllDamage += Brawlers.get(Name.getText()) * (double) 5 / 100 * (Double.valueOf(Level.getText()) - 1);
            }
            AllDamage += AllDamage * (double) 10 / 100 * (Double.valueOf(Boosts.getText()));
            AllDamage *= Double.valueOf(Attacks.getText());
            Damage.setText(String.valueOf(AllDamage));
        } catch (Exception Exc) { }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
