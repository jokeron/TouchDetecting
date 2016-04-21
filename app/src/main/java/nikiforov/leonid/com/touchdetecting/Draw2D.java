package nikiforov.leonid.com.touchdetecting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by work on 21.04.16.
 */
public class Draw2D extends View {
    public Draw2D(Context context){
        super(context);
        int canvasWidth;
        int canvasHeight;
    }
    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    int canvasWidth;
    int canvasHeight;


    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //узнаем высоту и ширину экрана
        canvasWidth = canvas.getWidth();
        canvasHeight = canvas.getHeight();

        //выбор инструмента ЗАЛИВКА
        mPaint.setStyle(Paint.Style.FILL);

        //закрашиваем холст белым
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        //рисуем солнце
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(Math.round(canvasWidth*0.9), Math.round(canvasHeight*0.1), Math.round(canvasHeight*0.05), mPaint);

        //рисуем лужайку
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(20, 650, 950, 680, mPaint);

        //рисуем небо
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(20, 20, 950, 650, mPaint);

        //рисуем надпись
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(32);
        canvas.drawText("Лужайка только для котов!", 30, 648, mPaint);

        //рисуем наклонную надпись
        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(27);
        String sunLights = "Лучи солнца";
        int x = 890;
        int y = 190;
        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());
        canvas.drawText(sunLights,x,y,mPaint);

        //восстанавливаем холст
        canvas.restore();
    }

}
