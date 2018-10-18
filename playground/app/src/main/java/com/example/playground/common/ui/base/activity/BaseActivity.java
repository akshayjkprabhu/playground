package com.example.playground.common.ui.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.example.playground.R;

public abstract class BaseActivity extends LifeCycleLoggerActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
