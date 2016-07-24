package com.guizhiyuan.dialogdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_dialog = (Button) findViewById(R.id.btn_dialog);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建AlertDialog
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
               //设置AlertDialog
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setTitle("是否退出应用？");
                dialog.setMessage("你真的不爱我了吗？你真的要离开我么？");
                //设置返回的点击事件
                dialog.setNegativeButton("返回", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                //设置确定的点击事件
                dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                //显示AlertDialog
                dialog.show();
            }
        });
    }
}
