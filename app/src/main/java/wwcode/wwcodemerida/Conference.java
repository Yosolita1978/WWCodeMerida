package wwcode.wwcodemerida;


public class Conference {

    private String mConferenceName;

    private String mConferenceType;

    private String mConferenceStartHour;

    private String mConferenceEndHour;

    private String mConferenceDescription;

    private String mConferenceAuthor;


    // A short construtor of the Conference Object for the list

    public Conference(String conferenceStartHour, String conferenceAuthor, String conferenceName, String conferenceDescription){
        mConferenceStartHour = conferenceStartHour;
        mConferenceAuthor = conferenceAuthor;
        mConferenceName = conferenceName;
        mConferenceDescription = conferenceDescription;
    }

    // The real construtor of the Conference Object

    public Conference(String conferenceStartHour, String conferenceEndHour, String conferenceAuthor, String conferenceType, String conferenceName, String conferenceDescription ) {
        mConferenceStartHour = conferenceStartHour;
        mConferenceEndHour = conferenceEndHour;
        mConferenceAuthor = conferenceAuthor;
        mConferenceType = conferenceType;
        mConferenceName = conferenceName;
        mConferenceDescription = conferenceDescription;
    }

    /**
     * Getter method for Conference Name
     * @return conferenceName
     */
    public String getConferenceName(){
        return mConferenceName;
    }

    /**
     * Getter method for Conference Start Hour
     * @return conferenceStartHour
     */
    public String getConferenceStartHour(){
        return mConferenceStartHour;
    }

    /**
     * Getter method for Conference End Hour
     * @return conferenceEndHour
     */
    public String getConferenceEndHour(){
        return mConferenceEndHour;
    }

    /**
     * Getter method for Conference Type
     * @return conferenceType
     */
    public String getConferenceType(){
        return mConferenceType;
    }

    /**
     * Getter method for Conference Author
     * @return conferenceAuthor
     */
    public String getConferenceAuthor(){
        return mConferenceAuthor;
    }

    /**
     * Getter method for Conference Description
     * @return conferenceDescription
     */
    public String getConferenceDescription(){
        return mConferenceDescription;
    }

}
