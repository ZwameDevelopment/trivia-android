package pt.zwame.trivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] categoryArray = {"History", "Geography", "Movies", "Literature", "Sports", "Television",
                                "Games", "Celebrities", "Humanities", "Religion", "Tech", "General Knowledge"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoryArray);
        ListView categoryList = (ListView) findViewById(R.id.list_categories);
            categoryList.setAdapter(adapter);

        categoryList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view).getText().toString();

                Intent cIntent = new Intent(MainActivity.this, QuestionActivity.class);
                    //cIntent.putExtra("name", item);
                startActivity(cIntent);
            }
        });
    }
}
