package com.example.innoserve24_07;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class EatTogether1_1_add_activity extends AppCompatActivity {
    private EditText editDate;
    private Button dateButton;
    private TextView dateText;
    private TextView listText;
    private Button listButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_together1_1_add_activity);
        Button add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EatTogether1_1_add_activity.this.finish();
            }
        });
        editDate=(EditText)findViewById(R.id.editDate);
        dateText = (TextView)findViewById(R.id.dateText);
        dateButton = (Button)findViewById(R.id.dateButton);
        dateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Use the current time as the default values for the picker
                final Calendar c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);
                // Create a new instance of TimePickerDialog and return it
                new TimePickerDialog(EatTogether1_1_add_activity.this, new TimePickerDialog.OnTimeSetListener(){

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        dateText.setText(hourOfDay + ":" + minute);
                    }
                }, hour, minute, false).show();
            }

        });
        listButton = (Button)findViewById(R.id.listButton);
        listText=(TextView) findViewById(R.id.listText);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myListAlertDialog();
            }
        });
    }
    public void datePicker(View v){
        Calendar calendar= Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        new DatePickerDialog(v.getContext(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day){
                String datetime=String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
                editDate.setText(datetime);
            }
        },year,month,day).show();
    }
    AlertDialog myListAlertDialog;
    private void myListAlertDialog() {
        final String[] ListStr = { "東社社區活動中心", "東勢社區活動中心", "獅子林社區活動中心", "北興社區活動中心", "北勢社區活動中心",
        "山峰社區活動中心","山峰社區長壽俱樂部","山子頂社區活動中心","高連社區活動中心","廣隆社區活動中心", "黃唐社區活動中心","佳安社區活動中心",
                "九龍社區活動中心","中山社區活動中心","烏林社區活動中心","八德社區活動中心","三和社區活動中心","三水社區活動中心","高平社區活動中心","上林社區活動中心"};
        AlertDialog.Builder MyListAlertDialog = new AlertDialog.Builder(this);
        MyListAlertDialog.setTitle("標題");
        // 建立List的事件
        DialogInterface.OnClickListener ListClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                /*Toast.makeText(EatTogether1_1_add_activity.this, ListStr[which],// 顯示所點選的選項
                        Toast.LENGTH_LONG).show();*/
                listText.setText(ListStr[which]);

            }
        };
        // 建立按下取消什麼事情都不做的事件
        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        };
        MyListAlertDialog.setItems(ListStr, ListClick);
        MyListAlertDialog.setNeutralButton("取消", OkClick);
        MyListAlertDialog.show();
    }

    AlertDialog myDialog;//listdialog
    private void showAlert()
    {
        AlertDialog.Builder myBuilder=new AlertDialog.Builder(this);
        final CharSequence[] nebulae={"Boomerang","Onion"};
        myBuilder.setTitle("list").setItems(nebulae, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int position) {
                    Toast.makeText(EatTogether1_1_add_activity.this,nebulae[position].toString(),Toast.LENGTH_LONG).show();
            }
        });
        myDialog=myBuilder.create();
        myDialog.show();
    }

}
