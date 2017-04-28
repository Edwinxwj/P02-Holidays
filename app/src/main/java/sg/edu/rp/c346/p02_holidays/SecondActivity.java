package sg.edu.rp.c346.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvType;
    ArrayAdapter aa;
    ArrayList<Holidays> Holidays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvHolidays);
        tvType = (TextView) findViewById(R.id.tvType);

        Holidays = new ArrayList<Holidays>();

        aa = new HolidaysAdapter(this, R.layout.row, Holidays);
        lv.setAdapter(aa);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvType.setText(year);
//
        if(year.equals("Secular")) {
            Holidays.add(new Holidays("New Year's Holiday","1 Jan 2017"));
            Holidays.add(new Holidays("Labour Day","1 May 2017"));
        } else {
            Holidays.add(new Holidays("Chinese New Year","28-29 Jan 2017"));
            Holidays.add(new Holidays("Good Friday","14 April 2017"));
        }



    }



    }

