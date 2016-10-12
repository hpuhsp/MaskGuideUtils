package com.reesehu.lightguideviewlib.shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import com.reesehu.lightguideviewlib.HighLight;

/**
 * Created by caizepeng on 16/8/20.
 */
public class CircleLightShape implements HighLight.LightShape {
    @Override
    public void shape(HighLight.ViewPosInfo viewPosInfo, Canvas canvas, Paint paint) {
//        paint.setMaskFilter(new BlurMaskFilter(15, BlurMaskFilter.Blur.SOLID));
        RectF rectF = viewPosInfo.rectF;
        canvas.drawCircle(rectF.left + (rectF.width() / 2), rectF.top + (rectF.height() / 2),
                Math.max(rectF.width(), rectF.height()) / 2, paint);
    }
}
