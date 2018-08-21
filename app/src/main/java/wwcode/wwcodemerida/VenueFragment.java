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
public class VenueFragment extends Fragment {

    // Initiating the TextView and the Button of the fragment
    TextView aboutVenue, nameVenue;
    Button urlBtn, mapsBtn;


    public VenueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View venueView = inflater.inflate(R.layout.fragment_venue, container, false);

        nameVenue = venueView.findViewById(R.id.tittle_venue);
        nameVenue.setText(R.string.venue_name);

        aboutVenue = venueView.findViewById(R.id.info_venue_text);
        aboutVenue.setText(R.string.venue_description);

        urlBtn = venueView.findViewById(R.id.button_web);
        urlBtn.setText(getResources().getString(R.string.btn_sitio_web));

        final String urlVenue = getResources().getString(R.string.venue_sitio_web);

        // Invoke url upon button click
        urlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlVenue));
                startActivity(intent);
            }
        });

        mapsBtn = venueView.findViewById(R.id.button_maps);
        mapsBtn.setText(getResources().getString(R.string.btn_maps));

        final String venueAddress = getResources().getString(R.string.venue_google);

        // Invoke googlemaps upon button click
        mapsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + venueAddress);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return venueView;
    }

}
