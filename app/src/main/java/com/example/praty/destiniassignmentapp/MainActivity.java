package com.example.praty.destiniassignmentapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;
    private TextView mTextView;
    private int mIndex;
    private int mQuestionID;
    private int mOption1ID;
    private int mOption2ID;

    private StoryGG[] mStoryGGS= new StoryGG[]{
            new StoryGG(R.string.question1_name,R.string.answer11_name,R.string.answer12_name),
            new StoryGG(R.string.question2_name,R.string.answer21_name,R.string.answer22_name),
            new StoryGG(R.string.question3_name,R.string.answer31_name,R.string.answer32_name)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1= (Button) findViewById(R.id.option1_button);
        mButton2= (Button) findViewById(R.id.option2_button);
        mTextView= (TextView) findViewById(R.id.textView);




        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update(0);

            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update(1);

            }
        });
    }

    public void update(int i){
        if(mIndex==2 && (i==0 || i==1)){

            AlertDialog.Builder alert= new AlertDialog.Builder(this);
            alert.setCancelable(false);
            alert.setTitle("Story time over!");
            alert.setMessage("Thanks for bearing with me");
            alert.setPositiveButton("Close application", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.show();



        }
       else if(i==0)
        {
            mIndex+=1;
            if(mIndex==2)
                mButton1.setVisibility(View.GONE);
            mQuestionID=mStoryGGS[mIndex].getQuesID();
            mOption1ID=mStoryGGS[mIndex].getAns1ID();
            mOption2ID=mStoryGGS[mIndex].getAns2ID();
            mTextView.setText(mQuestionID);
            mButton1.setText(mOption1ID);
            mButton2.setText(mOption2ID);
        }
        else if(i==1) {
            mIndex=2;
            mButton1.setVisibility(View.GONE);
            mQuestionID=mStoryGGS[mIndex].getQuesID();
            mOption1ID=mStoryGGS[mIndex].getAns1ID();
            mOption2ID=mStoryGGS[mIndex].getAns2ID();
            mTextView.setText(mQuestionID);
            mButton1.setText(mOption1ID);
            mButton2.setText(mOption2ID);

        }



    }
}
