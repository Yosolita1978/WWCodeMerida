package wwcode.wwcodemerida;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class SingleConferenceActivity extends AppCompatActivity {
    //The global values I will need, including context for the activity

    final Context context = this;
    Conference currentConference;


    //Start the allconferences list
    private AllConferenceList allconferencesList = AllConferenceList.getAllConferences(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_conference);


        //Grab the position and the type of the current place with the intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int value = extras.getInt("indexConfSelected");

        //Grab the correct Array of conferences
        ArrayList<Conference> conferenceArrayList = new ArrayList<Conference>();
        for(int i = 0; i < allconferencesList.getLeght(); i++){
            conferenceArrayList.add(allconferencesList.getConferencebyIndex(i));
        }

        currentConference = conferenceArrayList.get(value);

        //Change the arrow from navigacion back to home
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //SetUp the hours for the currentConference
        TextView startHour = findViewById(R.id.start_text_hours);
        startHour.setText(currentConference.getConferenceStartHour());

        //SetUp the hours for the currentConference
        TextView endHour = findViewById(R.id.end_text_hours);
        endHour.setText(currentConference.getConferenceEndHour());

        //SetUp the name of the current conference
        TextView nameconference = findViewById(R.id.single_conference_name);
        nameconference.setText(currentConference.getConferenceName());

        //SetUp the author of the current conference
        TextView authorconference = findViewById(R.id.single_conference_author);
        authorconference.setText(currentConference.getConferenceAuthor());


        //SetUp the type of the current conference
        TextView typeconference = findViewById(R.id.single_conference_type);
        typeconference.setText(currentConference.getConferenceType());

        //SetUp the description of the current conference
        TextView descconference = findViewById(R.id.single_conference_desc);
        descconference.setText(currentConference.getConferenceDescription());

    }
}
