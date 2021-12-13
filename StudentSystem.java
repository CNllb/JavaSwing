import javafx.geometry.Dimension2D;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.jar.JarFile;

/**
 * JTabbedPaneStudy
 */
public class StudentSystem extends JFrame {

    class Student {
        String studentId;
        String name;
        float studentGrade;
    }

    Student[] students = new Student[1000];

    // 顶部福大logo
    JLabel TopPic;

    // 分别表示插入/查询/排序
    JButton Insert, Search, Sort;

    // 分别表示三个界面
    JPanel panel_1, panel_2, panel_3;

    JLabel Id, Name, Score;

    JTextField Student_Id, Student_Name, Student_Score;

    // 设置选项卡
    JTabbedPane jTabbedPane;

    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem();
    }

    // 构造函数
    public StudentSystem() {
        ImageIcon image = new ImageIcon("logo.png");
        image.setImage(image.getImage().getScaledInstance(200, 58, java.awt.Image.SCALE_DEFAULT));
        TopPic = new JLabel(image);

        jTabbedPane = new JTabbedPane();

        setPane1();
        setPane2();
        setPane3();

        // 将面板添加到选项卡窗格
        jTabbedPane.add("成绩输入", panel_1);
        jTabbedPane.add("成绩查询", panel_2);
        jTabbedPane.add("成绩排序", panel_3);

        // 加入窗体
        this.add(TopPic, BorderLayout.NORTH); // 头部图片大小
        this.add(jTabbedPane, BorderLayout.CENTER);

        this.setTitle("学生成绩管理系统");
        this.setSize(1000, 800);
        this.setResizable(false); // 禁止改变窗体大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // 设置选项卡第一页
    public void setPane1() {
        panel_1 = new JPanel();

        panel_1.setBackground(java.awt.Color.WHITE);
        Id = new JLabel("学号:", JLabel.CENTER);
        Id.setFont(new java.awt.Font("宋体", java.awt.Font.PLAIN, 30));
        Name = new JLabel("姓名:", JLabel.CENTER);
        Name.setFont(new java.awt.Font("宋体", java.awt.Font.PLAIN, 30));
        Score = new JLabel("成绩:", JLabel.CENTER);
        Score.setFont(new java.awt.Font("宋体", java.awt.Font.PLAIN, 30));

        JLabel topBlack = new JLabel();
        topBlack.setLayout(null);
        topBlack.setPreferredSize(new Dimension(1000, 100));
        topBlack.setOpaque(true);
        topBlack.setBackground(java.awt.Color.decode("#FFFFFF"));

        JLabel leftBlack = new JLabel();
        leftBlack.setLayout(null);
        leftBlack.setPreferredSize(new Dimension(250,30));
        leftBlack.setOpaque(true);
        leftBlack.setBackground(java.awt.Color.decode("#FFFFFF"));

        JLabel leftBlack_1 = new JLabel();
        leftBlack_1.setLayout(null);
        leftBlack_1.setPreferredSize(new Dimension(250,30));
        leftBlack_1.setOpaque(true);
        leftBlack_1.setBackground(java.awt.Color.decode("#FFFFFF"));

        JLabel leftBlack_2 = new JLabel();
        leftBlack_2.setLayout(null);
        leftBlack_2.setPreferredSize(new Dimension(250,30));
        leftBlack_2.setOpaque(true);
        leftBlack_2.setBackground(java.awt.Color.decode("#FFFFFF"));

        JLabel rightBlack = new JLabel();
        rightBlack.setLayout(null);
        rightBlack.setPreferredSize(new Dimension(250,30));
        rightBlack.setOpaque(true);
        rightBlack.setBackground(java.awt.Color.decode("#FFFFFF"));

        JLabel rightBlack_1 = new JLabel();
        rightBlack_1.setLayout(null);
        rightBlack_1.setPreferredSize(new Dimension(250,20));
        rightBlack_1.setOpaque(true);
        rightBlack_1.setBackground(java.awt.Color.decode("#FFFFFF"));

        JLabel rightBlack_2 = new JLabel();
        rightBlack_2.setLayout(null);
        rightBlack_2.setPreferredSize(new Dimension(250,30));
        rightBlack_2.setOpaque(true);
        rightBlack_2.setBackground(java.awt.Color.decode("#FFFFFF"));

        panel_1.add(topBlack);

        Student_Id = new JTextField(20);
        Student_Name = new JTextField(20);
        Student_Score = new JTextField(20);

        Student_Id.setFont(new java.awt.Font("宋体", java.awt.Font.BOLD, 25));
        Student_Name.setFont(new java.awt.Font("宋体", java.awt.Font.BOLD, 25));
        Student_Score.setFont(new java.awt.Font("宋体", java.awt.Font.BOLD, 25));

        panel_1.add(leftBlack);
        panel_1.add(Id);
        panel_1.add(Student_Id);
        panel_1.add(rightBlack);
        panel_1.add(leftBlack_1);
        panel_1.add(Name);
        panel_1.add(Student_Name);
        panel_1.add(rightBlack_1);
        panel_1.add(leftBlack_2);
        panel_1.add(Score);
        panel_1.add(Student_Score);
        panel_1.add(rightBlack_2);


        JLabel topBlack_1 = new JLabel();
        topBlack_1.setLayout(null);
        topBlack_1.setPreferredSize(new Dimension(1000, 20));
        topBlack_1.setOpaque(true);
        topBlack_1.setBackground(java.awt.Color.decode("#FFFFFF"));
        panel_1.add(topBlack_1);

        JButton commit = new JButton("提交");
        commit.setBackground(java.awt.Color.decode("#FFFFFF"));
        commit.setFont(new java.awt.Font("宋体",java.awt.Font.PLAIN, 25));
        commit.setPreferredSize(new Dimension(100,35));
        panel_1.add(commit);
    }

    public void setPane2() {
        panel_2 = new JPanel();
    }

    public void setPane3() {
        panel_3 = new JPanel();
    }
}