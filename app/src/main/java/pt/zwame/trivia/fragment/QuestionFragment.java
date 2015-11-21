package pt.zwame.trivia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pt.zwame.trivia.R;

public class QuestionFragment extends Fragment {

    public static final String ARG_OBJECT = "object";

    String[] easyArray = {"What is my Name?", "How old am I?", "Where do I Live?", "What is my Middle Name?", "What is my Surname?"};
    String[] mediumArray = {"What color is the Sky?", "What is your Favorite Color?", "What time is it?", "Do you believe in God?"};
    String[] hardArray = {"What day is Today?", "Do you own a Car?", "Where do you Work?", "Do you have Facebook?", "Do you have a Cat?"};

    public QuestionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question, container, false);

        Bundle args = getArguments();
        int difficulty = args.getInt(ARG_OBJECT);

        ArrayAdapter<String> adapter = null;
        if(difficulty == 0) {
            adapter = new ArrayAdapter<String>(container.getContext(), android.R.layout.simple_list_item_1, easyArray);
        } else if(difficulty == 1) {
            adapter = new ArrayAdapter<String>(container.getContext(), android.R.layout.simple_list_item_1, mediumArray);
        } else if(difficulty == 2) {
            adapter = new ArrayAdapter<String>(container.getContext(), android.R.layout.simple_list_item_1, hardArray);
        }

        ListView questionList = (ListView)view.findViewById(R.id.list_questions);
            questionList.setAdapter(adapter);

        return view;
    }
}
