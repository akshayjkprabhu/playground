package com.example.playground.common.ui.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.playground.common.constants.AppConstants;
import com.example.playground.common.utils.Logger;

/*
 * Created by akshay on 16/10/18.
 */
abstract class LifeCycleLoggerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        logLifeCycleActivity(this.getClass().getSimpleName() + " : onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        logLifeCycleActivity(this.getClass().getSimpleName() + " : onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        logLifeCycleActivity(this.getClass().getSimpleName() + " : onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        logLifeCycleActivity(this.getClass().getSimpleName() + " : onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        logLifeCycleActivity(this.getClass().getSimpleName() + " : onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        logLifeCycleActivity(this.getClass().getSimpleName() + " : onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        logLifeCycleActivity(this.getClass().getSimpleName() + " : onStart");
        super.onStart();
    }

    private void logLifeCycleActivity(String activity) {
        Logger.d(AppConstants.LogTag.ACTIVITY_CALLBACKS, activity);
    }
}
