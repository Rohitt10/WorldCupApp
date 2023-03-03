package com.example.worldcup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<CountryDetails> {
    private ArrayList<CountryDetails> al;
    Context context;
    public MyAdapter(ArrayList<CountryDetails> al,Context context)
    {
        super(context,R.layout.my_layout,al); //the function of line
        this.al=al;
        this.context=context;
    }
    public static class ViewHolder
    {
        TextView cname,count;
        ImageView image;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
         CountryDetails country=getItem(position);
         ViewHolder viewHolder;
         final View result;
         if(convertView==null)
         {
             viewHolder=new ViewHolder();
//             LayoutInflater inflater=LayoutInflater.from(getContext());
             convertView=LayoutInflater.from(getContext()).inflate(R.layout.my_layout,parent,false);
             viewHolder.cname=(TextView) convertView.findViewById(R.id.textView);
             viewHolder.count=(TextView)convertView.findViewById(R.id.win_count);
             viewHolder.image=(ImageView) convertView.findViewById(R.id.imageView);
             result=convertView;
             convertView.setTag(viewHolder); //working of setTag function
         }
         else
         {
             viewHolder=(ViewHolder)convertView.getTag();
             result=convertView;
         }
         viewHolder.cname.setText(country.name);
         viewHolder.image.setImageResource(country.imageId);
         viewHolder.count.setText(country.count);
         return convertView;
    }
}
