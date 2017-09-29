package com.get_phone_silent.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.get_phone_silent.R;
import com.get_phone_silent.model.LocationDataModel;

import java.util.List;

/**
 * Created by Administrator on 9/29/2017.
 */

public class RegisterPlaceListAdatper extends RecyclerView.Adapter<RegisterPlaceListAdatper.MyViewHolder> {

    /**
     * Created by Administrator on 12/13/2016.
     */

        private List<LocationDataModel> list;
        private Activity mContext;


        public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
            public TextView category_type, category_open_count,category_close_count ,icon;

            public MyViewHolder(View view) {
                super(view);
          /*  Typeface roboto_light_typeface= Utils.getCustomFont(Application.mContext, FontType.ROBOTO_LIGHT)*/;

           /* category_type = (TextView) view.findViewById(R.id.complaint_category_title_textView);
            category_open_count = (TextView) view.findViewById(R.id.complaint_category_open_count_textView);
            category_close_count = (TextView) view.findViewById(R.id.complaint_category_close_count_textView);
            icon = (TextView) view.findViewById(R.id.complaint_category_thumb_drawable_txt);*/

          /*  category_type.setTypeface(roboto_light_typeface);
            category_open_count.setTypeface(roboto_light_typeface);
            category_close_count.setTypeface(roboto_light_typeface);*/

                view.setOnClickListener(this);
            }
            @Override
            public void onClick(View v) {
          /*  Intent intent=new Intent(mContext, ComplaintListActivity.class);
            intent.putExtra("categoryId",complaintCategoryList.get(getAdapterPosition()).category_id);
            intent.putExtra("from","ComplaintCategoryScreen");
            mContext.startActivity(intent);*/
            }
        }
        /*  public RegisterPlaceListAdapter(List<ComplaintCategory> list, Activity mContext) {
              *//*this.complaintCategoryList = list;
        this.mContext=mContext;*//*
    }*/
        @Override
        public RegisterPlaceListAdatper.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.register_place_list_item, parent, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(RegisterPlaceListAdatper.MyViewHolder holder, int position) {
      /*  ComplaintCategory model = complaintCategoryList.get(position);
        holder.category_type.setText(model.getCategory_name());
        holder.category_open_count.setText("Open : "+model.getOpen_count());
        holder.category_close_count.setText("Close : "+model.getClose_count());
        holder.icon.setText(model.getCategory_name().substring(0,1));

        GradientDrawable bgShape = (GradientDrawable)holder.icon.getBackground();
        bgShape.setColor(Color.parseColor(model.getColor()));*/
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

    }

