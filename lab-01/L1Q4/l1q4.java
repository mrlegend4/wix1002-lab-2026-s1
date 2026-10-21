import java.awt.*;
import javax.swing.*;

public class l1q4 extends JPanel {
    private final String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
    private final int[] amounts = {2500, 1600, 2000, 2700, 3200, 800};

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D g = (Graphics2D) graphics.create();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setFont(new Font("SansSerif", Font.PLAIN, 16));
        g.setColor(Color.DARK_GRAY);
        g.drawString("Product A sales, January-June 2016", 60, 35);
        int baseline = 320;
        // Fixed scale: 3500 units fit in 245 pixels.
        for (int tick = 0; tick <= 3500; tick += 500) {
            int y = baseline - tick * 245 / 3500;
            g.setColor(new Color(220, 230, 240));
            g.drawLine(60, y, 690, y);
            g.setColor(Color.DARK_GRAY);
            g.drawString(String.valueOf(tick), 10, y + 5);
        }
        for (int i = 0; i < amounts.length; i++) {
            int x = 80 + i * 100;
            int height = amounts[i] * 245 / 3500;
            g.setColor(new Color(23, 93, 176));
            g.fillRect(x, baseline - height, 60, height);
            g.setColor(Color.DARK_GRAY);
            g.drawString(months[i], x + 12, baseline + 25);
            g.drawString(String.valueOf(amounts[i]), x + 5, baseline - height - 8);
        }
        g.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Product A sales");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            l1q4 chart = new l1q4();
            chart.setBackground(Color.WHITE);
            chart.setPreferredSize(new Dimension(730, 390));
            frame.add(chart);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}