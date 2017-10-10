package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView teamA,teamB;
    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA = (TextView) findViewById(R.id.teamAScore);
         teamB = (TextView) findViewById(R.id.teamBScore);
        Button button3A = (Button) findViewById(R.id.threePointsA);
        button3A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                scoreA+=3;

                teamA.setText(""+ scoreA);
            }
        });
        Button button2A = (Button) findViewById(R.id.twoPointsA);
        button2A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                scoreA+=2;

                teamA.setText(""+ scoreA);
            }
        });
        Button button1A = (Button) findViewById(R.id.freeThrowA);
        button1A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                scoreA+=1;

                teamA.setText(""+ scoreA);
            }
        });
        Button button3B = (Button) findViewById(R.id.threePointsB);
        button3B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                scoreB+=3;

                teamB.setText(""+ scoreB);
            }
        });
        Button button2B = (Button) findViewById(R.id.twoPointsB);
        button2B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                scoreB+=2;

                teamB.setText(""+ scoreB);
            }
        });
        Button button1B = (Button) findViewById(R.id.freeThrowB);
        button1B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                scoreB+=1;

                teamB.setText(""+ scoreB);
                dialogBox();

            }
        });


    }
    public void dialogBox()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Click on Image for tag");
        alertDialogBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        scoreA=0;
                        scoreB=0;
                        teamA.setText(""+scoreA);
                        teamB.setText(""+scoreB);
                    }
                });

        alertDialogBuilder.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
