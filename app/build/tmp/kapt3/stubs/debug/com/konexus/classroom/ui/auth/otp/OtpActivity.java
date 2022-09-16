package com.konexus.classroom.ui.auth.otp;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.konexus.classroom.R;
import com.konexus.classroom.databinding.ActivityOtpBinding;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u001c\u0010\u0011\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001e\u0010\u0011\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/konexus/classroom/ui/auth/otp/OtpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "otpActivityBinding", "Lcom/konexus/classroom/databinding/ActivityOtpBinding;", "otpViewModel", "Lcom/konexus/classroom/ui/auth/otp/OtpViewModel;", "getOtpViewModel", "()Lcom/konexus/classroom/ui/auth/otp/OtpViewModel;", "otpViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOtpFailed", "onOtpSuccess", "changeFocus", "Landroid/text/Editable;", "next", "Landroid/widget/EditText;", "previous", "destination", "lastPosition", "", "app_debug"})
public final class OtpActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.konexus.classroom.databinding.ActivityOtpBinding otpActivityBinding;
    private final kotlin.Lazy otpViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public OtpActivity() {
        super();
    }
    
    private final com.konexus.classroom.ui.auth.otp.OtpViewModel getOtpViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onOtpFailed() {
    }
    
    private final void onOtpSuccess() {
    }
    
    private final void changeFocus(android.text.Editable $this$changeFocus, android.widget.EditText destination, boolean lastPosition) {
    }
    
    private final void changeFocus(android.text.Editable $this$changeFocus, android.widget.EditText next, android.widget.EditText previous) {
    }
}