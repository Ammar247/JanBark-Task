// Generated by data binding compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.myapplication.R;
import com.example.task.adapter.WordAdapterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListWordBinding extends ViewDataBinding {
  @Bindable
  protected WordAdapterViewModel mViewModel;

  protected ListWordBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable WordAdapterViewModel viewModel);

  @Nullable
  public WordAdapterViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListWordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_word, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListWordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListWordBinding>inflateInternal(inflater, R.layout.list_word, root, attachToRoot, component);
  }

  @NonNull
  public static ListWordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_word, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListWordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListWordBinding>inflateInternal(inflater, R.layout.list_word, null, false, component);
  }

  public static ListWordBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListWordBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListWordBinding)bind(component, view, R.layout.list_word);
  }
}
