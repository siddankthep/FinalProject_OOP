package com.example.finalproject_oop.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.data_class.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorSpinnerAdapter extends BaseAdapter implements View.OnClickListener{
    private List<Doctor> dataSet;
    private int viewId;
    private LayoutInflater inflater;

    public DoctorSpinnerAdapter(Activity context, int viewId, List<Doctor> dataSet){
        this.dataSet = dataSet;
        this.inflater = context.getLayoutInflater();
        this.viewId = viewId;
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return dataSet.get(position).getID();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Doctor doctor = (Doctor) getItem(position);
        View row = this.inflater.inflate(this.viewId, null, true);
        TextView name = row.findViewById(R.id.docSpinnerFname);
        TextView phone = row.findViewById(R.id.docSpinnerLname);
        name.setText(doctor.getFirstName()+" "+doctor.getLastName());
        phone.setText(doctor.getPhoneNumber());
        return row;
    }

    @Override
    public void onClick(View v) {

    }
}
