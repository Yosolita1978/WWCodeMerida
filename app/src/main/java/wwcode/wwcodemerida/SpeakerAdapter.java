package wwcode.wwcodemerida;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SpeakerAdapter extends BaseAdapter {

    private Context context;
    private String[] mNames;
    int[] mImages;

    public SpeakerAdapter(Context context, String[] names, int[] images){

        this.context = context;
        this.mNames = names;
        this.mImages = images;
    }

    @Override
    public int getCount() {
        return mNames.length;
    }

    @Override
    public Object getItem(int position) {
        return mNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_grid_speaker, null);
        }

        TextView nameView = (TextView)convertView.findViewById(R.id.name_speaker);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.image_speaker);

        nameView.setText(mNames[position]);
        imageView.setImageResource(mImages[position]);


        return convertView;
    }
}
