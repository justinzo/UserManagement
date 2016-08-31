package com.waterfallnetworkservice.usermanagement.usermanagement;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {
    Button mRegisterBtn;
    Button mCancelBtn;
    Context mContext;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        //setup the layout xml file that fragment use
        View view = inflater.inflate(R.layout.fragment_user_register, parent, false);

        //get the ui component from ui layout xml
        mRegisterBtn = (Button)view.findViewById(R.id.register_btn); //when create layout xml the register button id  should be the same
        mCancelBtn = (Button)view.findViewById(R.id.cancel_btn); //when create layout xml the cancel button id should be the same

        //setup the click event listener
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "You click Register button", Toast.LENGTH_SHORT).show();
            }
        });

        mCancelBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "You click cancle button", Toast.LENGTH_SHORT).show();

                //
            }
        });

        return view;
    }

}
