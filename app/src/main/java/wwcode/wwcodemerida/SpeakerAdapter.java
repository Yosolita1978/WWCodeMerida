package wwcode.wwcodemerida;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SpeakerAdapter extends ArrayAdapter {

    public SpeakerAdapter(Context context, ArrayList<Speaker> speakers) {
        super(context, 0, speakers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_speakers, parent, false);
        }

        // Set up the current speaker
        Speaker currentSpeaker = (Speaker) getItem(position);


        TextView jobTextView = listItemView.findViewById(R.id.section_job);
        jobTextView.setText(currentSpeaker.getSpeakerJob());

        TextView nameTextView = listItemView.findViewById(R.id.section_name);
        nameTextView.setText(currentSpeaker.getSpeakerName());

        TextView conferenceTextView = listItemView.findViewById(R.id.conference_name);
        conferenceTextView.setText(currentSpeaker.getSpeakerConference());

        ImageView imageView = listItemView.findViewById(R.id.speaker_image);
        String imgUrl = currentSpeaker.getSpeakerImg();
        Picasso.get().load(imgUrl).into(imageView);

        return listItemView;
    }
}

