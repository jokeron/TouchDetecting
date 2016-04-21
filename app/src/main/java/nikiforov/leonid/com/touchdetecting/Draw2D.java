package nikiforov.leonid.com.touchdetecting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by work on 21.04.16.
 */
public class Draw2D extends View {
    public Draw2D(Context context){
        super(context);

    }
    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    int canvasWidth;
    int canvasHeight;
    Path path = new Path();
    //координаты круга
    float circleX;
    float circleY;

    //координаты для рисования другого круга
    float circleX1;
    float circleY1;




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

        //рисуем лужайку
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(20, Math.round(canvasHeight * 0.9), canvasWidth - 20, canvasHeight, mPaint);

        //рисуем небо
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(20, 20, canvasWidth-20, Math.round(canvasHeight*0.9), mPaint);

        //рисуем солнце
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(Math.round(canvasWidth - canvasHeight*0.1), Math.round(canvasHeight * 0.1), Math.round(canvasHeight * 0.05), mPaint);

        //рисуем надпись
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(50);
        canvas.drawText("Лужайка только для котов!", 30, Math.round(canvasHeight*0.85), mPaint);

        //рисуем наклонную надпись
        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(35);
        String sunLights = "Лучи солнца";
        int x = (int)Math.round(canvasWidth*0.65);
        int y = (int)Math.round(canvasHeight*0.35);
        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());
        canvas.drawText(sunLights, x, y, mPaint);

        //восстанавливаем холст
        canvas.restore();

        //пишем текст по линии
        path.reset();
        path.moveTo(Math.round(canvasWidth - (canvasHeight * 0.35)), Math.round(canvasHeight * 0.35));
        path.lineTo(Math.round(canvasWidth - canvasHeight * 0.1), Math.round(canvasHeight * 0.1));
        canvas.drawTextOnPath("Лучи солнца!!!!!", path, 0, 0, mPaint);

        //рисуем круг
        mPaint.setColor(Color.WHITE);
        circleX = (float)(canvasWidth*0.5);
        circleY = (float)(canvasHeight*0.5);
        path.reset();
        path.addCircle(circleX,circleY,100, Path.Direction.CW);



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
