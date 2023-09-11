package com.blibli.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame(){
        //界面的大小
        this.setSize(400,400);
        //设置界面的标题
        this.setTitle("窗口最顶部的显示   注册");
        //窗口打开直接居中显示
        this.setLocationRelativeTo(null);
        //关闭窗口之后java虚拟机也关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //显示界面
        this.setVisible(true);
    }
}
