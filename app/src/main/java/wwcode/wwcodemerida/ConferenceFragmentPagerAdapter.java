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
        } else if (position == 3) {
            return new VenueFragment();
        } else{
            return new SponsorFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.conference);
        } else if (position == 1) {
            return mContext.getString(R.string.program);
        } else if (position == 2) {
            return mContext.getString(R.string.people);
        }else if (position == 3) {
            return mContext.getString(R.string.venue);

        }else {
            return mContext.getString(R.string.sponsors);
        }
    }
}
