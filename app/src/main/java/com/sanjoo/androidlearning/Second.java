package com.sanjoo.androidlearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    int progress_value;
    SeekBar skBar;
    TextView skBar_result;
    ProgressBar progressBar;
    Button progress_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        skBar=findViewById(R.id.seekBar);
        progressBar=findViewById(R.id.my_progressBar);
        skBar_result=findViewById(R.id.seekBar_result);
        progress_btn=findViewById(R.id.progressBar_btn);
        skBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress_value;
            @Override
            public void onProgressChanged(SeekBar seekBar, int new_progress_value, boolean fromUser) {
                progress_value=new_progress_value;
//                skBar_result.setText(progress_value+"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
//                skBar_result.setText(progress_value+"");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                skBar_result.setText(progress_value+"");
            }
        });
    }

    public void openAlertDialog(View view){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(Second.this);
        alertDialogBuilder.setIcon(R.drawable.alert1);
        alertDialogBuilder.setTitle("Close window");
        alertDialogBuilder.setMessage("want to close ??");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(Second.this,"You clicked yes",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Second.this,"you clicked No",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Second.this,"You clicked Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.show();
    }

    public void openCustomAlertDialog(View view){
        Dialog dialog=new Dialog(Second.this);
        dialog.setContentView(R.layout.custom_alert_dialog);

        Button customButton=dialog.findViewById(R.id.custom_dialog_btn);
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Second.this,"custom btn open",Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }



    public void startProgressBar(View view){
        progress_btn.setVisibility(View.GONE);
        setProgressBarValue(progress_value);
    }
    void setProgressBarValue(int i){

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
                progressBar.setProgress(i+1);
                setProgressBarValue(i+1);
            }
        });
        thread.start();
    }
    public void openProgressDialog(View view){
        ProgressDialog progressDialog=new ProgressDialog(Second.this);
        progressDialog.setIcon(R.drawable.alert1);
        progressDialog.setTitle("Progress Dialog");
        progressDialog.setMessage("this is a message");
        progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    progressDialog.dismiss();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
    public void openPrgDialog(View view){
        ProgressDialog progressDialog=new ProgressDialog(Second.this);
        progressDialog.setTitle("Title");
        progressDialog.setMessage("Message");
        progressDialog.setIcon(R.drawable.pic2);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setCancelable(false);
        progressDialog.show();


        Handler handler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                progressDialog.incrementProgressBy(1);
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
         while (progressDialog.getProgress()<=100){
             Thread.sleep(200);
             handler.sendMessage(handler.obtainMessage());
             if(progressDialog.getProgress()==100){
                 progressDialog.dismiss();
             }
         }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}


















