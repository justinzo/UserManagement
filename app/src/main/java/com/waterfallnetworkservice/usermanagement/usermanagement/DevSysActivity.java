package com.waterfallnetworkservice.usermanagement.usermanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Justin on 9/1/16.
 */
public class DevSysActivity extends AppCompatActivity {
    private Button mToLoginBtn;
    private Button mToRegisterBtn;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devesys);
        mContext = this;

        mToLoginBtn = (Button)findViewById(R.id.btn_go_to_login);
        mToLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });


        mToRegisterBtn = (Button)findViewById(R.id.btn_go_to_register);
        mToRegisterBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
