package com.konexus.classroom;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.konexus.classroom.databinding.ActivityAuthBindingImpl;
import com.konexus.classroom.databinding.ActivityLoginBindingImpl;
import com.konexus.classroom.databinding.ActivityOtpBindingImpl;
import com.konexus.classroom.databinding.ActivityRegisterEmailBindingImpl;
import com.konexus.classroom.databinding.ActivityRegisterListBindingImpl;
import com.konexus.classroom.databinding.ActivityRegisterPhoneBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAUTH = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ACTIVITYOTP = 3;

  private static final int LAYOUT_ACTIVITYREGISTEREMAIL = 4;

  private static final int LAYOUT_ACTIVITYREGISTERLIST = 5;

  private static final int LAYOUT_ACTIVITYREGISTERPHONE = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.konexus.classroom.R.layout.activity_auth, LAYOUT_ACTIVITYAUTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.konexus.classroom.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.konexus.classroom.R.layout.activity_otp, LAYOUT_ACTIVITYOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.konexus.classroom.R.layout.activity_register_email, LAYOUT_ACTIVITYREGISTEREMAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.konexus.classroom.R.layout.activity_register_list, LAYOUT_ACTIVITYREGISTERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.konexus.classroom.R.layout.activity_register_phone, LAYOUT_ACTIVITYREGISTERPHONE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAUTH: {
          if ("layout/activity_auth_0".equals(tag)) {
            return new ActivityAuthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_auth is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYOTP: {
          if ("layout/activity_otp_0".equals(tag)) {
            return new ActivityOtpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_otp is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTEREMAIL: {
          if ("layout/activity_register_email_0".equals(tag)) {
            return new ActivityRegisterEmailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register_email is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTERLIST: {
          if ("layout/activity_register_list_0".equals(tag)) {
            return new ActivityRegisterListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTERPHONE: {
          if ("layout/activity_register_phone_0".equals(tag)) {
            return new ActivityRegisterPhoneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register_phone is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_auth_0", com.konexus.classroom.R.layout.activity_auth);
      sKeys.put("layout/activity_login_0", com.konexus.classroom.R.layout.activity_login);
      sKeys.put("layout/activity_otp_0", com.konexus.classroom.R.layout.activity_otp);
      sKeys.put("layout/activity_register_email_0", com.konexus.classroom.R.layout.activity_register_email);
      sKeys.put("layout/activity_register_list_0", com.konexus.classroom.R.layout.activity_register_list);
      sKeys.put("layout/activity_register_phone_0", com.konexus.classroom.R.layout.activity_register_phone);
    }
  }
}
