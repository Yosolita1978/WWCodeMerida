package wwcode.wwcodemerida;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ConferenceFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;


    public ConferenceFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ConferenceFragment();
        } else if (position == 1){
            return new ProgramFragment();
        } else if (position == 2){
            return new PeopleFragment();
        } else{
            return new VenueFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.conference);
        } else if (position == 1) {
            return mContext.getString(R.string.program);
        } else if (position == 2) {
            return mContext.getString(R.string.people);
        }else {
            return mContext.getString(R.string.venue);
        }
    }
}
