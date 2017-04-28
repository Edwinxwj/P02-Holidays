package sg.edu.rp.c346.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

/**
 * Created by 15056215 on 28/4/2017.
 */

public class HolidaysAdapter extends ArrayAdapter<Holidays> {

    private Context context;
    private ArrayList<Holidays> holidays;
    private TextView tvname;
    private TextView tvdate;
    private ImageView ivimage;

    public HolidaysAdapter(Context context, int resource, ArrayList<Holidays> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvname = (TextView) rowView.findViewById(R.id.tvName);
        tvdate = (TextView) rowView.findViewById(R.id.tvDate);
        // Get the ImageView object
        ivimage = (ImageView) rowView.findViewById(R.id.ivImage);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holidays currentHolidays = holidays.get(position);
        // Set the TextView to show the food

        tvname.setText(currentHolidays.getName());
        tvdate.setText(currentHolidays.getDate());
//        String img = currentHolidays.getimage();
//        int holiday = this.context.getResources().getIdentifier(img, "drawable", context.getPackageName());
//        ivimage.setImageResource(holiday);

        if(currentHolidays.getName().equals("New Year's Holiday")){
            ivimage.setImageResource(R.drawable.newyear);
        }
        else if (currentHolidays.getName() == "Chinese New Year") {
            ivimage.setImageResource(R.drawable.cny);
        }
        else if (currentHolidays.getName() == "Good Friday") {
            ivimage.setImageResource(R.drawable.goodfriday);
        }
        else {
            ivimage.setImageResource(R.drawable.labourday);
        }


        return rowView;
    }
}



