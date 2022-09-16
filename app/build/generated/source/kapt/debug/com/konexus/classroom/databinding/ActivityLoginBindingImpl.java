package com.konexus.classroom.databinding;
import com.konexus.classroom.R;
import com.konexus.classroom.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.konexus.classroom.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_login_study, 12);
        sViewsWithIds.put(R.id.tv_login_classroom, 13);
        sViewsWithIds.put(R.id.cl_login_switch, 14);
        sViewsWithIds.put(R.id.ll_login_form, 15);
        sViewsWithIds.put(R.id.tv_login_or, 16);
        sViewsWithIds.put(R.id.btn_login_google, 17);
        sViewsWithIds.put(R.id.tv_login_account, 18);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.emailEditText.getValue()
            //         is viewModel.emailEditText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.emailEditText
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailEditText = null;
            // viewModel.emailEditText.getValue()
            java.lang.String viewModelEmailEditTextGetValue = null;
            // viewModel
            com.konexus.classroom.ui.auth.login.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.emailEditText != null
            boolean viewModelEmailEditTextJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEmailEditText = viewModel.getEmailEditText();

                viewModelEmailEditTextJavaLangObjectNull = (viewModelEmailEditText) != (null);
                if (viewModelEmailEditTextJavaLangObjectNull) {




                    viewModelEmailEditText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.passwordEditText.getValue()
            //         is viewModel.passwordEditText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewModel.passwordEditText
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordEditText = null;
            // viewModel
            com.konexus.classroom.ui.auth.login.LoginViewModel viewModel = mViewModel;
            // viewModel.passwordEditText.getValue()
            java.lang.String viewModelPasswordEditTextGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.passwordEditText != null
            boolean viewModelPasswordEditTextJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPasswordEditText = viewModel.getPasswordEditText();

                viewModelPasswordEditTextJavaLangObjectNull = (viewModelPasswordEditText) != (null);
                if (viewModelPasswordEditTextJavaLangObjectNull) {




                    viewModelPasswordEditText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.ProgressBar) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            );
        this.btnLoginLogin.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.pbLoginLoadinglogin.setTag(null);
        this.tiLoginEmail.setTag(null);
        this.tiLoginPassword.setTag(null);
        this.tiLoginPhoneNumber.setTag(null);
        this.tvLoginEmail.setTag(null);
        this.tvLoginForgot.setTag(null);
        this.tvLoginPhone.setTag(null);
        this.tvLoginSignup.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.konexus.classroom.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.konexus.classroom.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.konexus.classroom.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.konexus.classroom.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.konexus.classroom.ui.auth.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.konexus.classroom.ui.auth.login.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsEmailTabActive((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsEmailTabActive1((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelPasswordEditText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelLoadingEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelEmailEditText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelIsPhoneTabActive((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsEmailTabActive(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEmailTabActive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsEmailTabActive1(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEmailTabActive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPasswordEditText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPasswordEditText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoadingEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoadingEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmailEditText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEmailEditText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsPhoneTabActive(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsPhoneTabActive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEmailTabActive = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEmailTabActive1 = null;
        int viewModelIsEmailTabActiveViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsEmailTabActiveGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmailTabActiveGetValue = false;
        int viewModelLoadingEnabledViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordEditText = null;
        java.lang.Boolean viewModelLoadingEnabledGetValue = null;
        java.lang.Boolean viewModelIsPhoneTabActiveGetValue = null;
        java.lang.String viewModelPasswordEditTextGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoadingEnabled = null;
        int viewModelIsPhoneTabActiveViewVISIBLEViewGONE = 0;
        int viewModelLoadingEnabledViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailEditText = null;
        java.lang.String viewModelEmailEditTextGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsPhoneTabActiveGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsPhoneTabActive = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue = false;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxViewModelIsEmailTabActiveGetValue1 = false;
        java.lang.Boolean ViewModelIsEmailTabActiveGetValue1 = null;
        com.konexus.classroom.ui.auth.login.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEmailTabActive
                        viewModelIsEmailTabActive = viewModel.isEmailTabActive();
                    }
                    updateLiveDataRegistration(0, viewModelIsEmailTabActive);


                    if (viewModelIsEmailTabActive != null) {
                        // read viewModel.isEmailTabActive.getValue()
                        viewModelIsEmailTabActiveGetValue = viewModelIsEmailTabActive.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmailTabActive.getValue())
                    AndroidxDatabindingViewDataBindingSafeUnboxViewModelIsEmailTabActiveGetValue1 = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEmailTabActiveGetValue);
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEmailTabActive()
                        ViewModelIsEmailTabActive1 = viewModel.isEmailTabActive();
                    }
                    updateLiveDataRegistration(1, ViewModelIsEmailTabActive1);


                    if (ViewModelIsEmailTabActive1 != null) {
                        // read viewModel.isEmailTabActive().getValue()
                        ViewModelIsEmailTabActiveGetValue1 = ViewModelIsEmailTabActive1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmailTabActive().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmailTabActiveGetValue = androidx.databinding.ViewDataBinding.safeUnbox(ViewModelIsEmailTabActiveGetValue1);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmailTabActiveGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmailTabActive().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsEmailTabActiveViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmailTabActiveGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordEditText
                        viewModelPasswordEditText = viewModel.getPasswordEditText();
                    }
                    updateLiveDataRegistration(2, viewModelPasswordEditText);


                    if (viewModelPasswordEditText != null) {
                        // read viewModel.passwordEditText.getValue()
                        viewModelPasswordEditTextGetValue = viewModelPasswordEditText.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loadingEnabled
                        viewModelLoadingEnabled = viewModel.getLoadingEnabled();
                    }
                    updateLiveDataRegistration(3, viewModelLoadingEnabled);


                    if (viewModelLoadingEnabled != null) {
                        // read viewModel.loadingEnabled.getValue()
                        viewModelLoadingEnabledGetValue = viewModelLoadingEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoadingEnabledGetValue);
                if((dirtyFlags & 0xc8L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoadingEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.GONE : View.VISIBLE
                    viewModelLoadingEnabledViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingEnabledGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.emailEditText
                        viewModelEmailEditText = viewModel.getEmailEditText();
                    }
                    updateLiveDataRegistration(4, viewModelEmailEditText);


                    if (viewModelEmailEditText != null) {
                        // read viewModel.emailEditText.getValue()
                        viewModelEmailEditTextGetValue = viewModelEmailEditText.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isPhoneTabActive
                        viewModelIsPhoneTabActive = viewModel.isPhoneTabActive();
                    }
                    updateLiveDataRegistration(5, viewModelIsPhoneTabActive);


                    if (viewModelIsPhoneTabActive != null) {
                        // read viewModel.isPhoneTabActive.getValue()
                        viewModelIsPhoneTabActiveGetValue = viewModelIsPhoneTabActive.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPhoneTabActive.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsPhoneTabActiveGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsPhoneTabActiveGetValue);
                if((dirtyFlags & 0xe0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsPhoneTabActiveGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPhoneTabActive.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsPhoneTabActiveViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsPhoneTabActiveGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnLoginLogin.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            this.tvLoginEmail.setOnClickListener(mCallback5);
            this.tvLoginPhone.setOnClickListener(mCallback6);
            this.tvLoginSignup.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            this.btnLoginLogin.setVisibility(viewModelLoadingEnabledViewGONEViewVISIBLE);
            this.pbLoginLoadinglogin.setVisibility(viewModelLoadingEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelEmailEditTextGetValue);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelPasswordEditTextGetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.tiLoginEmail.setVisibility(viewModelIsEmailTabActiveViewVISIBLEViewGONE);
            this.tiLoginPassword.setVisibility(viewModelIsEmailTabActiveViewVISIBLEViewGONE);
            this.tvLoginForgot.setVisibility(viewModelIsEmailTabActiveViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.tiLoginPhoneNumber.setVisibility(viewModelIsPhoneTabActiveViewVISIBLEViewGONE);
            com.konexus.classroom.binding.TextViewBindingKt.setBackground(this.tvLoginPhone, androidxDatabindingViewDataBindingSafeUnboxViewModelIsPhoneTabActiveGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            com.konexus.classroom.binding.TextViewBindingKt.setBackground(this.tvLoginEmail, AndroidxDatabindingViewDataBindingSafeUnboxViewModelIsEmailTabActiveGetValue1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.konexus.classroom.ui.auth.login.LoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.phoneTabOnClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.konexus.classroom.ui.auth.login.LoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.emailTabOnClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.konexus.classroom.ui.auth.login.LoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.signUpOnClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.konexus.classroom.ui.auth.login.LoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.loginButtonOnClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isEmailTabActive
        flag 1 (0x2L): viewModel.isEmailTabActive()
        flag 2 (0x3L): viewModel.passwordEditText
        flag 3 (0x4L): viewModel.loadingEnabled
        flag 4 (0x5L): viewModel.emailEditText
        flag 5 (0x6L): viewModel.isPhoneTabActive
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmailTabActive().getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmailTabActive().getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPhoneTabActive.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPhoneTabActive.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loadingEnabled.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}