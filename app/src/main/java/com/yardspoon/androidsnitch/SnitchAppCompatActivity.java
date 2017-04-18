package com.yardspoon.androidsnitch;

import android.content.Context;
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
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;


public class SnitchAppCompatActivity extends AppCompatActivity {
    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override public void onCreate(
            @Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override public void onPostCreate(
            @Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
    }

    @Override public void onBackPressed() {
        super.onBackPressed();
    }

    @Override public void onUserInteraction() {
        super.onUserInteraction();
    }

    @Override public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
    }

    @Override public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override protected void onPostResume() {
        super.onPostResume();
    }

    @Override protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, @StyleRes int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override protected void onStart() {
        super.onStart();
    }

    @Override protected void onRestart() {
        super.onRestart();
    }

    @Override protected void onStop() {
        super.onStop();
    }

    @Override public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Override public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
    }

    @Override public void onLowMemory() {
        super.onLowMemory();
    }

    @Override public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override public void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override protected void onPause() {
        super.onPause();
    }

    @Override public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Nullable @Override public CharSequence onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override public void onStateNotSaved() {
        super.onStateNotSaved();
    }

    @Override protected void onResume() {
        super.onResume();
    }

    @Override protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
    }

    @Override public void onContentChanged() {
        super.onContentChanged();
    }

    @Override public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Override public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override public void onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }
}
