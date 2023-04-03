package com.women_period_cycle.women_period_cycle_files.adepter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;

import com.women_period_cycle.women_period_cycle_files.R;

public class NewMoodAdapter extends CursorAdapter {
    int idmood;
    String moodName;


    public NewMoodAdapter(Context context, Cursor cursor, int flags) {
        super(context, cursor, flags);
    }

    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_new_mood_grid, parent, false);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ImageView imgMood = (ImageView) view.findViewById(R.id.imgNewMood);
        idmood = cursor.getInt(cursor.getColumnIndexOrThrow("idmood"));
        moodName = "";
        if (idmood == 0) {
            moodName = context.getResources().getString(R.string.mood_0);
            imgMood.setImageResource(R.mipmap.ic_mood_img_0);
        }
        if (idmood == 1) {
            moodName = context.getResources().getString(R.string.mood_1);
            imgMood.setImageResource(R.mipmap.ic_mood_img_1);
        }
        if (idmood == 2) {
            moodName = context.getResources().getString(R.string.mood_2);
            imgMood.setImageResource(R.mipmap.ic_mood_img_2);
        }
        if (idmood == 3) {
            moodName = context.getResources().getString(R.string.mood_3);
            imgMood.setImageResource(R.mipmap.ic_mood_img_3);
        }
        if (idmood == 4) {
            moodName = context.getResources().getString(R.string.mood_4);
            imgMood.setImageResource(R.mipmap.ic_mood_img_4);
        }
        if (idmood == 5) {
            moodName = context.getResources().getString(R.string.mood_5);
            imgMood.setImageResource(R.mipmap.ic_mood_img_5);
        }
        if (idmood == 6) {
            moodName = context.getResources().getString(R.string.mood_6);
            imgMood.setImageResource(R.mipmap.ic_mood_img_6);
        }
        if (idmood == 7) {
            moodName = context.getResources().getString(R.string.mood_7);
            imgMood.setImageResource(R.mipmap.ic_mood_img_7);
        }
        if (idmood == 8) {
            moodName = context.getResources().getString(R.string.mood_8);
            imgMood.setImageResource(R.mipmap.ic_mood_img_8);
        }
        if (idmood == 9) {
            moodName = context.getResources().getString(R.string.mood_9);
            imgMood.setImageResource(R.mipmap.ic_mood_img_9);
        }
        if (idmood == 10) {
            moodName = context.getResources().getString(R.string.mood_10);
            imgMood.setImageResource(R.mipmap.ic_mood_img_10);
        }
        if (idmood == 11) {
            moodName = context.getResources().getString(R.string.mood_11);
            imgMood.setImageResource(R.mipmap.ic_mood_img_11);
        }
        if (idmood == 12) {
            moodName = context.getResources().getString(R.string.mood_12);
            imgMood.setImageResource(R.mipmap.ic_mood_img_12);
        }
        if (idmood == 13) {
            moodName = context.getResources().getString(R.string.mood_13);
            imgMood.setImageResource(R.mipmap.ic_mood_img_13);
        }
        if (idmood == 14) {
            moodName = context.getResources().getString(R.string.mood_14);
            imgMood.setImageResource(R.mipmap.ic_mood_img_14);
        }
        if (idmood == 15) {
            moodName = context.getResources().getString(R.string.mood_15);
            imgMood.setImageResource(R.mipmap.ic_mood_img_15);
        }
        if (idmood == 16) {
            moodName = context.getResources().getString(R.string.mood_16);
            imgMood.setImageResource(R.mipmap.ic_mood_img_16);
        }
        if (idmood == 17) {
            moodName = context.getResources().getString(R.string.mood_17);
            imgMood.setImageResource(R.mipmap.ic_mood_img_17);
        }
        if (idmood == 18) {
            moodName = context.getResources().getString(R.string.mood_18);
            imgMood.setImageResource(R.mipmap.ic_mood_img_18);
        }
        if (idmood == 19) {
            moodName = context.getResources().getString(R.string.mood_19);
            imgMood.setImageResource(R.mipmap.ic_mood_img_19);
        }
        if (idmood == 20) {
            moodName = context.getResources().getString(R.string.mood_20);
            imgMood.setImageResource(R.mipmap.ic_mood_img_20);
        }
        if (idmood == 21) {
            moodName = context.getResources().getString(R.string.mood_21);
            imgMood.setImageResource(R.mipmap.ic_mood_img_21);
        }
        if (idmood == 22) {
            moodName = context.getResources().getString(R.string.mood_22);
            imgMood.setImageResource(R.mipmap.ic_mood_img_22);
        }
        if (idmood == 23) {
            moodName = context.getResources().getString(R.string.mood_23);
            imgMood.setImageResource(R.mipmap.ic_mood_img_23);
        }
        if (idmood == 24) {
            moodName = context.getResources().getString(R.string.mood_24);
            imgMood.setImageResource(R.mipmap.ic_mood_img_24);
        }
        if (idmood == 25) {
            moodName = context.getResources().getString(R.string.mood_25);
            imgMood.setImageResource(R.mipmap.ic_mood_img_25);
        }
        if (idmood == 26) {
            moodName = context.getResources().getString(R.string.mood_26);
            imgMood.setImageResource(R.mipmap.ic_mood_img_26);
        }
        if (idmood == 27) {
            moodName = context.getResources().getString(R.string.mood_27);
            imgMood.setImageResource(R.mipmap.ic_mood_img_27);
        }
        if (idmood == 28) {
            moodName = context.getResources().getString(R.string.mood_28);
            imgMood.setImageResource(R.mipmap.ic_mood_img_28);
        }
        if (idmood == 29) {
            moodName = context.getResources().getString(R.string.mood_29);
            imgMood.setImageResource(R.mipmap.ic_mood_img_29);
        }
        if (idmood == 30) {
            moodName = context.getResources().getString(R.string.mood_30);
            imgMood.setImageResource(R.mipmap.ic_mood_img_30);
        }
        if (idmood == 31) {
            moodName = context.getResources().getString(R.string.mood_31);
            imgMood.setImageResource(R.mipmap.ic_mood_img_31);
        }
        if (idmood == 32) {
            moodName = context.getResources().getString(R.string.mood_32);
            imgMood.setImageResource(R.mipmap.ic_mood_img_32);
        }
        if (idmood == 33) {
            moodName = context.getResources().getString(R.string.mood_33);
            imgMood.setImageResource(R.mipmap.ic_mood_img_33);
        }
        if (idmood == 34) {
            moodName = context.getResources().getString(R.string.mood_34);
            imgMood.setImageResource(R.mipmap.ic_mood_img_34);
        }
        if (idmood == 35) {
            moodName = context.getResources().getString(R.string.mood_35);
            imgMood.setImageResource(R.mipmap.ic_mood_img_35);
        }
        if (idmood == 36) {
            moodName = context.getResources().getString(R.string.mood_36);
            imgMood.setImageResource(R.mipmap.ic_mood_img_36);
        }
        if (idmood == 37) {
            moodName = context.getResources().getString(R.string.mood_37);
            imgMood.setImageResource(R.mipmap.ic_mood_img_37);
        }
        if (idmood == 38) {
            moodName = context.getResources().getString(R.string.mood_38);
            imgMood.setImageResource(R.mipmap.ic_mood_img_38);
        }
        if (idmood == 39) {
            moodName = context.getResources().getString(R.string.mood_39);
            imgMood.setImageResource(R.mipmap.ic_mood_img_39);
        }
        if (idmood == 40) {
            moodName = context.getResources().getString(R.string.mood_40);
            imgMood.setImageResource(R.mipmap.ic_mood_img_40);
        }
        if (idmood == 41) {
            moodName = context.getResources().getString(R.string.mood_41);
            imgMood.setImageResource(R.mipmap.ic_mood_img_41);
        }
        if (idmood == 42) {
            moodName = context.getResources().getString(R.string.mood_42);
            imgMood.setImageResource(R.mipmap.ic_mood_img_42);
        }
        if (idmood == 43) {
            moodName = context.getResources().getString(R.string.mood_43);
            imgMood.setImageResource(R.mipmap.ic_mood_img_43);
        }
        if (idmood == 44) {
            moodName = context.getResources().getString(R.string.mood_44);
            imgMood.setImageResource(R.mipmap.ic_mood_img_44);
        }
        if (idmood == 45) {
            moodName = context.getResources().getString(R.string.mood_45);
            imgMood.setImageResource(R.mipmap.ic_mood_img_45);
        }
        if (idmood == 46) {
            moodName = context.getResources().getString(R.string.mood_46);
            imgMood.setImageResource(R.mipmap.ic_mood_img_46);
        }
        if (idmood == 47) {
            moodName = context.getResources().getString(R.string.mood_47);
            imgMood.setImageResource(R.mipmap.ic_mood_img_47);
        }
        if (idmood == 48) {
            moodName = context.getResources().getString(R.string.mood_48);
            imgMood.setImageResource(R.mipmap.ic_mood_img_48);
        }
        if (idmood == 49) {
            moodName = context.getResources().getString(R.string.mood_49);
            imgMood.setImageResource(R.mipmap.ic_mood_img_49);
        }
        if (idmood == 50) {
            moodName = context.getResources().getString(R.string.mood_50);
            imgMood.setImageResource(R.mipmap.ic_mood_img_50);
        }
        if (idmood == 51) {
            moodName = context.getResources().getString(R.string.mood_51);
            imgMood.setImageResource(R.mipmap.ic_mood_img_51);
        }
        if (idmood == 52) {
            moodName = context.getResources().getString(R.string.mood_52);
            imgMood.setImageResource(R.mipmap.ic_mood_img_52);
        }
        if (idmood == 53) {
            moodName = context.getResources().getString(R.string.mood_53);
            imgMood.setImageResource(R.mipmap.ic_mood_img_53);
        }
        if (idmood == 54) {
            moodName = context.getResources().getString(R.string.mood_54);
            imgMood.setImageResource(R.mipmap.ic_mood_img_54);
        }
        if (idmood == 55) {
            moodName = context.getResources().getString(R.string.mood_55);
            imgMood.setImageResource(R.mipmap.ic_mood_img_55);
        }
        if (idmood == 56) {
            moodName = context.getResources().getString(R.string.mood_56);
            imgMood.setImageResource(R.mipmap.ic_mood_img_56);
        }
        if (idmood == 57) {
            moodName = context.getResources().getString(R.string.mood_57);
            imgMood.setImageResource(R.mipmap.ic_mood_img_57);
        }
        if (idmood == 58) {
            moodName = context.getResources().getString(R.string.mood_58);
            imgMood.setImageResource(R.mipmap.ic_mood_img_58);
        }
        if (idmood == 59) {
            moodName = context.getResources().getString(R.string.mood_59);
            imgMood.setImageResource(R.mipmap.ic_mood_img_59);
        }
        if (idmood == 60) {
            moodName = context.getResources().getString(R.string.mood_60);
            imgMood.setImageResource(R.mipmap.ic_mood_img_60);
        }
        if (idmood == 61) {
            moodName = context.getResources().getString(R.string.mood_61);
            imgMood.setImageResource(R.mipmap.ic_mood_img_61);
        }
        if (idmood == 62) {
            moodName = context.getResources().getString(R.string.mood_62);
            imgMood.setImageResource(R.mipmap.ic_mood_img_62);
        }
        if (idmood == 63) {
            moodName = context.getResources().getString(R.string.mood_63);
            imgMood.setImageResource(R.mipmap.ic_mood_img_63);
        }
        if (idmood == 64) {
            moodName = context.getResources().getString(R.string.mood_64);
            imgMood.setImageResource(R.mipmap.ic_mood_img_64);
        }
        if (idmood == 65) {
            moodName = context.getResources().getString(R.string.mood_65);
            imgMood.setImageResource(R.mipmap.ic_mood_img_65);
        }
        if (idmood == 66) {
            moodName = context.getResources().getString(R.string.mood_66);
            imgMood.setImageResource(R.mipmap.ic_mood_img_66);
        }
        if (idmood == 67) {
            moodName = context.getResources().getString(R.string.mood_67);
            imgMood.setImageResource(R.mipmap.ic_mood_img_67);
        }
        if (idmood == 68) {
            moodName = context.getResources().getString(R.string.mood_68);
            imgMood.setImageResource(R.mipmap.ic_mood_img_68);
        }
        if (idmood == 69) {
            moodName = context.getResources().getString(R.string.mood_69);
            imgMood.setImageResource(R.mipmap.ic_mood_img_69);
        }
        if (idmood == 70) {
            moodName = context.getResources().getString(R.string.mood_70);
            imgMood.setImageResource(R.mipmap.ic_mood_img_70);
        }
        if (idmood == 71) {
            moodName = context.getResources().getString(R.string.mood_71);
            imgMood.setImageResource(R.mipmap.ic_mood_img_71);
        }
        if (idmood == 72) {
            moodName = context.getResources().getString(R.string.mood_72);
            imgMood.setImageResource(R.mipmap.ic_mood_img_72);
        }
        if (idmood == 73) {
            moodName = context.getResources().getString(R.string.mood_73);
            imgMood.setImageResource(R.mipmap.ic_mood_img_73);
        }
        if (idmood == 74) {
            moodName = context.getResources().getString(R.string.mood_74);
            imgMood.setImageResource(R.mipmap.ic_mood_img_74);
        }
        if (idmood == 75) {
            moodName = context.getResources().getString(R.string.mood_75);
            imgMood.setImageResource(R.mipmap.ic_mood_img_75);
        }
    }
}
