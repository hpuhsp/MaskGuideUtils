package com.reesehu.maskguideutils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.reesehu.lightguideviewlib.HighLight;
import com.reesehu.lightguideviewlib.position.OnTopPosCallback;
import com.reesehu.lightguideviewlib.shape.RectLightShape;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private HighLight mHighLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        initView();
    }

    /**
     *
     */
    private void initView() {
    }

    @Override
    protected void onResume() {
        super.onResume();

        showMaskGuide();
    }

    /**
     * 显示
     */
    private void showMaskGuide() {
        mHighLight = new HighLight(this);
        mHighLight
                .autoRemove(true)
                .intercept(true)
                .anchor(findViewById(R.id.activity_main_root))
                .enableNext()
                .addHighLight(R.id.button1, R.layout.mask_test_layout, new OnTopPosCallback(1f), new RectLightShape())
                .addHighLight(R.id.button2, R.layout.mask_test_layout, new OnTopPosCallback(1f), new RectLightShape())
                .addHighLight(R.id.button3, R.layout.mask_test_layout, new OnTopPosCallback(1f), new RectLightShape())
                .setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        Toast.makeText(mContext, "---12----", Toast.LENGTH_SHORT).show();
                        mHighLight.remove();
                    }
                });
        mHighLight.show();
    }

    /**
     * 响应所有R.id.iv_known的控件的点击事件
     * <p>
     * 移除高亮布局
     * </p>
     *
     * @param view
     */
    public void clickKnown(View view) {
        if (mHighLight.isNext())//如果开启next模式
        {
            mHighLight.next();
        } else {
            mHighLight.remove();
        }
    }

    public void clickButton(View view) {
        Intent intent = new Intent(mContext, TestActivity.class);
        startActivity(intent);
    }

}
