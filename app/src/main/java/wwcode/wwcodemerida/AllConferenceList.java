package wwcode.wwcodemerida;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class AllConferenceList {

    public static AllConferenceList allConferences = null;
    private Conference[] mConferences;

    // Initial instance
    private AllConferenceList(Context context) {
        mConferences = new Conference[13];

        String conferenceOneHour = context.getResources().getString(R.string.start_hour_event_one);
        String conferenceOneAuthor = context.getResources().getString(R.string.author_event_one);
        String conferenceOneName = context.getResources().getString(R.string.name_event_one);
        String conferenceOneDesc = context.getResources().getString(R.string.description_event_one);


        Conference conferenceOne = new Conference(conferenceOneHour, conferenceOneAuthor, conferenceOneName, conferenceOneDesc);
        mConferences[0] = conferenceOne;

        String conferenceTwoHour = context.getResources().getString(R.string.start_hour_event_two);
        String conferenceTwoAuthor = context.getResources().getString(R.string.author_event_two);
        String conferenceTwoName = context.getResources().getString(R.string.name_event_two);
        String conferenceTwoDesc = context.getResources().getString(R.string.description_event_two);


        Conference conferenceTwo = new Conference(conferenceTwoHour, conferenceTwoAuthor, conferenceTwoName, conferenceTwoDesc);
        mConferences[1] = conferenceTwo;

        String conference3Hour = context.getResources().getString(R.string.start_hour_event_3);
        String conference3Author = context.getResources().getString(R.string.author_event_3);
        String conference3Name = context.getResources().getString(R.string.name_event_3);
        String conference3Desc = context.getResources().getString(R.string.description_event_3);


        Conference conference3 = new Conference(conference3Hour, conference3Author, conference3Name, conference3Desc);
        mConferences[2] = conference3;

        String conference4Hour = context.getResources().getString(R.string.start_hour_event_4);
        String conference4Author = context.getResources().getString(R.string.author_event_4);
        String conference4Name = context.getResources().getString(R.string.name_event_4);
        String conference4Desc = context.getResources().getString(R.string.description_event_4);


        Conference conference4 = new Conference(conference4Hour, conference4Author, conference4Name, conference4Desc);
        mConferences[3] = conference4;

        String conference5Hour = context.getResources().getString(R.string.start_hour_event_5);
        String conference5Author = context.getResources().getString(R.string.author_event_5);
        String conference5Name = context.getResources().getString(R.string.name_event_5);
        String conference5Desc = context.getResources().getString(R.string.description_event_5);


        Conference conference5 = new Conference(conference5Hour, conference5Author, conference5Name, conference5Desc);
        mConferences[4] = conference5;

        String conference6Hour = context.getResources().getString(R.string.start_hour_event_6);
        String conference6Author = context.getResources().getString(R.string.author_event_6);
        String conference6Name = context.getResources().getString(R.string.name_event_6);
        String conference6Desc = context.getResources().getString(R.string.description_event_6);


        Conference conference6 = new Conference(conference6Hour, conference6Author, conference6Name, conference6Desc);
        mConferences[5] = conference6;

        String conference7Hour = context.getResources().getString(R.string.start_hour_event_7);
        String conference7Author = context.getResources().getString(R.string.author_event_7);
        String conference7Name = context.getResources().getString(R.string.name_event_7);
        String conference7Desc = context.getResources().getString(R.string.description_event_7);


        Conference conference7 = new Conference(conference7Hour, conference7Author, conference7Name, conference7Desc);
        mConferences[6] = conference7;

        String conference8Hour = context.getResources().getString(R.string.start_hour_event_8);
        String conference8Author = context.getResources().getString(R.string.author_event_8);
        String conference8Name = context.getResources().getString(R.string.name_event_8);
        String conference8Desc = context.getResources().getString(R.string.description_event_8);


        Conference conference8 = new Conference(conference8Hour, conference8Author, conference8Name, conference8Desc);
        mConferences[7] = conference8;

        String conference9Hour = context.getResources().getString(R.string.start_hour_event_9);
        String conference9Author = context.getResources().getString(R.string.author_event_9);
        String conference9Name = context.getResources().getString(R.string.name_event_9);
        String conference9Desc = context.getResources().getString(R.string.description_event_9);


        Conference conference9 = new Conference(conference9Hour, conference9Author, conference9Name, conference9Desc);
        mConferences[8] = conference9;

        String conference10Hour = context.getResources().getString(R.string.start_hour_event_10);
        String conference10Author = context.getResources().getString(R.string.author_event_10);
        String conference10Name = context.getResources().getString(R.string.name_event_10);
        String conference10Desc = context.getResources().getString(R.string.description_event_10);


        Conference conference10 = new Conference(conference10Hour, conference10Author, conference10Name, conference10Desc);
        mConferences[9] = conference10;

        String conference11Hour = context.getResources().getString(R.string.start_hour_event_11);
        String conference11Author = context.getResources().getString(R.string.author_event_11);
        String conference11Name = context.getResources().getString(R.string.name_event_11);
        String conference11Desc = context.getResources().getString(R.string.description_event_11);


        Conference conference11 = new Conference(conference11Hour, conference11Author, conference11Name, conference11Desc);
        mConferences[10] = conference11;

        String conference12Hour = context.getResources().getString(R.string.start_hour_event_12);
        String conference12Author = context.getResources().getString(R.string.author_event_12);
        String conference12Name = context.getResources().getString(R.string.name_event_12);
        String conference12Desc = context.getResources().getString(R.string.description_event_12);


        Conference conference12 = new Conference(conference12Hour, conference12Author, conference12Name, conference12Desc);
        mConferences[11] = conference12;

        String conference13Hour = context.getResources().getString(R.string.start_hour_event_13);
        String conference13Author = context.getResources().getString(R.string.author_event_13);
        String conference13Name = context.getResources().getString(R.string.name_event_13);
        String conference13Desc = context.getResources().getString(R.string.description_event_13);


        Conference conference13 = new Conference(conference13Hour, conference13Author, conference13Name, conference13Desc);
        mConferences[12] = conference13;
    }

    // Method to grab a place for index. Used to change the intents

    public Conference getConferencebyIndex(int index) {
        return mConferences[index];
    }

    // Method to grab all the places
    public static AllConferenceList getAllConferences(Context context) {
        if (allConferences == null) {
            allConferences = new AllConferenceList(context);
        }
        return allConferences;
    }

    public int getLeght(){
        return mConferences.length;
    }
}
