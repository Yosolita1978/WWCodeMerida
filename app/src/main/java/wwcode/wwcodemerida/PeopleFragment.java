package wwcode.wwcodemerida;


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

    int[]mImages = {R.drawable.grecia_ajusted,
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
