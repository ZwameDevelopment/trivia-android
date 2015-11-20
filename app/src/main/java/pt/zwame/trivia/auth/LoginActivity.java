package pt.zwame.trivia.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pt.zwame.trivia.MainActivity;
import pt.zwame.trivia.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_register(View view) {
        Intent rActivity = new Intent(this, RegisterActivity.class);
        startActivity(rActivity);
    }

    public void btn_login(View view) {
        Intent mActivity = new Intent(this, MainActivity.class);
        startActivity(mActivity);
    }
}