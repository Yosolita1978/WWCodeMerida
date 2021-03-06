package wwcode.wwcodemerida;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class AllConferenceList {

    public static AllConferenceList allConferences = null;
    private Conference[] mConferences;

    // Initial instance
    private AllConferenceList(Context context) {
        mConferences = new Conference[16];

        String conferenceOneHour = context.getResources().getString(R.string.start_hour_event_one);
        String conferenceEndHourOne = context.getResources().getString(R.string.end_hour_event_one);
        String conferenceOneAuthor = context.getResources().getString(R.string.author_event_one);
        String conferenceOneType = context.getResources().getString(R.string.type_event_one);
        String conferenceOneName = context.getResources().getString(R.string.name_event_one);
        String conferenceOneDesc = context.getResources().getString(R.string.description_event_one);


        Conference conferenceOne = new Conference(conferenceOneHour, conferenceEndHourOne, conferenceOneAuthor, conferenceOneType, conferenceOneName, conferenceOneDesc);
        mConferences[0] = conferenceOne;

        String conferenceTwoHour = context.getResources().getString(R.string.start_hour_event_two);
        String conferenceEndHourTwo = context.getResources().getString(R.string.end_hour_event_two);
        String conferenceTwoAuthor = context.getResources().getString(R.string.author_event_two);
        String conferenceTwoType = context.getResources().getString(R.string.type_event_two);
        String conferenceTwoName = context.getResources().getString(R.string.name_event_two);
        String conferenceTwoDesc = context.getResources().getString(R.string.description_event_two);


        Conference conferenceTwo = new Conference(conferenceTwoHour, conferenceEndHourTwo, conferenceTwoAuthor, conferenceTwoType, conferenceTwoName, conferenceTwoDesc);
        mConferences[1] = conferenceTwo;

        String conference3Hour = context.getResources().getString(R.string.start_hour_event_3);
        String conference3EndHour = context.getResources().getString(R.string.end_hour_event_3);
        String conference3Author = context.getResources().getString(R.string.author_event_3);
        String conference3Type = context.getResources().getString(R.string.type_event_3);
        String conference3Name = context.getResources().getString(R.string.name_event_3);
        String conference3Desc = context.getResources().getString(R.string.description_event_3);


        Conference conference3 = new Conference(conference3Hour, conference3EndHour, conference3Author, conference3Type, conference3Name, conference3Desc);
        mConferences[2] = conference3;

        String conference4Hour = context.getResources().getString(R.string.start_hour_event_4);
        String conference4EndHour = context.getResources().getString(R.string.end_hour_event_4);
        String conference4Author = context.getResources().getString(R.string.author_event_4);
        String conference4Type = context.getResources().getString(R.string.type_event_4);
        String conference4Name = context.getResources().getString(R.string.name_event_4);
        String conference4Desc = context.getResources().getString(R.string.description_event_4);


        Conference conference4 = new Conference(conference4Hour,  conference4EndHour, conference4Author, conference4Type, conference4Name, conference4Desc);
        mConferences[3] = conference4;

        String conference5Hour = context.getResources().getString(R.string.start_hour_event_5);
        String conference5EndHour = context.getResources().getString(R.string.end_hour_event_5);
        String conference5Author = context.getResources().getString(R.string.author_event_5);
        String conference5Type = context.getResources().getString(R.string.type_event_5);
        String conference5Name = context.getResources().getString(R.string.name_event_5);
        String conference5Desc = context.getResources().getString(R.string.description_event_5);


        Conference conference5 = new Conference(conference5Hour, conference5EndHour, conference5Author, conference5Type, conference5Name, conference5Desc);
        mConferences[4] = conference5;

        String conference6Hour = context.getResources().getString(R.string.start_hour_event_6);
        String conference6EndHour = context.getResources().getString(R.string.end_hour_event_6);
        String conference6Author = context.getResources().getString(R.string.author_event_6);
        String conference6Type = context.getResources().getString(R.string.type_event_6);
        String conference6Name = context.getResources().getString(R.string.name_event_6);
        String conference6Desc = context.getResources().getString(R.string.description_event_6);


        Conference conference6 = new Conference(conference6Hour, conference6EndHour, conference6Author, conference6Type, conference6Name, conference6Desc);
        mConferences[5] = conference6;

        String conference7Hour = context.getResources().getString(R.string.start_hour_event_7);
        String conference7EndHour = context.getResources().getString(R.string.end_hour_event_7);
        String conference7Author = context.getResources().getString(R.string.author_event_7);
        String conference7Type = context.getResources().getString(R.string.type_event_7);
        String conference7Name = context.getResources().getString(R.string.name_event_7);
        String conference7Desc = context.getResources().getString(R.string.description_event_7);


        Conference conference7 = new Conference(conference7Hour, conference7EndHour, conference7Author, conference7Type, conference7Name, conference7Desc);
        mConferences[6] = conference7;

        String conference8Hour = context.getResources().getString(R.string.start_hour_event_8);
        String conference8EndHour = context.getResources().getString(R.string.end_hour_event_8);
        String conference8Author = context.getResources().getString(R.string.author_event_8);
        String conference8Type = context.getResources().getString(R.string.type_event_8);
        String conference8Name = context.getResources().getString(R.string.name_event_8);
        String conference8Desc = context.getResources().getString(R.string.description_event_8);


        Conference conference8 = new Conference(conference8Hour, conference8EndHour, conference8Author, conference8Type, conference8Name, conference8Desc);
        mConferences[7] = conference8;

        String conference9Hour = context.getResources().getString(R.string.start_hour_event_9);
        String conference9EndHour = context.getResources().getString(R.string.end_hour_event_9);
        String conference9Author = context.getResources().getString(R.string.author_event_9);
        String conference9Type = context.getResources().getString(R.string.type_event_9);
        String conference9Name = context.getResources().getString(R.string.name_event_9);
        String conference9Desc = context.getResources().getString(R.string.description_event_9);


        Conference conference9 = new Conference(conference9Hour, conference9EndHour, conference9Author, conference9Type, conference9Name, conference9Desc);
        mConferences[8] = conference9;

        String conference10Hour = context.getResources().getString(R.string.start_hour_event_10);
        String conference10EndHour = context.getResources().getString(R.string.end_hour_event_10);
        String conference10Author = context.getResources().getString(R.string.author_event_10);
        String conference10Type = context.getResources().getString(R.string.type_event_10);
        String conference10Name = context.getResources().getString(R.string.name_event_10);
        String conference10Desc = context.getResources().getString(R.string.description_event_10);


        Conference conference10 = new Conference(conference10Hour, conference10EndHour, conference10Author, conference10Type, conference10Name, conference10Desc);
        mConferences[9] = conference10;

        String conference11Hour = context.getResources().getString(R.string.start_hour_event_11);
        String conference11EndHour = context.getResources().getString(R.string.end_hour_event_11);
        String conference11Author = context.getResources().getString(R.string.author_event_11);
        String conference11Type = context.getResources().getString(R.string.type_event_11);
        String conference11Name = context.getResources().getString(R.string.name_event_11);
        String conference11Desc = context.getResources().getString(R.string.description_event_11);


        Conference conference11 = new Conference(conference11Hour, conference11EndHour, conference11Author, conference11Type, conference11Name, conference11Desc);
        mConferences[10] = conference11;

        String conference12Hour = context.getResources().getString(R.string.start_hour_event_12);
        String conference12EndHour = context.getResources().getString(R.string.end_hour_event_12);
        String conference12Author = context.getResources().getString(R.string.author_event_12);
        String conference12Type = context.getResources().getString(R.string.type_event_12);
        String conference12Name = context.getResources().getString(R.string.name_event_12);
        String conference12Desc = context.getResources().getString(R.string.description_event_12);


        Conference conference12 = new Conference(conference12Hour, conference12EndHour, conference12Author, conference12Type, conference12Name, conference12Desc);
        mConferences[11] = conference12;

        String conference13Hour = context.getResources().getString(R.string.start_hour_event_13);
        String conference13EndHour = context.getResources().getString(R.string.end_hour_event_13);
        String conference13Author = context.getResources().getString(R.string.author_event_13);
        String conference13Type = context.getResources().getString(R.string.type_event_13);
        String conference13Name = context.getResources().getString(R.string.name_event_13);
        String conference13Desc = context.getResources().getString(R.string.description_event_13);


        Conference conference13 = new Conference(conference13Hour, conference13EndHour, conference13Author, conference13Type, conference13Name, conference13Desc);
        mConferences[12] = conference13;

        String conference14Hour = context.getResources().getString(R.string.start_hour_event_14);
        String conference14EndHour = context.getResources().getString(R.string.end_hour_event_14);
        String conference14Author = context.getResources().getString(R.string.author_event_14);
        String conference14Type = context.getResources().getString(R.string.type_event_14);
        String conference14Name = context.getResources().getString(R.string.name_event_14);
        String conference14Desc = context.getResources().getString(R.string.description_event_14);


        Conference conference14 = new Conference(conference14Hour, conference14EndHour, conference14Author, conference14Type, conference14Name, conference14Desc);
        mConferences[13] = conference14;

        String conference15Hour = context.getResources().getString(R.string.start_hour_event_15);
        String conference15EndHour = context.getResources().getString(R.string.end_hour_event_15);
        String conference15Author = context.getResources().getString(R.string.author_event_15);
        String conference15Type = context.getResources().getString(R.string.type_event_15);
        String conference15Name = context.getResources().getString(R.string.name_event_15);
        String conference15Desc = context.getResources().getString(R.string.description_event_15);


        Conference conference15 = new Conference(conference15Hour, conference15EndHour, conference15Author, conference15Type, conference15Name, conference15Desc);
        mConferences[14] = conference15;

        String conference16Hour = context.getResources().getString(R.string.start_hour_event_16);
        String conference16EndHour = context.getResources().getString(R.string.end_hour_event_16);
        String conference16Author = context.getResources().getString(R.string.author_event_16);
        String conference16Type = context.getResources().getString(R.string.type_event_16);
        String conference16Name = context.getResources().getString(R.string.name_event_16);
        String conference16Desc = context.getResources().getString(R.string.description_event_16);


        Conference conference16 = new Conference(conference16Hour, conference16EndHour, conference16Author, conference16Type, conference16Name, conference16Desc);
        mConferences[15] = conference16;

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

    // Method to grab the length of all the conferences
    public int getLeght(){
        return mConferences.length;
    }


    // Method to grab a conference for author. Used to change the intents

    public int findConferencebyAuthor(String author) {
        int conferenceByAuthorIndex = -1;
        for (int i = 0; i < mConferences.length; i++) {
            if (mConferences[i].getConferenceAuthor().equals(author)) {
                conferenceByAuthorIndex = i;
            }
        }

        return conferenceByAuthorIndex;
    }
}
