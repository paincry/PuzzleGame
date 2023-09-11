package com.blibli.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //显示界面
        this.setVisible(true);
    }






    private void initJMenuBar() {
        //添加一个菜单框
        JMenuBar jMenuBar = new JMenuBar();

        //菜单框上两个选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //两个选项中的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");


        JMenuItem accountItem = new JMenuItem("公众号");

        //将条目对象添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //将菜单添加到整个界面中
        this.setJMenuBar(jMenuBar);
    }





    private void initJFrame() {
        //界面的大小
        this.setSize(600,600);
        //设置界面的标题
        this.setTitle("窗口最顶部的显示 游戏1.0");
        //窗口打开直接居中显示
        this.setLocationRelativeTo(null);
        //关闭窗口之后java虚拟机也关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
