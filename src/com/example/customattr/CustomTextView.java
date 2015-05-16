package com.example.customattr;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends TextView {

	public CustomTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.custom);
		String name = a.getString(R.styleable.custom_name);
		a.recycle();
		setText("ÐÕÃû£º"+name);
	}

}
