package com.blibli.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {

    //创建一个二维数组，加载图片的数据
    int[][] data = new int[4][4];

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化打乱数据
        initData();

        //初始化图片
        initImage();

        //显示界面
        this.setVisible(true);
    }

    //打乱数据
    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱顺序
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index = r.nextInt(tempArr.length);
            //遍历到的每一个数据跟获取的随机索引进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        //将打乱的数据添加到二维数组里
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    private void initImage() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载的图片序号
                int num = data[i][j];
                //创建一个JLable对象，放置图片的容器
                JLabel jLabel1 = new JLabel(new ImageIcon());//参数是图片在电脑中的存储路径,要加上num变量，此处没有添加
                //指定第一张图片的位置
                jLabel1.setBounds(105 * j, 105 * i, 105, 105);
                //把容器添加到窗口中
                //this.add(jLabel);
                this.getContentPane().add(jLabel1);
            }
        }
    }

    //初始化菜单
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

    //初始化窗口
    private void initJFrame() {
        //界面的大小
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("窗口最顶部的显示 游戏1.0");
        //窗口打开直接居中显示
        this.setLocationRelativeTo(null);
        //关闭窗口之后java虚拟机也关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置
        this.setLayout(null);
    }
}
