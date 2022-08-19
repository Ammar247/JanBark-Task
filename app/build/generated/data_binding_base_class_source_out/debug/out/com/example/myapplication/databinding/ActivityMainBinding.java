// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btn1;

  @NonNull
  public final Button btn2;

  @NonNull
  public final FrameLayout layoutBannerMain;

  @NonNull
  public final ConstraintLayout layoutProgressHolder;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textTranslate;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btn1,
      @NonNull Button btn2, @NonNull FrameLayout layoutBannerMain,
      @NonNull ConstraintLayout layoutProgressHolder, @NonNull ProgressBar progressBar,
      @NonNull TextView textTranslate) {
    this.rootView = rootView;
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.layoutBannerMain = layoutBannerMain;
    this.layoutProgressHolder = layoutProgressHolder;
    this.progressBar = progressBar;
    this.textTranslate = textTranslate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btn_2;
      Button btn2 = ViewBindings.findChildViewById(rootView, id);
      if (btn2 == null) {
        break missingId;
      }

      id = R.id.layout_banner_main;
      FrameLayout layoutBannerMain = ViewBindings.findChildViewById(rootView, id);
      if (layoutBannerMain == null) {
        break missingId;
      }

      id = R.id.layout_progress_holder;
      ConstraintLayout layoutProgressHolder = ViewBindings.findChildViewById(rootView, id);
      if (layoutProgressHolder == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.text_translate;
      TextView textTranslate = ViewBindings.findChildViewById(rootView, id);
      if (textTranslate == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btn1, btn2, layoutBannerMain,
          layoutProgressHolder, progressBar, textTranslate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}