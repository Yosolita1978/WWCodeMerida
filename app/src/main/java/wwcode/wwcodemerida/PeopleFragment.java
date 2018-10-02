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
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


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


        //Start the allConferences instance
        AllSpeakerList allspeakers = AllSpeakerList.getAllSpeakers(getContext());
        ArrayList<Speaker> speakersArrayList = new ArrayList<Speaker>();
        for(int i = 0; i < allspeakers.getLeght(); i++){
            speakersArrayList.add(allspeakers.getSpeakerbyIndex(i));
        }


        //Start the Speakeradapter and the ListView
        SpeakerAdapter mAdapter = new SpeakerAdapter(getContext(), speakersArrayList);

        ListView mListView = (ListView) rootView.findViewById(R.id.list);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //Using bundle to send one extra with the intent

                Intent intent = new Intent(getActivity(), SingleSpeakerActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("indexSpeakSelected", position);
                intent.putExtras(extras);
//                Log.d("LOG", Integer.toString(position));
                startActivity(intent);
            }
        });

        mListView.setAdapter(mAdapter);

        return  rootView;

    }

}
