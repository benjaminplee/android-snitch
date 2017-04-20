package com.yardspoon.androidsnitch;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;


public class SnitchAppCompatActivity extends AppCompatActivity {

    private static String TAG = "SNITCH";

    private void logMajor(String message) {
        Log.i(TAG, this.toString() + " - " + message);
    }

    private void logMinor(String message) {
        Log.d(TAG, this.toString() + " - " + message);
    }

    public SnitchAppCompatActivity() {
        super();
        logMajor("SnitchAppCompatActivity()");
    }

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        logMajor("onCreate - [savedInstanceState] ");
        super.onCreate(savedInstanceState);
    }

    @Override public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        logMajor("onCreate - [savedInstanceState, persistentState] ");
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override protected void onRestoreInstanceState(Bundle savedInstanceState) {
        logMinor("onRestoreInstanceState - [savedInstanceState] ");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        logMinor("onRestoreInstanceState - [savedInstanceState, persistentState] ");
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        logMinor("onPostCreate - [savedInstanceState] ");
        super.onPostCreate(savedInstanceState);
    }

    @Override public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        logMinor("onPostCreate - [savedInstanceState, persistentState] ");
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override public void setContentView(View view, ViewGroup.LayoutParams params) {
        logMinor("setContentView - [view, params] ");
        super.setContentView(view, params);
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        logMajor("onActivityResult - [requestCode, resultCode, data] ");
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override public void onActivityReenter(int resultCode, Intent data) {
        logMajor("onActivityReenter - [resultCode, data] ");
        super.onActivityReenter(resultCode, data);
    }

    @Override public void onBackPressed() {
        logMajor("onBackPressed - [] ");
        super.onBackPressed();
    }

    @Override public void onUserInteraction() {
        logMinor("onUserInteraction - [] ");
        super.onUserInteraction();
    }

    @Override public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        logMinor("onWindowAttributesChanged - [params] ");
        super.onWindowAttributesChanged(params);
    }

    @Override public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        logMinor("onMultiWindowModeChanged - [isInMultiWindowMode] ");
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        logMinor("onPictureInPictureModeChanged - [isInPictureInPictureMode] ");
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override public void onConfigurationChanged(Configuration newConfig) {
        logMajor("onConfigurationChanged - [newConfig] ");
        super.onConfigurationChanged(newConfig);
    }

    @Override public Object getLastCustomNonConfigurationInstance() {
        logMajor("getLastCustomNonConfigurationInstance - [] ");
        return super.getLastCustomNonConfigurationInstance();
    }

    @Nullable @Override public Object getLastNonConfigurationInstance() {
        logMajor("getLastNonConfigurationInstance - [] ");
        return super.getLastNonConfigurationInstance();
    }

    @Override protected void onPostResume() {
        logMinor("onPostResume - [] ");
        super.onPostResume();
    }

    @Override protected void onResumeFragments() {
        logMinor("onResumeFragments - [] ");
        super.onResumeFragments();
    }

    @Override public boolean onPreparePanel(int featureId, View view, Menu menu) {
        logMinor("onPreparePanel - [featureId, view, menu] ");
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, @StyleRes int resid, boolean first) {
        logMinor("onApplyThemeResource - [theme, resid, first] ");
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override protected void onStart() {
        logMajor("onStart - [] ");
        super.onStart();
    }

    @Override protected void onRestart() {
        logMajor("onRestart - [] ");
        super.onRestart();
    }

    @Override protected void onStop() {
        logMajor("onStop - [] ");
        super.onStop();
    }

    @Override public Object onRetainCustomNonConfigurationInstance() {
        logMajor("onRetainCustomNonConfigurationInstance - [] ");
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Override public void onAttachFragment(Fragment fragment) {
        logMajor("onAttachFragment - [fragment] ");
        super.onAttachFragment(fragment);
    }

    @Override protected void onDestroy() {
        logMajor("onDestroy - [] ");
        super.onDestroy();
    }

    @Override public void onLowMemory() {
        logMinor("onLowMemory - [] ");
        super.onLowMemory();
    }

    @Override public void onTrimMemory(int level) {
        logMinor("onTrimMemory - [level] ");
        super.onTrimMemory(level);
    }

    @Override public void onAttachFragment(android.app.Fragment fragment) {
        logMajor("onAttachFragment - [fragment] ");
        super.onAttachFragment(fragment);
    }

    @Override protected void onPause() {
        logMajor("onPause - [] ");
        super.onPause();
    }

    @Override public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        logMinor("onCreateThumbnail - [outBitmap, canvas] ");
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Nullable @Override public CharSequence onCreateDescription() {
        logMinor("onCreateDescription - [] ");
        return super.onCreateDescription();
    }

    @Override protected void onNewIntent(Intent intent) {
        logMinor("onNewIntent - [intent] ");
        super.onNewIntent(intent);
    }

    @Override public void onStateNotSaved() {
        logMinor("onStateNotSaved - [] ");
        super.onStateNotSaved();
    }

    @Override protected void onResume() {
        logMajor("onResume - [] ");
        super.onResume();
    }

    @Override protected void onTitleChanged(CharSequence title, int color) {
        logMinor("onTitleChanged - [title, color] ");
        super.onTitleChanged(title, color);
    }

    @Override public void onContentChanged() {
        logMinor("onContentChanged - [] ");
        super.onContentChanged();
    }

    @Override public void onWindowFocusChanged(boolean hasFocus) {
        logMinor("onWindowFocusChanged - [hasFocus] ");
        super.onWindowFocusChanged(hasFocus);
    }

    @Override public void onAttachedToWindow() {
        logMinor("onAttachedToWindow - [] ");
        super.onAttachedToWindow();
    }

    @Override public void onDetachedFromWindow() {
        logMinor("onDetachedFromWindow - [] ");
        super.onDetachedFromWindow();
    }

    @Override protected void onSaveInstanceState(Bundle outState) {
        logMajor("onSaveInstanceState - [outState] ");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        logMajor("onSaveInstanceState - [outState, outPersistentState] ");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override public void onVisibleBehindCanceled() {
        logMinor("onVisibleBehindCanceled - [] ");
        super.onVisibleBehindCanceled();
    }
}
