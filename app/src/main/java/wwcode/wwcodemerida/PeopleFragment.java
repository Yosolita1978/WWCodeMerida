package wwcode.wwcodemerida;


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

    String[] mNames = {"Grecia Castaldi",
                        "Yelmy Pech",
                        "Yuliana Reyna",
                        "Loyda Luis",
                        "Silvia Fernández",
                        "Ana Loyo",
                        "Marlene Méndez",
                        "Rocío Ceballos",
                        "Aracelly Ramírez",
                        "Erika López",
                        "Mariel Soberanis",
                        "Vanessa Herrera",
                        "Flor González",
                        "Mayra Trejo",
                        "Alejandrina Caamal Solís"};

    int imageID = R.drawable.defaultspeaker;
    int[]mImages = {imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID, imageID};


    public PeopleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_people, container, false);
        gridView = (GridView)rootView.findViewById(R.id.grid_speakers);

        SpeakerAdapter mAdapter = new SpeakerAdapter(getActivity(), mNames, mImages);
        gridView.setAdapter(mAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), mNames[position], Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

}
