package pt.zwame.trivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        TextView catName = (TextView)findViewById(R.id.lbl_catName);
            catName.setText(this.getIntent().getStringExtra("name"));
    }
}
