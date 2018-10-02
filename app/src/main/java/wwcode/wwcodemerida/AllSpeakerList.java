package wwcode.wwcodemerida;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class AllSpeakerList {

    public static AllSpeakerList allSpeakers = null;
    private Speaker[] mSpeakers;

    // Initial instance
    private AllSpeakerList(Context context) {
        mSpeakers = new Speaker[10];

        String speakerName1 = context.getResources().getString(R.string.speaker_name_1);
        String speakerJob1 = context.getResources().getString(R.string.speaker_job_1);
        String speakerBio1 = context.getResources().getString(R.string.speaker_bio_1);
        String speakerConf1 = context.getResources().getString(R.string.speaker_conference_1);
        String speakerLink1 = context.getResources().getString(R.string.speaker_LinkedIn_1);
        String speakerImg1 = context.getResources().getString(R.string.speaker_url_img_1);

        Speaker speakerOne = new Speaker(speakerName1, speakerJob1, speakerBio1, speakerConf1, speakerLink1, speakerImg1);
        mSpeakers[0] = speakerOne;

        String speakerName2 = context.getResources().getString(R.string.speaker_name_2);
        String speakerJob2 = context.getResources().getString(R.string.speaker_job_2);
        String speakerBio2 = context.getResources().getString(R.string.speaker_bio_2);
        String speakerConf2 = context.getResources().getString(R.string.speaker_conference_2);
        String speakerLink2 = context.getResources().getString(R.string.speaker_LinkedIn_2);
        String speakerImg2 = context.getResources().getString(R.string.speaker_url_img_2);

        Speaker speakerTwo = new Speaker(speakerName2, speakerJob2, speakerBio2, speakerConf2, speakerLink2, speakerImg2);
        mSpeakers[1] = speakerTwo;

        String speakerName3 = context.getResources().getString(R.string.speaker_name_3);
        String speakerJob3 = context.getResources().getString(R.string.speaker_job_3);
        String speakerBio3 = context.getResources().getString(R.string.speaker_bio_3);
        String speakerConf3 = context.getResources().getString(R.string.speaker_conference_3);
        String speakerLink3 = context.getResources().getString(R.string.speaker_LinkedIn_3);
        String speakerImg3 = context.getResources().getString(R.string.speaker_url_img_3);

        Speaker speakerTree = new Speaker(speakerName3, speakerJob3, speakerBio3, speakerConf3, speakerLink3, speakerImg3);
        mSpeakers[2] = speakerTree;

        String speakerName4 = context.getResources().getString(R.string.speaker_name_4);
        String speakerJob4 = context.getResources().getString(R.string.speaker_job_4);
        String speakerBio4 = context.getResources().getString(R.string.speaker_bio_4);
        String speakerConf4 = context.getResources().getString(R.string.speaker_conference_4);
        String speakerLink4 = context.getResources().getString(R.string.speaker_LinkedIn_4);
        String speakerImg4 = context.getResources().getString(R.string.speaker_url_img_4);

        Speaker speakerFour = new Speaker(speakerName4, speakerJob4, speakerBio4, speakerConf4, speakerLink4, speakerImg4);
        mSpeakers[3] = speakerFour;

        String speakerName5 = context.getResources().getString(R.string.speaker_name_5);
        String speakerJob5 = context.getResources().getString(R.string.speaker_job_5);
        String speakerBio5 = context.getResources().getString(R.string.speaker_bio_5);
        String speakerConf5 = context.getResources().getString(R.string.speaker_conference_5);
        String speakerLink5 = context.getResources().getString(R.string.speaker_LinkedIn_5);
        String speakerImg5 = context.getResources().getString(R.string.speaker_url_img_5);

        Speaker speakerFive = new Speaker(speakerName5, speakerJob5, speakerBio5, speakerConf5, speakerLink5, speakerImg5);
        mSpeakers[4] = speakerFive;

        String speakerName6 = context.getResources().getString(R.string.speaker_name_6);
        String speakerJob6 = context.getResources().getString(R.string.speaker_job_6);
        String speakerBio6 = context.getResources().getString(R.string.speaker_bio_6);
        String speakerConf6 = context.getResources().getString(R.string.speaker_conference_6);
        String speakerLink6 = context.getResources().getString(R.string.speaker_LinkedIn_6);
        String speakerImg6 = context.getResources().getString(R.string.speaker_url_img_6);

        Speaker speakerSix = new Speaker(speakerName6, speakerJob6, speakerBio6, speakerConf6, speakerLink6, speakerImg6);
        mSpeakers[5] = speakerSix;

        String speakerName7 = context.getResources().getString(R.string.speaker_name_7);
        String speakerJob7 = context.getResources().getString(R.string.speaker_job_7);
        String speakerBio7 = context.getResources().getString(R.string.speaker_bio_7);
        String speakerConf7 = context.getResources().getString(R.string.speaker_conference_7);
        String speakerLink7 = context.getResources().getString(R.string.speaker_LinkedIn_7);
        String speakerImg7 = context.getResources().getString(R.string.speaker_url_img_7);

        Speaker speakerSeven = new Speaker(speakerName7, speakerJob7, speakerBio7, speakerConf7, speakerLink7, speakerImg7);
        mSpeakers[6] = speakerSeven;

        String speakerName8 = context.getResources().getString(R.string.speaker_name_8);
        String speakerJob8 = context.getResources().getString(R.string.speaker_job_8);
        String speakerBio8 = context.getResources().getString(R.string.speaker_bio_8);
        String speakerConf8 = context.getResources().getString(R.string.speaker_conference_8);
        String speakerLink8 = context.getResources().getString(R.string.speaker_LinkedIn_8);
        String speakerImg8 = context.getResources().getString(R.string.speaker_url_img_8);

        Speaker speakerEight = new Speaker(speakerName8, speakerJob8, speakerBio8, speakerConf8, speakerLink8, speakerImg8);
        mSpeakers[7] = speakerEight;

        String speakerName9 = context.getResources().getString(R.string.speaker_name_9);
        String speakerJob9 = context.getResources().getString(R.string.speaker_job_9);
        String speakerBio9 = context.getResources().getString(R.string.speaker_bio_9);
        String speakerConf9 = context.getResources().getString(R.string.speaker_conference_9);
        String speakerLink9 = context.getResources().getString(R.string.speaker_LinkedIn_9);
        String speakerImg9 = context.getResources().getString(R.string.speaker_url_img_9);

        Speaker speakerNine = new Speaker(speakerName9, speakerJob9, speakerBio9, speakerConf9, speakerLink9, speakerImg9);
        mSpeakers[8] = speakerNine;

        String speakerName10 = context.getResources().getString(R.string.speaker_name_10);
        String speakerJob10 = context.getResources().getString(R.string.speaker_job_10);
        String speakerBio10 = context.getResources().getString(R.string.speaker_bio_10);
        String speakerConf10 = context.getResources().getString(R.string.speaker_conference_10);
        String speakerLink10 = context.getResources().getString(R.string.speaker_LinkedIn_10);
        String speakerImg10 = context.getResources().getString(R.string.speaker_url_img_10);

        Speaker speakerTen = new Speaker(speakerName10, speakerJob10, speakerBio10, speakerConf10, speakerLink10, speakerImg10);
        mSpeakers[9] = speakerTen;

    }

    // Method to grab all the speakers
    public static AllSpeakerList getAllSpeakers(Context context) {
        if (allSpeakers == null) {
            allSpeakers = new AllSpeakerList(context);
        }
        return allSpeakers;
    }

    // Method to grab a speaker for index. Used to change the intents

    public Speaker getSpeakerbyIndex(int index) {
        return mSpeakers[index];
    }

    // Method to grab the length of all the speakers
    public int getLeght(){
        return mSpeakers.length;
    }

}
