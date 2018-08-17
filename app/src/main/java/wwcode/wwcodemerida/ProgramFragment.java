package wwcode.wwcodemerida;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgramFragment extends Fragment {


    public ProgramFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_program, container, false);


        //Start the allConferences instance
        AllConferenceList allconferences = AllConferenceList.getAllConferences(getContext());
        ArrayList<Conference> conferenceArrayList = new ArrayList<Conference>();
        for(int i = 0; i < allconferences.getLeght(); i++){
            conferenceArrayList.add(allconferences.getConferencebyIndex(i));
        }


        //Start the Placeadapter and the ListView
        ConferenceAdapter conferencesAdapter = new ConferenceAdapter(getContext(), conferenceArrayList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //Using bundle to send two extras with the intent
                Intent intent = new Intent(getActivity(), MainActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("indexPlaceSelected", position);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        listView.setAdapter(conferencesAdapter);

        return  rootView;
    }


}
