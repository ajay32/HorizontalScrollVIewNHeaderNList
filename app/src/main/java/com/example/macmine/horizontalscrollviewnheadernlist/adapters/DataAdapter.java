package com.example.macmine.horizontalscrollviewnheadernlist.adapters;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.macmine.horizontalscrollviewnheadernlist.R;
import com.example.macmine.horizontalscrollviewnheadernlist.model.UserData;

import java.util.ArrayList;


/**
 * Created by Ajay Mehta on 1/29/2016.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private static final int TYPE_HEADER = 2;
    private static final int TYPE_ITEM = 1;
    private static final int TYPE_AD = 3;
    Display display;
    LayoutInflater inflater;
    Resources r;
    Onclick listner;
    int height;

    ArrayList<UserData> data;
    Activity context;


    public interface Onclick {
        public void onclick(View view, int postion);
    }

    public void setListner(Onclick listner) {
        this.listner = listner;
    }

    public DataAdapter(Activity context, ArrayList<UserData> data) {
        this.data = data;
        this.context = context;

    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        context = parent.getContext();
        r = context.getResources();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        display = wm.getDefaultDisplay();
        height = display.getHeight();
        if (viewType == TYPE_ITEM) {
            final View view = LayoutInflater.from(context).inflate(R.layout.dataitem, parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }

        throw new RuntimeException("There is no type that matches the type " + viewType + " + make sure your using types correctly");
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {

        try {


            viewHolder.bookingtime.setText("2:00");
            viewHolder.serial.setText("1");
            viewHolder.mobile.setText("99999999");
            viewHolder.bookingtime.setText("2:00");

            viewHolder.more.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(context, "Hey why u clicked me",Toast.LENGTH_SHORT).show();
                }
            });


        }catch (Exception e){


        }
    }


    public int getBasicItemCount() {
      //  return data.size();
        return 5;  //return 5 values
    }

    @Override
    public long getItemId(int position) {
        return (position);
    }

    @Override
    public int getItemViewType(int position) {

//        if (isPositionHeader(position)) {
//            return TYPE_HEADER;
//        }


        return TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return getBasicItemCount(); // header
    }

    private boolean isPositionHeader(int position) {
        if (position == 0) {
            return true;
        }
        return false;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView serial, rqststatus, userid, status, memebrenon, bookingtime, mobile;
        RelativeLayout rtc, more;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            more = (RelativeLayout) itemLayoutView.findViewById(R.id.rl_more);
            bookingtime = (TextView) itemLayoutView.findViewById(R.id.tv_bookingtime);
            serial = (TextView) itemLayoutView.findViewById(R.id.tv_serialno);
            rqststatus = (TextView) itemLayoutView.findViewById(R.id.rqststatus);
            userid = (TextView) itemLayoutView.findViewById(R.id.tv_userid);
            status = (TextView) itemLayoutView.findViewById(R.id.status);
            memebrenon = (TextView) itemLayoutView.findViewById(R.id.tv_member);
            rtc = (RelativeLayout) itemLayoutView.findViewById(R.id.rtc);
            mobile = (TextView) itemLayoutView.findViewById(R.id.tv_mobileno);

        }
    }


}
