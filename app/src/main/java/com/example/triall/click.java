package com.example.triall;

import android.graphics.Color;
import android.view.View;

public class click implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        view.setBackgroundColor(Color.YELLOW);
    }
}
