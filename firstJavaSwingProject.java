import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstJavaSwingProject {
    public static void main(String[] args) {
        // Tạo cửa sổ JFrame
        JFrame frame = new JFrame("Tính Tổng Từ a Đến b");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Tạo các ô nhập dữ liệu
        JTextField textA = new JTextField();
        textA.setBounds(150, 50, 100, 30);
        JTextField textB = new JTextField();
        textB.setBounds(150, 90, 100, 30);

        JLabel labelA = new JLabel("Nhập a:");
        labelA.setBounds(50, 50, 100, 30);
        JLabel labelB = new JLabel("Nhập b:");
        labelB.setBounds(50, 90, 100, 30);

        // Tạo nút tính toán
        JButton button = new JButton("Tính Tổng");
        button.setBounds(150, 130, 100, 40);

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");
        resultLabel.setBounds(50, 180, 300, 30);

        // Thêm sự kiện cho nút bấm
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(textA.getText());
                    int b = Integer.parseInt(textB.getText());

                    if (a > b) {
                        JOptionPane.showMessageDialog(frame, "Giá trị a phải nhỏ hơn hoặc bằng b!");
                        return;
                    }

                    int sum = 0;
                    for (int i = a; i <= b; i++) {
                        sum += i;
                    }

                    resultLabel.setText("Kết quả: " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });

        // Thêm các thành phần vào cửa sổ
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(button);
        frame.add(resultLabel);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
