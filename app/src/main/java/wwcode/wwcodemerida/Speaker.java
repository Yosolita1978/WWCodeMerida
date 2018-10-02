package wwcode.wwcodemerida;


import android.graphics.drawable.Drawable;
import android.media.Image;

public class Speaker {

    private String mSpeakerName;

    private String mSpeakerJob;

    private String mSpeakerBio;

    private String mSpeakerImg;

    private String mSpeakerLinkedIn;

    private String mSpeakerConference;


    // A short construtor of the Speaker Object for the list

    public Speaker(String speakerName, String speakerJob, String speakerImage){
        mSpeakerName = speakerName;
        mSpeakerJob = speakerJob;
        mSpeakerImg = speakerImage;
    }

    // The real construtor of the Speaker Object

    public Speaker(String speakerName, String speakerJob, String speakerBio, String speakerConference, String speakerLinkedIn, String speakerImg ) {
        mSpeakerName = speakerName;
        mSpeakerJob = speakerJob;
        mSpeakerBio = speakerBio;
        mSpeakerConference = speakerConference;
        mSpeakerLinkedIn = speakerLinkedIn;
        mSpeakerImg = speakerImg;
    }

    /**
     * Getter method for Speaker Name
     * @return speakername
     */
    public String getSpeakerName(){
        return mSpeakerName;
    }


    /**
     * Getter method for Speaker Job
     * @return speakerJob
     */
    public String getSpeakerJob(){
        return mSpeakerJob;
    }

    /**
     * Getter method for Speaker Bio
     * @return speakerBio
     */
    public String getSpeakerBio(){
        return mSpeakerBio;
    }

    /**
     * Getter method for Speaker Job
     * @return speakerJob
     */
    public String getSpeakerConference(){
        return mSpeakerConference;
    }

    /**
     * Getter method for Speaker LinkedIn
     * @return speakerLinkedIn
     */
    public String getSpeakerLinkedIn(){
        return mSpeakerLinkedIn;
    }

    /**
     * Getter method for Speaker Image
     * @return speakerImg
     */
    public String getSpeakerImg(){
        return mSpeakerImg;
    }

}

