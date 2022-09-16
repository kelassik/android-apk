package com.konexus.classroom.databinding;
import com.konexus.classroom.R;
import com.konexus.classroom.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterListBindingImpl extends ActivityRegisterListBinding implements com.konexus.classroom.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_register_list_study, 4);
        sViewsWithIds.put(R.id.tv_register_list_classroom, 5);
        sViewsWithIds.put(R.id.btn_register_list_google, 6);
        sViewsWithIds.put(R.id.tv_register_list_account, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            );
        this.btnRegisterListEmail.setTag(null);
        this.btnRegisterListNumber.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvLoginSignup.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.konexus.classroom.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.konexus.classroom.generated.callback.OnClickListener(this, 3);
        mCallback2 = new com.konexus.classroom.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((com.konexus.classroom.ui.auth.register.RegisterListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.konexus.classroom.ui.auth.register.RegisterListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.konexus.classroom.ui.auth.register.RegisterListViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnRegisterListEmail.setOnClickListener(mCallback3);
            this.btnRegisterListNumber.setOnClickListener(mCallback2);
            this.tvLoginSignup.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.konexus.classroom.ui.auth.register.RegisterListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.registerEmailOnClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.konexus.classroom.ui.auth.register.RegisterListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.signInOnClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.konexus.classroom.ui.auth.register.RegisterListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.registerPhoneOnClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}