package dailyProblem;
import javax.swing.*;
import java.awt.*;

public class ShopDiscountBanner {
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("Shop Discount");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);

        JLabel headline = new JLabel("🎉 Limited Time Offer!");
        headline.setFont(new Font("Arial", Font.BOLD, 24));
        headline.setAlignmentX(Component.CENTER_ALIGNMENT);
        headline.setForeground(Color.RED);


        JLabel discountDetails = new JLabel("💥 Up to 50% OFF on Electronics!");
        discountDetails.setFont(new Font("Arial", Font.PLAIN, 18));
        discountDetails.setAlignmentX(Component.CENTER_ALIGNMENT);

      
        JLabel terms = new JLabel("Valid till Dec 31st | Minimum order: $100");
        terms.setFont(new Font("Arial", Font.ITALIC, 14));
        terms.setAlignmentX(Component.CENTER_ALIGNMENT);

       
        JButton shopNowButton = new JButton("Shop Now");
        shopNowButton.setFont(new Font("Arial", Font.BOLD, 16));
        shopNowButton.setBackground(Color.ORANGE);
        shopNowButton.setForeground(Color.WHITE);
        shopNowButton.setAlignmentX(Component.CENTER_ALIGNMENT);

      
        panel.add(Box.createRigidArea(new Dimension(0, 20))); 
        panel.add(headline);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); 
        panel.add(discountDetails);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); 
        panel.add(terms);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); 
        panel.add(shopNowButton);

        
        frame.add(panel);

        
        frame.setVisible(true);
    }
}
