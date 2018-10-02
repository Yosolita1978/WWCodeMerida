package wwcode.wwcodemerida;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SingleSpeakerActivity extends AppCompatActivity {
    //The global values I will need, including context for the activity

    final Context context = this;
    Speaker currentSpeaker;
    Conference currentConference;


    //Start the allspeaker list
    private AllSpeakerList allspeakerList = AllSpeakerList.getAllSpeakers(context);

    //Start the allconference list
    private AllConferenceList allConferenceList = AllConferenceList.getAllConferences(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_speaker);


        //Grab the position and the type of the current place with the intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int value = extras.getInt("indexSpeakSelected");

        //Grab the correct Array of speakers
        ArrayList<Speaker> speakerArrayList = new ArrayList<Speaker>();
        for(int i = 0; i < allspeakerList.getLeght(); i++){
            speakerArrayList.add(allspeakerList.getSpeakerbyIndex(i));
        }

        currentSpeaker = speakerArrayList.get(value);

        final int conferenceIndex = allConferenceList.findConferencebyAuthor(currentSpeaker.getSpeakerName());

//        currentConference = allConferenceList.getConferencebyIndex(conferenceIndex);


        //Change the arrow from navigacion back to home
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //SetUp the name of the speaker
        TextView nameSpeaker = findViewById(R.id.speaker_name);
        nameSpeaker.setText(currentSpeaker.getSpeakerName());

        //SetUp the image of the current speaker
        ImageView currentImage = findViewById(R.id.image_speaker);
        String imgUrl = currentSpeaker.getSpeakerImg();
        Picasso.get().load(imgUrl).into(currentImage);

        //SetUp the job of the speaker
        TextView speakerJob = findViewById(R.id.speaker_job);
        speakerJob.setText(currentSpeaker.getSpeakerJob());

        //SetUp the bio of the speaker
        TextView speakerBio = findViewById(R.id.speaker_bio);
        speakerBio.setText(currentSpeaker.getSpeakerBio());

        //SetUp the conference Tittle
        TextView conferenceSpeaker = findViewById(R.id.conference_title);
        conferenceSpeaker.setText(currentSpeaker.getSpeakerConference());
        // Invoke url upon button click
        conferenceSpeaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleSpeakerActivity.this, SingleConferenceActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("indexConfSelected", conferenceIndex);
                intent.putExtras(extras);
//                Log.d("LOG", Integer.toString(position));
                startActivity(intent);
            }
        });

        //SetUp the LinkedIn Button
        TextView linkedInSpeaker = findViewById(R.id.linkedin);
        linkedInSpeaker.setText(R.string.linkedin_label);
        final String currentLinkedIn = currentSpeaker.getSpeakerLinkedIn();

        // Invoke url upon button click
        linkedInSpeaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentLinkedIn));
                startActivity(intent);
            }
        });

    }
}
