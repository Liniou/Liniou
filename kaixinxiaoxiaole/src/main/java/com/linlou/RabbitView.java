package com.linlou;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class RabbitView extends View {

    private float bitmapX;
    private float bitmapY;
    private Paint paint;

    //!构造函数
    public RabbitView(Context context) { //初始化组件
        super(context);
        bitmapX = 540;
        bitmapY = 960;
    }

    //!绘图
    @Override
    protected void onDraw(Canvas canvas) {
        paint = new Paint();
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.mipmap.yi); //位图
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
        if(bitmap.isRecycled()){ //强制回收图片
            bitmap.recycle();
        }
    }

    public void onTouchLinstener(){
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                bitmapX = motionEvent.getX();
                bitmapY = motionEvent.getY();
                invalidate();
                return true;
            }
        });
    }


    public float getBitmapX() {
        return bitmapX;
    }

    public void setBitmapX(float bitmapX) {
        this.bitmapX = bitmapX;
    }

    public float getBitmapY() {
        return bitmapY;
    }

    public void setBitmapY(float bitmapY) {
        this.bitmapY = bitmapY;
    }

}
