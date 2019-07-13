package com.example.chapter3.homework;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.Inflater;

public class Myfragment extends Fragment {

    ListView listView;
    LottieAnimationView animationView;

    TimerTask task = new TimerTask()
    {
        public void run() {
            listView.setAlpha(1.0f);
            animationView.setAlpha(0.0f);
        }
    };

    Timer timer = new Timer();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.list_view, container, false);
        listView = (ListView)view.findViewById(R.id.list_view);
        listView.setAdapter(new ListViewAdapter(getActivity()));
        animationView = (LottieAnimationView) view.findViewById(R.id.waiting);
        timer.schedule(task, 5000l);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public static class ListViewAdapter extends BaseAdapter {

        private Context mContext;
        private LayoutInflater layoutInflater;

        public ListViewAdapter (Context context)
        {
            mContext = context;
            layoutInflater = LayoutInflater.from(context);
        }

        @Override public int getCount() {
            return 10;
        }

        @Override public Object getItem(int position) {
            return null;
        }

        @Override public long getItemId(int position) {
            return 0;
        }

        @Override public View getView(int position, View convertView, ViewGroup parent)
        {
            View view;
            if (convertView == null)
            {
                LayoutInflater inflater = LayoutInflater.from(mContext);
                view = inflater.inflate(R.layout.item_view,null);
            }else{
                view = convertView;
            }
            return view;
        }
    }
}
