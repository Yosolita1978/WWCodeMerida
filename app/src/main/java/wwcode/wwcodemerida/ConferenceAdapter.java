package wwcode.wwcodemerida;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ConferenceAdapter extends ArrayAdapter {

    public ConferenceAdapter(Context context, ArrayList<Conference> conferences) {
        super(context, 0, conferences);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_conferences, parent, false);
        }

        // Set up the current conference
        Conference currentConference = (Conference) getItem(position);

        TextView hourTextView = listItemView.findViewById(R.id.text_hours);
        hourTextView.setText(currentConference.getConferenceStartHour());

        TextView nameTextView = listItemView.findViewById(R.id.conference_name);
        nameTextView.setText(currentConference.getConferenceName());

        TextView authorTextView = listItemView.findViewById(R.id.conference_author);
        authorTextView.setText(currentConference.getConferenceAuthor());

        TextView descriptionTextView = listItemView.findViewById(R.id.conference_description);
        descriptionTextView.setText(currentConference.getConferenceDescription());

        return listItemView;
    }
}
