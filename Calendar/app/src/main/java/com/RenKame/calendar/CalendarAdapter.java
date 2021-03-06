package com.RenKame.calendar;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarViewHolder>
{
    private final ArrayList<String> dayOfMonth;
    private final OnItemListener onItemListener;
    private final Boolean TekData;

    public CalendarAdapter(ArrayList<String> dayOfMonth, OnItemListener onItemListener,Boolean TekData)
    {
        this.dayOfMonth = dayOfMonth;
        this.onItemListener = onItemListener;
        this.TekData = TekData;
    }

    @NonNull
    @Override
    public CalendarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.calendar_cell, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (parent.getHeight() * 0.166666666);
        return new CalendarViewHolder(view, onItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CalendarViewHolder holder, int position)
    {
        holder.dayOfMonth.setText(dayOfMonth.get(position));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        if (TekData == true && dayOfMonth.get(position).equals(LocalDate.now().format(formatter))){
            holder.textView.setTextColor(Color.RED);
        }
    }

    @Override
    public int getItemCount()
    {
        return dayOfMonth.size();
    }

    public interface  OnItemListener
    {
        void onItemClick(int position, String dayText);
    }
}
