package com.reminderapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tasks.medicine.study.reminderapp.R;

public class HelpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle(R.string.help_activity_action_bar_title);

        TextView helpActivityTextView=findViewById(R.id.help_activity_text_view);


        helpActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendHelpEmail();

            }
        });



    }

    private void sendHelpEmail() {
        String[] helpEmailReceiverAddresses={"muhammadmubaasimtcse@gmail.com"};
        Intent sendHelpEmailIntent = new Intent(Intent.ACTION_SENDTO);
        sendHelpEmailIntent.setData(Uri.parse("mailto:"));
        sendHelpEmailIntent.putExtra(Intent.EXTRA_EMAIL, helpEmailReceiverAddresses);

        if (sendHelpEmailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendHelpEmailIntent);
        }

    }






}
