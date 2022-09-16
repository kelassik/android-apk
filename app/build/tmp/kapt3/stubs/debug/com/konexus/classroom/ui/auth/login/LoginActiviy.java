package com.konexus.classroom.ui.auth.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.konexus.classroom.R;
import com.konexus.classroom.activity.BarcodeActivity;
import com.konexus.classroom.databinding.ActivityLoginBinding;
import com.konexus.classroom.ui.auth.otp.OtpActivity;
import com.konexus.classroom.ui.auth.register.RegisterListActivity;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/konexus/classroom/ui/auth/login/LoginActiviy;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "loginActivityBinding", "Lcom/konexus/classroom/databinding/ActivityLoginBinding;", "loginViewModel", "Lcom/konexus/classroom/ui/auth/login/LoginViewModel;", "getLoginViewModel", "()Lcom/konexus/classroom/ui/auth/login/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "loginEmailSuccess", "", "loginPhoneSuccess", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "signUpOnClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginActiviy extends androidx.appcompat.app.AppCompatActivity {
    private com.konexus.classroom.databinding.ActivityLoginBinding loginActivityBinding;
    private final kotlin.Lazy loginViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActiviy() {
        super();
    }
    
    private final com.konexus.classroom.ui.auth.login.LoginViewModel getLoginViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loginPhoneSuccess() {
    }
    
    private final void loginEmailSuccess() {
    }
    
    private final void signUpOnClick() {
    }
}