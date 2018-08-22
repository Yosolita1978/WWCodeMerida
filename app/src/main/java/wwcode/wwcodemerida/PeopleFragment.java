package wwcode.wwcodemerida;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PeopleFragment extends Fragment {

    GridView gridView;

    Context mContext;



    public PeopleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_people, container, false);
        mContext = inflater.getContext();
        gridView = (GridView)rootView.findViewById(R.id.grid_speakers);

        final String[] mNames = {getResources().getString(R.string.speaker_1),
                getResources().getString(R.string.speaker_2),
                getResources().getString(R.string.speaker_3),
                getResources().getString(R.string.speaker_4),
                getResources().getString(R.string.speaker_5),
                getResources().getString(R.string.speaker_6),
                getResources().getString(R.string.speaker_7),
                getResources().getString(R.string.speaker_8),
                getResources().getString(R.string.speaker_9),
                getResources().getString(R.string.speaker_10),
                getResources().getString(R.string.speaker_11),
                getResources().getString(R.string.speaker_12),
                getResources().getString(R.string.speaker_13),
                getResources().getString(R.string.speaker_14),
                getResources().getString(R.string.speaker_15)};

        final int[]mImages = {R.drawable.grecia_ajusted,
                R.drawable.yelmy_ajusted,
                R.drawable.yuliana_ajusted,
                R.drawable.loylis_ajusted,
                R.drawable.silvia_ajusted,
                R.drawable.ana_loyo_ajusted,
                R.drawable.marlene_mendez_ajusted,
                R.drawable.rocio_ajusted,
                R.drawable.aracelly_ajusted,
                R.drawable.erika_ajusted,
                R.drawable.mariel_ajusted,
                R.drawable.vanessa_ajusted,
                R.drawable.flor_ajusted,
                R.drawable.mayra,
                R.drawable.alejandrina};

        SpeakerAdapter mAdapter = new SpeakerAdapter(mContext, mNames, mImages);
        gridView.setAdapter(mAdapter);

        final String currentUrl = "http://encuentro.wwcodemid.com/index.html#header3-1i";

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentUrl));
                startActivity(intent);
            }
        });

        return rootView;
    }

}
