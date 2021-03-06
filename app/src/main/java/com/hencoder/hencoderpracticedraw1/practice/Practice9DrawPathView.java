package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    Path mPath = new Path();
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        mPath.arcTo(300, 300, 400, 400, 150, 220, true);
        mPath.arcTo(400, 300, 500, 400, 180, 220, false);
        mPath.lineTo(400, 500);
        mPath.close();
        canvas.drawPath(mPath, mPaint);
    }
}
