// Generated by view binder compiler. Do not edit!
package com.example.biataplon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.biataplon.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddAddressBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button adAddAddress;

  @NonNull
  public final EditText adAddress;

  @NonNull
  public final EditText adCity;

  @NonNull
  public final EditText adCode;

  @NonNull
  public final EditText adName;

  @NonNull
  public final EditText adPhone;

  @NonNull
  public final Toolbar addAddressToolbar;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextInputLayout textInputLayout4;

  @NonNull
  public final TextInputLayout textInputLayout5;

  @NonNull
  public final TextInputLayout textInputLayout6;

  @NonNull
  public final TextView textView8;

  private ActivityAddAddressBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button adAddAddress, @NonNull EditText adAddress, @NonNull EditText adCity,
      @NonNull EditText adCode, @NonNull EditText adName, @NonNull EditText adPhone,
      @NonNull Toolbar addAddressToolbar, @NonNull TextInputLayout textInputLayout3,
      @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5,
      @NonNull TextInputLayout textInputLayout6, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.adAddAddress = adAddAddress;
    this.adAddress = adAddress;
    this.adCity = adCity;
    this.adCode = adCode;
    this.adName = adName;
    this.adPhone = adPhone;
    this.addAddressToolbar = addAddressToolbar;
    this.textInputLayout3 = textInputLayout3;
    this.textInputLayout4 = textInputLayout4;
    this.textInputLayout5 = textInputLayout5;
    this.textInputLayout6 = textInputLayout6;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_address, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddAddressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_add_address;
      Button adAddAddress = ViewBindings.findChildViewById(rootView, id);
      if (adAddAddress == null) {
        break missingId;
      }

      id = R.id.ad_address;
      EditText adAddress = ViewBindings.findChildViewById(rootView, id);
      if (adAddress == null) {
        break missingId;
      }

      id = R.id.ad_city;
      EditText adCity = ViewBindings.findChildViewById(rootView, id);
      if (adCity == null) {
        break missingId;
      }

      id = R.id.ad_code;
      EditText adCode = ViewBindings.findChildViewById(rootView, id);
      if (adCode == null) {
        break missingId;
      }

      id = R.id.ad_name;
      EditText adName = ViewBindings.findChildViewById(rootView, id);
      if (adName == null) {
        break missingId;
      }

      id = R.id.ad_phone;
      EditText adPhone = ViewBindings.findChildViewById(rootView, id);
      if (adPhone == null) {
        break missingId;
      }

      id = R.id.add_address_toolbar;
      Toolbar addAddressToolbar = ViewBindings.findChildViewById(rootView, id);
      if (addAddressToolbar == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textInputLayout4;
      TextInputLayout textInputLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout4 == null) {
        break missingId;
      }

      id = R.id.textInputLayout5;
      TextInputLayout textInputLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout5 == null) {
        break missingId;
      }

      id = R.id.textInputLayout6;
      TextInputLayout textInputLayout6 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityAddAddressBinding((ConstraintLayout) rootView, adAddAddress, adAddress,
          adCity, adCode, adName, adPhone, addAddressToolbar, textInputLayout3, textInputLayout4,
          textInputLayout5, textInputLayout6, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
