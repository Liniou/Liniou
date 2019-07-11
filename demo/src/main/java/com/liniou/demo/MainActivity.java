package com.liniou.demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView text1;

    private ImageView[] img = new ImageView[12];
    private int[] image = new int[]{
            R.mipmap.background, R.mipmap.ic_launcher
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * 全java代码
         */
        ////!加全局画布
        //FrameLayout frameLayout = new FrameLayout(this);  //创建新布局管理器
        //frameLayout.setBackgroundResource(R.mipmap.background);  //设置背景
        //setContentView(frameLayout);
//
        ////!加局部组件
        //text1 = new TextView(this);
        //text1.setText("开始游戏");
        //text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        //text1.setTextColor(Color.rgb(17,85,114));
        ////!加组件外部设置
        //FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
        //        ViewGroup.LayoutParams.WRAP_CONTENT,
        //        ViewGroup.LayoutParams.WRAP_CONTENT
        //);
        //params.gravity = Gravity.CENTER;
        //text1.setLayoutParams(params);
        ////!局部组件的事件
        //text1.setOnClickListener(new View.OnClickListener() {  //监听事件
        //    @Override
        //    public void onClick(View view) {  //事件
        //        new AlertDialog.Builder(MainActivity.this)
        //                .setTitle("系统提示")
        //                .setMessage("游戏有风险，进入需谨慎！")
        //                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
        //                    @Override
        //                    public void onClick(DialogInterface dialogInterface, int i) {
        //                        Log.i("毕廷", "进入游戏");
        //                    }
        //                })
        //                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
        //                    @Override
        //                    public void onClick(DialogInterface dialogInterface, int i) {
        //                        Log.i("毕廷", "退出游戏");
        //                        finish();   //退出当前activity
        //                    }
        //                })
        //                .show();
        //    }
        //});
        //frameLayout.addView(text1);


        /**
         * 全xml代码
         */
        //setContentView(R.layout.activity_main);

        /**
         * xml和java混合代码
         */
        //setContentView(R.layout.activity_main);
        //GridLayout layout = (GridLayout)findViewById(R.id.layout);
        //for(int i = 0; i < image.length; i++){
        //    img[i] = new ImageView(MainActivity.this);
        //    img[i].setImageResource(image[i]);
        //    img[i].setPadding(2,2,2,2);
        //    ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(1080 / 3, 1920 / 10);
        //    img[i].setLayoutParams(params);
        //    layout.addView(img[i]);
//
        /**
         * 画可移动位图
         */
        //setContentView(R.layout.activity_main);
        //FrameLayout frameLayout = findViewById(R.id.layout);
        //RabbitView rabbit = new RabbitView(this);
        //rabbit.onTouchLinstener();
        //frameLayout.addView(rabbit);

        /**
         * 相对布局管理器
         */
        //setContentView(R.layout.activity_main);

        /**
         * 线性布局管理器
         */
        //setContentView(R.layout.activity_main);

        /**
         * 网格布局管理器
         */
        //setContentView(R.layout.activity_main);

        /**
         * 做登录页面
         */
        setContentView(R.layout.activity_main);
        //Button logIn = findViewById(R.id.logIn);
        //logIn.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        EditText admin = findViewById(R.id.admin);
//
        //        Toast.makeText(MainActivity.this, "账户名为" + admin.getText(), Toast.LENGTH_SHORT).show();
        //    }
        //});

    }

    public void myClick(View view){
        EditText admin = findViewById(R.id.admin);
        Toast.makeText(MainActivity.this, "账户名为" + admin.getText(), Toast.LENGTH_LONG).show();
    }


}
