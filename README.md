# declare-styleable-Android-demo

#Decalre-style Android自定义属性
学习这个是因为我看到好多自定义控件都用到了自定义属性，那么接下来我们就从实战的角度出发，看怎么才能创建自定义属性并且运用起来。
第一步：巧妇难为无米之炊，首先我们得写一个自定义属性的xml出来，书写的方法如下所示：

```
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <declare-styleable name="custom">
        <attr name="name" format="reference"></attr>
        <attr name="nextname" format="reference" />
    </declare-styleable>

</resources>
```

最外面的标签，declare-styleable  中文翻译“样式 申明”通过为其name 属性设置内容，我这个比较随便起名为custom，请大家记住将来在我们自定义view中就是通过这个name 来查找到这个样式。接着 我们可以看到里面包裹的子标签就是<attr/> 中文意思“属性”，name 我们就不说了，主要是看到 format 就是格式的意思，也就是说我们定义的这些属性的格式，Android支持哪些格式呢：以下来源于网络
  

 - 列表内容
 - reference：参考某一资源ID。
    （1）属性定义：
```
       <declare-styleable name = "名称">
                   <attr name = "background" format = "reference" />
            </declare-styleable>
```
         
    （2）属性使用：
```
     <ImageView
                     android:layout_width = "42dip"
                     android:layout_height = "42dip"
                     android:background = "@drawable/图片ID"
                     />
```
            
 - color：颜色值。
    （1）属性定义：
```
    <declare-styleable name = "名称">
                   <attr name = "textColor" format = "color" />
            </declare-styleable>
```
            
    （2）属性使用：
```
    <TextView
                     android:layout_width = "42dip"
                     android:layout_height = "42dip"
                     android:textColor = "#00FF00"
                     />
```
            
 - boolean：布尔值。
    （1）属性定义：
```
            <declare-styleable name = "名称">
                   <attr name = "focusable" format = "boolean" />
            </declare-styleable>
```
    （2）属性使用：
   

```
         <Button
                    android:layout_width = "42dip"
                    android:layout_height = "42dip"
                    android:focusable = "true"
                    />
```

 - dimension：尺寸值。
    （1）属性定义：
 

```
           <declare-styleable name = "名称">
                   <attr name = "layout_width" format = "dimension" />
            </declare-styleable>
```
    （2）属性使用：
       

```
     <Button
                    android:layout_width = "42dip"
                    android:layout_height = "42dip"
                    />
```

 - float：浮点值。
    （1）属性定义：
  

```
          <declare-styleable name = "AlphaAnimation">
                   <attr name = "fromAlpha" format = "float" />
                   <attr name = "toAlpha" format = "float" />
            </declare-styleable>
```
    （2）属性使用：
      

```
      <alpha
                   android:fromAlpha = "1.0"
                   android:toAlpha = "0.7"
                   />
```

 - integer：整型值。
    （1）属性定义：
```
            <declare-styleable name = "AnimatedRotateDrawable">
                   <attr name = "visible" />
                   <attr name = "frameDuration" format="integer" />
                   <attr name = "framesCount" format="integer" />
                   <attr name = "pivotX" />
                   <attr name = "pivotY" />
                   <attr name = "drawable" />
            </declare-styleable>
```
    （2）属性使用：
       

```
     <animated-rotate 
                   xmlns:android = "http://schemas.android.com/apk/res/android"  
                   android:drawable = "@drawable/图片ID"  
                   android:pivotX = "50%"  
                   android:pivotY = "50%"  
                   android:framesCount = "12"  
                   android:frameDuration = "100" 
                   />
```

 - string：字符串。
    （1）属性定义：
  

```
          <declare-styleable name = "MapView">
                   <attr name = "apiKey" format = "string" />
            </declare-styleable>
```
    （2）属性使用：
 

```
           <com.google.android.maps.MapView
                    android:layout_width = "fill_parent"
                    android:layout_height = "fill_parent"
                    android:apiKey = "0jOkQ80oD1JL9C6HAja99uGXCRiS2CGjKO_bc_g"
                    />
```

 - fraction：百分数。
    （1）属性定义：
```
            <declare-styleable name="RotateDrawable">
                   <attr name = "visible" />
                   <attr name = "fromDegrees" format = "float" />
                   <attr name = "toDegrees" format = "float" />
                   <attr name = "pivotX" format = "fraction" />
                   <attr name = "pivotY" format = "fraction" />
                   <attr name = "drawable" />
            </declare-styleable>
```
    （2）属性使用：
    

```
        <rotate 
                   xmlns:android = "http://schemas.android.com/apk/res/android" 
　　             android:interpolator = "@anim/动画ID" 
                   android:fromDegrees = "0" 
　　             android:toDegrees = "360" 
                   android:pivotX = "200%" 
                   android:pivotY = "300%" 
　　             android:duration = "5000" 
                   android:repeatMode = "restart" 
                   android:repeatCount = "infinite"
                   /> 
```

 - enum：枚举值。
    （1）属性定义：
  

```
          <declare-styleable name="名称">
                   <attr name="orientation">
                          <enum name="horizontal" value="0" />
                          <enum name="vertical" value="1" />
                   </attr>            
            </declare-styleable>
```
    （2）属性使用：
  

```
          <LinearLayout 
                    xmlns:android = "http://schemas.android.com/apk/res/android"
                    android:orientation = "vertical"
                    android:layout_width = "fill_parent"
                    android:layout_height = "fill_parent"
                    >
            </LinearLayout>
```

 - flag：位或运算。
     （1）属性定义：
```
             <declare-styleable name="名称">
                    <attr name="windowSoftInputMode">
                            <flag name = "stateUnspecified" value = "0" />
                            <flag name = "stateUnchanged" value = "1" />
                            <flag name = "stateHidden" value = "2" />
                            <flag name = "stateAlwaysHidden" value = "3" />
                            <flag name = "stateVisible" value = "4" />
                            <flag name = "stateAlwaysVisible" value = "5" />
                            <flag name = "adjustUnspecified" value = "0x00" />
                            <flag name = "adjustResize" value = "0x10" />
                            <flag name = "adjustPan" value = "0x20" />
                            <flag name = "adjustNothing" value = "0x30" />
                     </attr>         
             </declare-styleable>
```
     （2）属性使用：
     

```
       <activity 
                   android:name = ".StyleAndThemeActivity"
                   android:label = "@string/app_name"
                   android:windowSoftInputMode = "stateUnspecified | stateUnchanged　|　stateHidden">
                   <intent-filter>
                          <action android:name = "android.intent.action.MAIN" />
                          <category android:name = "android.intent.category.LAUNCHER" />
                   </intent-filter>
             </activity>
```
     注意：
     属性定义时可以指定多种类型值。
    （1）属性定义：
      

```
      <declare-styleable name = "名称">
                   <attr name = "background" format = "reference|color" />
            </declare-styleable>
```
    （2）属性使用：
 

```
            <ImageView
                     android:layout_width = "42dip"
                     android:layout_height = "42dip"
                     android:background = "@drawable/图片ID|#00FF00"
                     />
```

第二步：养兵千日用兵一时，看看怎么使用我们定义好的属性呢。一旦定义成功，我们就可以像使用Android自带的属性一样使用这些我们定义的属性，不过有点不同的是我们需要申明我们自己的命名空间，默认的是http://schemas.android.com/apk/res/android  而我们自定义的命名空间格式为http://schemas.android.com/apk/res/【应用包名】
示例如下

```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:custom="http://schemas.android.com/apk/res/com.example.customattr"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >

    <com.example.customattr.CustomTextView
        android:id="@+id/customTextView1"
        custom:name="@string/action_settings"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CustomTextView"
        custom:nextname="@string/hello_world" />

</RelativeLayout>
```

这里需要注意的是，xmlns:custom 其中的custom是我自定义的，这样在对应的自定义控件中，使用的时候也是通过custom：+属性名称 来使用。
第三步：怎么获取这些属性值呢，这个是一个比较重要的问题，通过view的源码部分我们可以知道
   

```
     final TypedArray a = context.obtainStyledAttributes(
                attrs, com.android.internal.R.styleable.View, defStyleAttr, defStyleRes)
<span style="font-family: Arial, Helvetica, sans-serif;">final int N = a.getIndexCount();</span>
        for (int i = 0; i < N; i++) {
            int attr = a.getIndex(i);
            switch (attr) {
                case com.android.internal.R.styleable.View_background:
                    background = a.getDrawable(attr);
                    break;
                case com.android.internal.R.styleable.View_padding:
                    padding = a.getDimensionPixelSize(attr, -1);
                    mUserPaddingLeftInitial = padding;
                    mUserPaddingRightInitial = padding;
                    leftPaddingDefined = true;
                    rightPaddingDefined = true;
                    break;
                 case com.android.internal.R.styleable.View_paddingLeft:
                    leftPadding = a.getDimensionPixelSize(attr, -1);
                    mUserPaddingLeftInitial = leftPadding;
                    leftPaddingDefined = true;
                    break;
```

可以看到通过context.obtainStyledAttributes 方法获取到一个TypedArray 数组，通过遍历既可以获取到指定的属性对应的值。
再看一下我们的示例代码。

```
	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.custom);
		String name = a.getString(R.styleable.custom_name);
		a.recycle();
		setText("姓名："+name);
	}
```

最后源码放在github上了，想看的同学，链接放在这里了
https://github.com/moon-sky/declare-styleable-Android-demo.git





