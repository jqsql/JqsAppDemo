package com.jdemo.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        initData();
        initListen();

    }

    /**
     * 初始化
     */
    private void initView() {

    }

    /**
     * 数据处理
     */
    private void initData() {

    }

    /**
     * 事件监听
     */
    private void initListen() {

    }
}
