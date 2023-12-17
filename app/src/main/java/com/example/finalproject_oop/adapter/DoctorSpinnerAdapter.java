package com.example.finalproject_oop.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.finalproject_oop.data_class.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorSpinnerAdapter extends ArrayAdapter<Doctor> implements View.OnClickListener{
    private ArrayList<Doctor> dataSet;
    Context mContext;
    private static class ViewHolder{
        ImageView image_view;
        TextView tv_name,tv_discription;

    }
    public DoctorSpinnerAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public DoctorSpinnerAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public DoctorSpinnerAdapter(@NonNull Context context, int resource, @NonNull Doctor[] objects) {
        super(context, resource, objects);
    }

    public DoctorSpinnerAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Doctor[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public DoctorSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<Doctor> objects) {
        super(context, resource, objects);
    }

    public DoctorSpinnerAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Doctor> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public void onClick(View v) {

    }
}
