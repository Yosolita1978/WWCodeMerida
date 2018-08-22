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


/**
 * A simple {@link Fragment} subclass.
 */
public class SponsorFragment extends Fragment {

    Context mContext;
    GridView gridView;

    public SponsorFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sponsor, container, false);
        mContext = inflater.getContext();
        gridView = (GridView)rootView.findViewById(R.id.grid_sponsors);

        final String[]mImagesUrl = {"http://encuentro.wwcodemid.com/assets/images/sponsors/mozilla.png",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/ensitech.png",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/GrouUp.png",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/plenum.png",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/kwan.png",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/SoftwareCamp.png",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/castamic.jpg",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/nationalsoft.png",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/LaLupita.jpg",
                    "http://encuentro.wwcodemid.com/assets/images/sponsors/canieti.jpg"};

        final String[] mUrls = {getResources().getString(R.string.sponsor_1),
                getResources().getString(R.string.sponsor_2),
                getResources().getString(R.string.sponsor_3),
                getResources().getString(R.string.sponsor_4),
                getResources().getString(R.string.sponsor_5),
                getResources().getString(R.string.sponsor_6),
                getResources().getString(R.string.sponsor_7),
                getResources().getString(R.string.sponsor_8),
                getResources().getString(R.string.sponsor_9),
                getResources().getString(R.string.sponsor_10)};


        SponsorAdapter mAdapter = new SponsorAdapter(mContext, mImagesUrl, mUrls);
        gridView.setAdapter(mAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(mUrls[position]));
                startActivity(intent);
            }
        });

        return rootView;
    }

}
