package com.admision.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.admision.R;
import com.admision.utils.Utils;
import com.nostra13.universalimageloader.core.ImageLoader;

import butterknife.ButterKnife;

/**
 * Created by Kartum Infotech (Bhavesh Hirpara) on 10/31/2017.
 */
public class ManageVenuesAdapter extends RecyclerView.Adapter<ManageVenuesAdapter.MyViewHolder> {

    ImageLoader imageLoader;
    //    public ArrayList<String> data = new ArrayList<>();
//    public JSONArray data = new JSONArray();
//    private ArrayList<BaseActivity.MenuItem> data = new ArrayList<BaseActivity.MenuItem>();
    Context context;
    Eventlistener mEventlistener;

    public ManageVenuesAdapter(Context c) {
        this.context = c;
        imageLoader = Utils.initImageLoader(context);
    }

//    public void add(BaseActivity.MenuItem mData) {
//        data.add(mData);
//        notifyDataSetChanged();
//    }

//    public SettingActivity.ReminderData getItem(int pos) {
//        try {
//            return data.get(pos);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public void addAll(ArrayList<BaseActivity.MenuItem> files) {
//        data.clear();
//        data.addAll(files);
//        notifyDataSetChanged();
//    }
//
//    public void selectAll(boolean selectall) {
//        for (int i = 0; i < data.size(); i++) {
//            data.get(i).isOn = selectall;
//        }
//
//        notifyDataSetChanged();
//    }
//
//    public void changeSelection(int position, boolean isMultiSel) {
//
//        for (int i = 0; i < data.size(); i++) {
//            if (position == i) {
//                data.get(i).isOn = !data.get(i).isOn;
//            } else if (!isMultiSel) {
//                data.get(i).isOn = false;
//            }
//        }
//
//        notifyDataSetChanged();
//    }

//    public int getObjectId(int position) {
//        try {
//            return data.(position).getInt("id");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//    public JSONObject getItem(int position) {
//        return data.get(position);
//    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View v = inflater.inflate(R.layout.item_manage_venue, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

//        final SettingActivity.ReminderData item = data.get(position);
//        holder.tvTime.setText(Utils.nullSafe("" + item.time));
//        holder.tvLable.setText(Utils.nullSafe("" + item.lable));
//        holder.mSwitch.setChecked(data.get(position).isOn);
//        holder.btnViewDetails.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mEventlistener != null) {
//                    mEventlistener.OnItemViewclick(position, view);
//                }
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

//        @BindView(R.id.tvName)
//        TextView tvName;
//        @BindView(R.id.tvCapcity)
//        TextView tvCapcity;
//        @BindView(R.id.tvAddress1)
//        TextView tvAddress1;
//        @BindView(R.id.tvAddress2)
//        TextView tvAddress2;
//        @BindView(R.id.tvState)
//        TextView tvState;
//        @BindView(R.id.tvCity)
//        TextView tvCity;
//        @BindView(R.id.tvZipcode)
//        TextView tvZipcode;
//        @BindView(R.id.tvHoursOfOperation)
//        TextView tvHoursOfOperation;
//        @BindView(R.id.tvStatus)
//        TextView tvStatus;
//        @BindView(R.id.tvLatitude)
//        TextView tvLatitude;
//        @BindView(R.id.tvLogitude)
//        TextView tvLogitude;
//        @BindView(R.id.llEdit)
//        LinearLayout llEdit;
//        @BindView(R.id.llDelete)
//        LinearLayout llDelete;
//
//        @BindView(R.id.container)
//        View container;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public interface Eventlistener {
        void OnItemViewclick(int position, View view);
    }

    public void setmEventlistener(Eventlistener eventlistener) {
        this.mEventlistener = eventlistener;
    }
}