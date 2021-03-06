package wwcode.wwcodemerida;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConferenceFragment extends Fragment {

    // Initiating the TextView and the Button of the fragment
    TextView aboutText, aboutEvent, registerBtn;


    public ConferenceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View conferenceView = inflater.inflate(R.layout.fragment_conference, container, false);

        aboutText = conferenceView.findViewById(R.id.event_about);
        aboutText.setText(R.string.about);

        aboutEvent = conferenceView.findViewById(R.id.event_info);
        aboutEvent.setText(R.string.event_info);

        registerBtn = conferenceView.findViewById(R.id.registro);
        registerBtn.setText(getResources().getString(R.string.registro));

        final String currentMeetupUrl = getString(R.string.urlMeetup);

        // Invoke url upon button click
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentMeetupUrl));
                startActivity(intent);
            }
        });

        return conferenceView;

    }


}
