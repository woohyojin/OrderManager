package com.example.ordercockstore.Login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.ordercockstore.MainActivity;
import com.example.ordercockstore.R;
import com.example.ordercockstore.Socket.Protocol;
import com.example.ordercockstore.Socket.service_Socket;

public final class LoginFragment extends Fragment {
    OnClickListener onclick = new OnClickListener();
    EditText id;
    EditText password;

    Button signin;
    Button signup;
    Button btn;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        if (((MainActivity) getActivity()).loginCheck() == false) {
            Toast.makeText(getContext(), "로그인 해주세요", Toast.LENGTH_SHORT).show();
        } else {
            ((MainActivity) getActivity()).fragmentMenuList();
        }

        id = (EditText) root.findViewById(R.id.et_username);
        password = (EditText) root.findViewById(R.id.et_password);



        signin.setOnClickListener(onclick);
        signup.setOnClickListener(onclick);

        EditText id = (EditText) root.findViewById(R.id.et_username);
        EditText password = (EditText) root.findViewById(R.id.et_password);





        return root;
    }

    class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button_signin) {
                if (view.getId() == R.id.button_signin) {
                    Intent intent = new Intent(getContext(), service_Socket.class);
                    intent.putExtra("pw", Protocol.LOGIN + "|" + id.getText().toString() + "|" + password.getText().toString());
                    getActivity().startService(intent);
                }
            }
        }

        private final void setStatusBarTransparent(AppCompatActivity activity) {
            if (VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            }

            if (VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                activity.getWindow().setStatusBarColor(Color.WHITE);
            }
        }
    }
}
