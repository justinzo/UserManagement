package com.waterfallnetworkservice.usermanagement.usermanagement;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class UserManagementActivity extends AppCompatActivity {
    private Button mXboxBtn;
    private Button mDevBtn;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_management);
        mContext = this;
        mXboxBtn = (Button)findViewById(R.id.btn_to_xbox_sys);

        mXboxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, XBoxActivity.class);
                startActivity(intent);
            }
        });

        mDevBtn = (Button)findViewById(R.id.btn_to_dev_sys);
        mDevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Go to Xbox Sys", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, DevSysActivity.class);
                startActivity(intent);
            }
        });
    }




}
