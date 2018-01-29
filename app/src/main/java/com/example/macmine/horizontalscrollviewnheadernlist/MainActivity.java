package com.example.macmine.horizontalscrollviewnheadernlist;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.macmine.horizontalscrollviewnheadernlist.adapters.DataAdapter;
import com.example.macmine.horizontalscrollviewnheadernlist.model.UserData;

import java.util.ArrayList;


// =========== how to make any app landscape ...just landscape i mean ...then in manifest ..set screenOrination of activity landsape...
//== its differnt than creating an app that is portrait n landsape both ..for that ...you have add layoutland  xml file for every activity...  ==============================
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView recyclerView;
    ProgressBar progressBar;
    TextView nofeed;
    RelativeLayout rlSecondActivity , rlMsg1,rlMsg2,rlMsg3,rlMsg4;
    RelativeLayout issuecycle;
    ViewPager mViewPager;
    TextView logout, nodata;
    ArrayList<String> urls = new ArrayList<>();
    boolean isfirsttime = true;
    EditText edtNumber;
    TextView txtNumber, txtNumber1, txtNumber2, txtNumber3;
    DataAdapter dataAdapter;
    ArrayList<UserData> users = new ArrayList<UserData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        rlSecondActivity = (RelativeLayout) findViewById(R.id.rl_second);
        rlSecondActivity.setOnClickListener(this);

        rlMsg1 = (RelativeLayout) findViewById(R.id.rl_msg1);
        rlMsg1.setOnClickListener(this);

        rlMsg2 = (RelativeLayout) findViewById(R.id.rl_msg2);
        rlMsg2.setOnClickListener(this);

        rlMsg3 = (RelativeLayout) findViewById(R.id.rl_msg3);
        rlMsg3.setOnClickListener(this);

        rlMsg4 = (RelativeLayout) findViewById(R.id.rl_msg4);
        rlMsg4.setOnClickListener(this);



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        dataAdapter = new DataAdapter(MainActivity.this, users);  // setting adapter n sending users objects list....
        dataAdapter.setListner(listner);   // setting listener to adapter here .....

        recyclerView.setAdapter(dataAdapter);
    }  // end of init....

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.rl_second) {

            startActivity(new Intent(MainActivity.this , SecondActivity.class));
        } else if (view.getId() == R.id.rl_msg1) {

            Toast.makeText(MainActivity.this , "Hi i am message1",Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.rl_msg2) {

            Toast.makeText(MainActivity.this , "Hi i am message2",Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.rl_msg3) {

            Toast.makeText(MainActivity.this , "Hi i am message3",Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(MainActivity.this , "Hi i am message4",Toast.LENGTH_SHORT).show();
        }

    }  // end of onclick listener


  DataAdapter.Onclick listner = new DataAdapter.Onclick() {
        @Override
        public void onclick(View view, int postion) {

        }
    };

}
