package com.reesehu.lightguideviewlib.shape;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.reesehu.lightguideviewlib.HighLight;

/**
 * Created by caizepeng on 16/8/20.
 */
public class RectLightShape implements HighLight.LightShape {
    @Override
    public void shape(Bitmap bitmap, HighLight.ViewPosInfo viewPosInfo) {
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setMaskFilter(new BlurMaskFilter(15, BlurMaskFilter.Blur.SOLID));
        canvas.drawRoundRect(viewPosInfo.rectF, 6, 6, paint);
    }
}
