package nikiforov.leonid.com.touchdetecting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by work on 21.04.16.
 */
public class Draw2D extends View {
    public Draw2D(Context context){
        super(context);
    }
    private Paint mPaint = new Paint();
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //выбор инструмента ЗАЛИВКА
        mPaint.setStyle(Paint.Style.FILL);

        //закрашиваем холст белым
        
    }
}
