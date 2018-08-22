package wwcode.wwcodemerida;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import static wwcode.wwcodemerida.R.layout.item_grid_sponsor;

public class SponsorAdapter extends BaseAdapter {

    int[] mImages;
    String [] mUrls;
    private Context context;

    public SponsorAdapter(Context context, int[] images, String[] urls) {

        this.context = context;
        this.mImages = images;
        this.mUrls = urls;
    }

    @Override
    public int getCount() {
        return mImages.length;
    }

    @Override
    public Object getItem(int position) {
        return mImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(item_grid_sponsor, null);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_sponsor);

        imageView.setImageResource(mImages[position]);

        return convertView;
    }
}