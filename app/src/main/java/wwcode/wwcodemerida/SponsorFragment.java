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

        final String[]mImagesUrl = {getResources().getString(R.string.sponsor_img_1),
                getResources().getString(R.string.sponsor_img_2),
                getResources().getString(R.string.sponsor_img_3),
                getResources().getString(R.string.sponsor_img_4),
                getResources().getString(R.string.sponsor_img_5),
                getResources().getString(R.string.sponsor_img_6),
                getResources().getString(R.string.sponsor_img_7),
                getResources().getString(R.string.sponsor_img_8),
                getResources().getString(R.string.sponsor_img_9),
                getResources().getString(R.string.sponsor_img_10),
                getResources().getString(R.string.sponsor_img_11),
                getResources().getString(R.string.sponsor_img_12),
                getResources().getString(R.string.sponsor_img_13),
                getResources().getString(R.string.sponsor_img_14),
                getResources().getString(R.string.sponsor_img_15),
                getResources().getString(R.string.sponsor_img_16),
                getResources().getString(R.string.sponsor_img_17),
                getResources().getString(R.string.sponsor_img_18),
                getResources().getString(R.string.sponsor_img_19),
                getResources().getString(R.string.sponsor_img_20),
                getResources().getString(R.string.sponsor_img_21),
                getResources().getString(R.string.sponsor_img_22),
                getResources().getString(R.string.sponsor_img_23),
                getResources().getString(R.string.sponsor_img_24),
                getResources().getString(R.string.sponsor_img_25),
                getResources().getString(R.string.sponsor_img_26),
                getResources().getString(R.string.sponsor_img_27),
                getResources().getString(R.string.sponsor_img_28),
                getResources().getString(R.string.sponsor_img_29),
                getResources().getString(R.string.sponsor_img_30),
                getResources().getString(R.string.sponsor_img_31),
                getResources().getString(R.string.sponsor_img_32),
                getResources().getString(R.string.sponsor_img_33),
                getResources().getString(R.string.sponsor_img_34),
                getResources().getString(R.string.sponsor_img_35),
                getResources().getString(R.string.sponsor_img_36),
                getResources().getString(R.string.sponsor_img_37),
                getResources().getString(R.string.sponsor_img_38)};

        final String[] mUrls = {getResources().getString(R.string.sponsor_1),
                getResources().getString(R.string.sponsor_2),
                getResources().getString(R.string.sponsor_3),
                getResources().getString(R.string.sponsor_4),
                getResources().getString(R.string.sponsor_5),
                getResources().getString(R.string.sponsor_6),
                getResources().getString(R.string.sponsor_7),
                getResources().getString(R.string.sponsor_8),
                getResources().getString(R.string.sponsor_9),
                getResources().getString(R.string.sponsor_10),
                getResources().getString(R.string.sponsor_11),
                getResources().getString(R.string.sponsor_12),
                getResources().getString(R.string.sponsor_13),
                getResources().getString(R.string.sponsor_14),
                getResources().getString(R.string.sponsor_15),
                getResources().getString(R.string.sponsor_16),
                getResources().getString(R.string.sponsor_17),
                getResources().getString(R.string.sponsor_18),
                getResources().getString(R.string.sponsor_19),
                getResources().getString(R.string.sponsor_20),
                getResources().getString(R.string.sponsor_21),
                getResources().getString(R.string.sponsor_22),
                getResources().getString(R.string.sponsor_23),
                getResources().getString(R.string.sponsor_24),
                getResources().getString(R.string.sponsor_25),
                getResources().getString(R.string.sponsor_26),
                getResources().getString(R.string.sponsor_27),
                getResources().getString(R.string.sponsor_28),
                getResources().getString(R.string.sponsor_29),
                getResources().getString(R.string.sponsor_30),
                getResources().getString(R.string.sponsor_31),
                getResources().getString(R.string.sponsor_32),
                getResources().getString(R.string.sponsor_33),
                getResources().getString(R.string.sponsor_34),
                getResources().getString(R.string.sponsor_35),
                getResources().getString(R.string.sponsor_36),
                getResources().getString(R.string.sponsor_37),
                getResources().getString(R.string.sponsor_38)};


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
