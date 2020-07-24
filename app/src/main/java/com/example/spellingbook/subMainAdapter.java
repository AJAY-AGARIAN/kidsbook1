package com.example.spellingbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class subMainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] numberword;
    private String[] numberimage;

    public subMainAdapter(Context c, String[] numberword, String[] numberimage) {
        context = c;
        this.numberword = numberword;
        this.numberimage = numberimage;

    }

    @Override
    public int getCount() {
        return numberword.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_item, null);
        }


        TextView text1 = convertView.findViewById(R.id.text1);
        TextView text2 = convertView.findViewById(R.id.text2);
        text1.setText(numberword[position]);
        text2.setText(numberword[position]);
        return convertView;
    }
}
